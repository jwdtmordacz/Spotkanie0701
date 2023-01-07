public class MultiplyNumbersUpdate {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        System.out.println(multiplyNumbers(number1, number2, number3));

    }

    public static int multiplyNumbers(int number1, int number2, int number3) {
        int totalNumber = number1 * number2 * number3;
        return totalNumber;
    }
}

