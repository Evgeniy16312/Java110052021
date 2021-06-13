package Lesson10;


import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> pb;


    public PhoneBook() {
        this.pb = new HashMap<>();
    }

    public void AddContact(String surname, String phone) {
        HashSet<String> book = pb.getOrDefault(surname, new HashSet<>());
        book.add(phone);
        pb.put(surname, book);
    }

    public void findAndPrint(String surname) {
        System.out.println("Контакт: " + surname + "/ Телефонный номер: " + pb.getOrDefault(surname, new HashSet<>()));
    }
}




