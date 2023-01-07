public class Adder {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,1));
        System.out.println(sum(1,1, 1));
        System.out.println(sum(1.0,1.0));
    }
}
