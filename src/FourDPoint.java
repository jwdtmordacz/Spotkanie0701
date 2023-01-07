import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;
    public static void main(String[] args) {
        FourDPoint fdp = new FourDPoint();
        fdp.create(1,1,1,1);
        fdp.show();
    }

    public void create(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public void show() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
    }
}
