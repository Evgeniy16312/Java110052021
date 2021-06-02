package Lesson7;

public class Cat {
    String name;
    int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }


    public void eat() {

    }

}
