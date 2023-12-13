import java.util.*;
import java.util.stream.Stream;

public class Game {
    private Scanner scan = new Scanner(System.in);
    private int strike = 0;
    private int ball = 0;

    public Game() {
    }
    public void start() {

        NumberGenerator rd = new NumberGenerator(); //random 클래스 겹침 random 쓰면 암됨
        ArrayList<Integer> arr = rd.number();

        while (strike < Constant.MAXBALL) {
            ball = 0;
            strike = 0;

            System.out.print("번호 3자리 입력: ");
            int number = scan.nextInt();
            if ((int) (Math.log10(number) + 1) != Constant.MAXBALL) {
                System.out.println("잘못 입력 하셨습니다! " + Constant.MAXBALL + "자리만 입력해주세요.");
                continue;
            }
            int[] arr2 = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr.get(i) == arr2[j]) {
                        ball++;
                    }
                }
                if (arr.get(i) == arr2[i]) {
                    strike++;
                    ball--;
                }
            }

        }

        System.out.println("정답입니다! 답 : " + arr);

        // 출력용 메소드
        OutputView.printresult(strike,ball);

        //restart 메소드
        restart();
    }

    public void restart() {
        System.out.println("게임을 다시 시작하시겠습니까? (1: restart / 2: finish)");
        int restart = scan.nextInt();

        Game game = new Game();
        if (restart == 1) {
            game.start();
        } else {
            System.out.println("게임을 종료합니다.");
        }
    }
}

