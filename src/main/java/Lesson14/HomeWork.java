package Lesson14;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method1(new int[]{2, 8, 7, 2, 4, 3, 9, 9, 0, 1})));
        System.out.println(method2(new int[]{1, 1, 4, 4, 1}));
    }

    public static int[] method1(int[] in) {
        if (in == null)
            return null;

        int indexOfLast4 = 0;
        for (int i = 0; i < in.length; i++)
            if (in[i] == 4)
                indexOfLast4 = i;
        if (in[indexOfLast4] != 4)
            throw new RuntimeException();

        return Arrays.copyOfRange(in, indexOfLast4 + 1, in.length);
    }

    public static boolean method2(int[] ints) {
        if (ints == null)
            return false;

        boolean found1 = false, found4 = false;
        for (int elem : ints
        ) {
            if (elem == 1) found1 = true;
            else if (elem == 4) found4 = true;
            else return false;

        }
        System.out.print(Arrays.toString(ints));
        return (found1 & found4);
    }
}



