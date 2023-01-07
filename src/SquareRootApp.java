import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj parametr: ");
        int number = scanner.nextInt();
        System.out.println("Wynik to " + squareRoot(number));
    }

    public static double squareRoot(int number) {
        return Math.sqrt(number);
    }
}
