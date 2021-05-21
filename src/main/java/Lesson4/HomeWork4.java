package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    private static final char DOT_EMPTY = '.'; //пустое поле
    private static final char DOT_X = 'X'; // маркер хода игрока
    private static final char DOT_O = 'O'; //маркер хода компьютера
    private static char[][] map; // координа нанесения маркеров на игровое поле
    private static int size;  // Размер поля
    private static int block; // Сколько должно быть одинаковых значение подряд для победы
    private static final Scanner sc = new Scanner(System.in); // запрос и считывание ответов в консоле
    private static final Random rand = new Random(); // класс для генерации случайных ходов для компьютера

    public static void main(String[] args) {
            customizeGame();
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Игрок победил!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Компьютер выиграл!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }
            }
            System.out.println("Игра окончена!");
        }


//   Запрашиваем размер поля и условия победы
    public static void customizeGame() {
        do {
            System.out.print("\nВведите одно число  для указания размера желаемого игрового поля от [3х3 до 10х10]: ");
            size = sc.nextInt();
        } while (size < 3 || size > 10);

        do {
            System.out.print("\nСколько символов нужно соединить для победы? [3-" + size + "]: ");
            block = sc.nextInt();
        } while (block < 3 || block > size);

    }

    //Логика победы изменина для работы с любым размером поля.

    private static boolean checkWin(char symb) {
        for (int col = 0; col < size - block + 1; col++) {
            for (int row = 0; row < size - block + 1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }

    //Проверка диагонали
    private static boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < block; i++) {
            toright &= (map[i + offsetX][i + offsetY] == symb);
            toleft &= (map[block - i - 1 + offsetX][i + offsetY] == symb);
        }

        if (toright || toleft) return true;

        return false;
    }

//    Проверка горизонтальных и вертикальнычх линии
    private static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col = offsetX; col < block + offsetX; col++) {
            cols = true;
            rows = true;
            for (int row = offsetY; row < block + offsetY; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }

        return false;
    }
    //проверка условий заполнения игрового поля
    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    //ход компьютера
  private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сделал ход" + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }
    //ход игрока
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите число в координаты  X Y через пробел");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }
    // проверка правильности ввода координат
    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    //создание игрового поля
    private static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //отображение игрового поля
    private static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
