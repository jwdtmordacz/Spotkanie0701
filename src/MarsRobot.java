public class MarsRobot {
    String status;
    int speed;
    int power;

    public MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("w bazie", 0, 4);
    }
}
