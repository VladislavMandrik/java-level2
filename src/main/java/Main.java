import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;

        oneThread(SIZE);
        twoThreads(SIZE, HALF);
    }

    public static void oneThread(int s) {
        float[] arr = new float[s];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void twoThreads(int s, int h) {
        float[] arr = new float[s];
        Arrays.fill(arr, 1);
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        float[] arr3 = new float[s];
        System.arraycopy(arr1, 0, arr3, 0, h);
        System.arraycopy(arr2, 0, arr3, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }


}

