package com.company;

public class Question3 {
    private static int NUM_THREADS = 50;

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.reverse();
    }

    private void reverse() {
        int id = 1;
        Thread t = new Thread(new MyRunnable(id));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class MyRunnable implements Runnable {
        private int id;

        MyRunnable(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            if (id < NUM_THREADS) {
                Thread t = new Thread(new MyRunnable(id + 1));
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Hello from Thread " + id);
        }
    }
}
