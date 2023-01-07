public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1.0, 2.0));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(1.0, 2.4, 3.4));
    }

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }

}
