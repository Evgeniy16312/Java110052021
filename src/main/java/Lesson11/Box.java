package Lesson11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<T>();


    public int getWeight() {
        int weight = 0;
        for (T fruit : box) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void changeBox(Box<T> otherBox) {
        otherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}
