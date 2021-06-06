package Lesson7;

public class HomeWork7 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Boris", 10);
        Cat cat2 = new Cat("Sheba", 15);
        Plate plate = new Plate(55);

//        plate.info();
//        cat1.eat(plate);
//        cat2.eat(plate);
//        plate.info();
//        plate.appendFood(20);
//        plate.info();
//        cat2.eat(plate);
//        plate.info();

        Cat[] cats = {
                new Cat("gavr", 30),
                new Cat("bars", 50),
                new Cat("rox", 30),
                new Cat("myrzik", 10),
                new Cat("glasha", 25),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}
