package Lesson2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
        replacement();
        System.out.println(Arrays.toString(feelingTheArray()));
        multiplication();
        diagonalFill(7);
        int array[] = new int[]{10, 11, 88, 2, 12, 120,-777,777};
        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);
        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);
    }

    //    // 1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replacement() {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static int[] feelingTheArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiplication() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6)
                System.out.println(w[i] * 2);
            else {
                System.out.println(w[i]);
            }
        }
    }

    //    4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void diagonalFill(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == size - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
//    5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;

    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}



