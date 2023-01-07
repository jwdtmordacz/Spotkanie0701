package Lab11;

public class A {
    public A() {
        System.out.println("Konstruktor A()");
    }

    public A(boolean flag) {
        super();
        if(flag == false) {
            System.out.println("Konstruktor A(" + flag + ")");
        }
    }
}
