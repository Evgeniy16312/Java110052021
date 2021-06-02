package Lesson7;

public class HomeWork7 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Boris", 10);
        Cat cat2 = new Cat("Sheba", 5);
        Plate plate = new Plate(20);

        plate.info();
        cat1.eat(plate);
        System.out.println("Кот " + cat1.name + " покушал.");
        cat2.eat(plate);
        System.out.println("Кот " + cat2.name + " покушал.");
        plate.info();


    }


}
