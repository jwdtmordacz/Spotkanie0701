import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {

        Integer i = 1;
        System.out.println(i.toString());

        Point point = new Point(3,4);
        System.out.println(point.toString());

        Employee employee = new Employee("Kowalski", 28, 3900);
        System.out.println(employee.toString());
    }
}
