package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void appendFood(int foodValue) {
        food += foodValue;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public int getFood() {
        return food;
    }
}
