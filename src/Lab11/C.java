package Lab11;

public class C extends B {
    public C() {
        System.out.println("Konstruktor C()");
    }

    public C(boolean flag) {
        super(true);
        if(flag == false) {
            System.out.println("Konstruktor C(" + flag + ")");
        }
    }
}
