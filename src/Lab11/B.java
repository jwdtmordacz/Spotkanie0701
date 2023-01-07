package Lab11;

public class B extends A {
    public B() {
        System.out.println("Konstruktor B()");
    }

    public B(boolean flag) {
        super(true);
        if(flag == false) {
            System.out.println("Konstruktor B(" + flag + ")");
        }
    }
}
