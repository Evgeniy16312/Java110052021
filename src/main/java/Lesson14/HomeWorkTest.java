package Lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void method1() {
        int[] actual = HomeWork.method1(new int[]{2, 8, 7, 2, 4, 3, 9, 9, 0, 1});
        Assertions.assertArrayEquals(new int[]{3, 9, 9, 0, 1}, actual);
    }

    @Test
    void method1LastElement() {
        int[] actual = HomeWork.method1(new int[]{2, 8, 7, 2, 4, 3, 9, 9, 0, 1});
        Assertions.assertEquals(1,actual[actual.length - 1]);
        }
    @Test
    void method1FirstElement() {
        int[] actual = HomeWork.method1(new int[]{2, 8, 7, 2, 4, 3, 9, 9, 0, 1});
        Assertions.assertEquals(3, actual[0]);
    }

    @Test
    void method2() {
    boolean actual = HomeWork.method2(new int[]{1, 1, 4, 4, 1});
    Assertions.assertTrue(true, String.valueOf(actual));
    }
}