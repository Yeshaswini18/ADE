package com.company;

public class Question2 {
    public static void main(String[] args) {
        int sum;
        sum = addDigits(-1);
        sum = addDigits(0);
        System.out.println(sum);
        sum = addDigits(9);
        System.out.println(sum);
        sum = addDigits(27);
        System.out.println(sum);
        sum = addDigits(1234);
        System.out.println(sum);
        sum = addDigits(456789);
        System.out.println(sum);

    }

    public static int addDigits(int input) {
        if (input < 0) {
            System.out.println("Input should be greater than 0");
        }

        int sum = input;
        while (sum > 9) {
            int remainder = (sum % 10);
            int quotient = (sum / 10);

            sum = quotient + remainder ;
        }

        return sum;
    }
}
