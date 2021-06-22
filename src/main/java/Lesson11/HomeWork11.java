package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeWork11 {
    public static void main(String[] args) {

//        Integer[] array = {1, 4, 5, 3, 2, 1, 5};
//        String[] stringsArray = {"a", "b", "c", "d", "e"};
//        replacement(array, 3, 6);
//        replacement(stringsArray, 2, 4);
//        arrayToList(stringsArray);

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        appleBox.addFruit(new Apple(),5);
        orangeBox.addFruit(new Orange(),3);
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox.getWeight());
        orangeBox.changeBox(orangeBox1);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());
    }


    public static void replacement(Object[] arr, int position1, int position2) {
        System.out.println(Arrays.toString(arr));
        Object oldValue = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = oldValue;
        System.out.println(Arrays.toString(arr));
    }


    public static void arrayToList(Object[] arr) {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }
}
