package Lesson6;

public class Dog extends Animal {

    int maxRun;
    int maxSwim;
    double maxJump;

    public Dog(String name, int maxRun, int maxSwim, float maxJump, double v) {
        super(name);
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;

    }

    public void run(int lenght) {
        if ((lenght >= 0) && (lenght <= maxRun)) {
            System.out.println(this.name + " Бежит: " + maxRun);

        } else System.out.println("Больше пробежать не может");
    }

    public void swim(int lenght) {
        if ((lenght >= 0) && (lenght <= maxSwim)) {
            System.out.println(this.name + " Бежит: " + maxSwim);
        }
    }

    public void jump(double lenght) {
        if ((lenght >= 0) && (lenght <= maxJump))
            System.out.println(this.name + " Прыгает: " + maxJump);
        else System.out.println("Выше не прыгнет");
    }

}