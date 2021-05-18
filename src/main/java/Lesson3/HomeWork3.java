package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //    1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        while (true) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Чтобы начать игру введите 1, если хотите закончить игру введите 0 ");
            int exit = scanner.nextInt();
            if (exit == 1) {
                gameQuest(3);
            } else {
                System.out.println("Вы вышли с игры");
                scanner.close();
                break;
            }
        }
    }

    public static void gameQuest(int maxAttempt) {
        int randomNumber = random.nextInt(9);
        int attempt = 0;
        System.out.println("Добро пожаловать в игру угайдайка, вам дано 3 попытки что бы отгадать число желаю удачи!");
        while (attempt < maxAttempt) {
            System.out.println("Угадайте число от 0 до 9 ");
            int value = scanner.nextInt();
            System.out.println("Вы ввели число: " + value);
            if (value == randomNumber) {
                System.out.println("Поздавляем, Вы угадали число: " + value);
                break;
            } else if (value < randomNumber) {
                attempt++;
                System.out.println("Введенное число меньше загаданного. Попробуйте еще раз. Кол-во попыток: " + (maxAttempt - attempt));
            } else {
                attempt++;
                System.out.println("Введенное число больше загаданного. Попробуйте еще раз. Кол-во попыток: " + (maxAttempt - attempt));
            }
        }
        System.out.println("Игра окончена! Правильный ответ: " + randomNumber);
    }
}
