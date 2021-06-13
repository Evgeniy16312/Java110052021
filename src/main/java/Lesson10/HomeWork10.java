package Lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HomeWork10 {
    public static void main(String[] args) {
        String[] words = {"apple", "coffee", "ball", "apple", "town", "ball", "car", "cat", "dog", "car"};
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println("Вывод списка слов:");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        HashMap<String, Integer> map = new HashMap<>();
        for (String value : words) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        System.out.println(map);

        PhoneBook book = new PhoneBook();
        book.AddContact("Иванов", "892796756453");
        book.AddContact("Иванов", "877438432544");
        book.AddContact("Петров", "877438437775");
        book.AddContact("Сидоров", "877438438888");
        book.AddContact("Козлов", "877438439999");
        book.AddContact("Петров", "877438439999");
        book.findAndPrint("Иванов");
        book.findAndPrint("Петров");
        book.findAndPrint("Козлов");
        book.findAndPrint("Сидоров");
    }
}

