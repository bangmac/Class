package Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    private int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    private boolean isOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    private String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    Fan() {

    }

    public String toString() {
        if (this.isOn()) {
            return "speed = " + this.getSpeed() + ", color = " + this.getColor() + ", fan is on";
        }
        return "fan is off";
    }
}

class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}