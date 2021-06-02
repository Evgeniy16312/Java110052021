package Lesson7;

public class Plate {

    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

}
