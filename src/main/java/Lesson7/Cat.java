package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate plate) {
        full = plate.decreaseFood(appetite);
        if (full) {
            System.out.println("Кот " + name + " покушал. Сытость: " + full);
        } else {
            System.out.println("Кот " + name + " не покушал. Сытость: " + full);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
