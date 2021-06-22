package Lesson12;

public class HomeWork {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr1 = fillingTheArray(SIZE);
        float[] arr = fillingTheArray(SIZE);
        timerSingleThread(arr);
        timerMultiThread(arr1);
    }

    public static float[] fillingTheArray(int size) {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        return arr;
    }

    public static void timerSingleThread(float[] array) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(array[15000]);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void timerMultiThread(float[] array) {
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        long a = System.currentTimeMillis();

        System.arraycopy(array, 0, arr1, 0, HALF);
        System.arraycopy(array, HALF, arr2, 0, HALF);

        MyThread thread1 = new MyThread(arr1);
        MyThread thread2 = new MyThread(arr2);

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, array, 0, HALF);
        System.arraycopy(arr2, 0, array, HALF, HALF);
        System.out.println(array[15000]);
        System.out.println("Два потока справились за: " + (System.currentTimeMillis() - a));
    }
}
