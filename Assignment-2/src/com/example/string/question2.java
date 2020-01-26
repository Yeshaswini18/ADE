package com.example.string;

public class question2 {
    public static void main(String[] args) {
        question2 q2 = new question2();

        int[] numbers = {3, -5, 7, 560, 4, 32, 15};
        q2.printMaxAndMin(numbers);
    }

    public void printMaxAndMin(int[] numbers) {
        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int number : numbers) {
            if (maxValue < number) {
                maxValue = number;
            }
            if (minValue > number) {
                minValue = number;
            }
        }

        System.out.println("The Maximum value is " + maxValue + " The Minimum value is " + minValue);
    }
}
