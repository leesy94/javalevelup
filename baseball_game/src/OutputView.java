public class OutputView {
    public static void printresult(int strike,int ball) {
        String result = "";
        if (strike > 0) {
            result += "strike " + strike + " ";
        }
        if (ball > 0) {
            result += "ball " + ball;
        }
        if (ball == 0 && strike == 0) {
            result = "Nothing";
        }
        System.out.println(result);
    }
}
