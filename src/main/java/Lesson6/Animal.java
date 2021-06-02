package Lesson6;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;

    }

    abstract void run(int lenght);

    abstract void swim(int lenght);

    abstract void jump(double lenght);
}