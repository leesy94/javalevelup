import java.util.*;

public class NumberGenerator {
    Random random = new Random();
    public ArrayList<Integer> number() {


        /*int ball1 = (int) (Math.random() * 10);
        int ball2 = (int) (Math.random() * 10);
        int ball3 = (int) (Math.random() * 10);

        int[] arr = {ball1, ball2, ball3};*/

        /*int ball1 = random.nextInt(10) + 1;
        int ball2 = random.nextInt(10) + 1;
        int ball3 = random.nextInt(10) + 1;*/

        Set<Integer> set = new HashSet<>();
        while(set.size() < Constant.MAXBALL) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>(set);

        System.out.println(arr);
        return arr;
    }
}
