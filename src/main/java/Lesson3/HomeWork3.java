package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //    1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        System.out.println("Добро пожаловать в игру угайдайка, вам дано 3 попытки что бы отгадать число желаю удачи!");
        skannerTesting();
        randomTesting();
    }

    public static void skannerTesting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9 ");
        int i = sc.nextInt();
        System.out.println("Вы ввели число: " + i);
        sc.close();
    }


    public static void randomTesting() {
        Random random = new Random();
        int nextInt = random.nextInt(9);
        if (random.nextInt() == random.nextInt()) {
            System.out.println(" Поздавляем, Вы угадали число.");
        } else {
            System.out.println("К сожалению вы не угадали, попробуйте еще раз");
        }
        System.out.print("Правильный ответ: " + nextInt);

    }
}
