package com.company;
import java.util.Random;

public class Question2 {
    private static final int NUMBER = 4000000;
    private static final int THREAD_NUMBERS = 4;

    public static void main(String[] args) {
        int[] arr = new int[NUMBER];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

    static void generateRandomArray(int[] arr) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
        }
    }

    static long sum(int[] arr) {
        final long[] sum = new long[THREAD_NUMBERS];
        long result = 0;
        Thread[] threads = new Thread[THREAD_NUMBERS];
        int numberPerThread = NUMBER / THREAD_NUMBERS;

        for(int i = 0; i < THREAD_NUMBERS; i++) {
            threads[i] = new Thread(new myRunnable(i,i*numberPerThread, (i+1)*numberPerThread, arr,sum));
        }
        for(Thread thread : threads) {
            thread.start();
        }

        for(Thread thread: threads) {
            try {
                thread.join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(long s: sum) {
            result += s;
        }
        return result;
    }

    static class myRunnable implements Runnable {
        int id;
        int start;
        int end;
        int[] array;
        final long[] sum;

        myRunnable(int id, int start,int end, int[] array, long[] sum) {
            this.id = id;
            this.start = start;
            this.end = end;
            this.array = array;
            this.sum = sum;
        }

        @Override
        public void run(){
            long s = 0;
            for(int i = start; i < end; i++) {
                s += array[i];
            }
            sum[id] = s;
        }
    }
}
