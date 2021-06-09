package Lesson9;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWork9 {

    private static final class MyArraySizeException extends RuntimeException {
        MyArraySizeException(String message) {
            super("Row exception: " + message);
        }
    }

    private static final class NotIsNumberException extends RuntimeException {
        NotIsNumberException(String message) {
            super("Not number: " + message);
        }
    }

    public static void main(String[] args) {
        HomeWork9 main = new HomeWork9();
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "S"}
        };
        try {
            main.stringExceptionTest(correct);
//            main.stringExceptionTest(incorrect);
            main.stringExceptionTest(incorrect2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            main.calculateArray(correct);
            main.calculateArray(incorrect2);
        } catch (NotIsNumberException e) {
            e.printStackTrace();
        }
    }

    public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количесво строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException(String.format("Неверное количесво столбцов в %d-й" + " строке ", i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("-------------");
        }
    }

    public int calculateArray(String[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NotIsNumberException e) {
                    throw new NotIsNumberException(arr[i][j] + " on position + " + i + ":" + j);
                }
            }
        }
        return result;
    }
}