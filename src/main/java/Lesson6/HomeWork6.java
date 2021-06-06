package Lesson6;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Garfild", 200, 0, 2);
        cat1.run(302);
        cat1.swim(3);
        cat1.jump(1);
        System.out.println("---------------------------------------------------------");
        Dog dog = new Dog("Rex", 600, 10, 0, 0.5f);
        dog.run(500);
        dog.swim(4);
        dog.jump(5);
        System.out.println("---------------------------------------------------------");
        Bigdog bigdog = new Bigdog("Bethoveen", 400, 20, 1);
        bigdog.run(500);
        bigdog.swim(11);
        bigdog.jump(1);

    }
}
