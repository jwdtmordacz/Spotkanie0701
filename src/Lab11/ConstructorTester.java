package Lab11;

public class ConstructorTester {
    public static void main(String[] args) {
        System.out.println("---------01---------");
        new A();
        System.out.println("--------------------");
        new B();
        System.out.println("--------------------");
        new C();
        System.out.println("---------02---------");
        new A(true);
        System.out.println("--------------------");
        new B(true);
        System.out.println("--------------------");
        new C(true);
        System.out.println("---------03---------");
        new A(false);
        System.out.println("--------------------");
        new B(false);
        System.out.println("--------------------");
        new C(false);
    }
}
