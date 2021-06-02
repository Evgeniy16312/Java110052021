package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (food < appetite) {
            return false;
        }
        food -= appetite;
        return true;
    }

    public void appendFood (int foodValue) {
        food += foodValue;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

}
