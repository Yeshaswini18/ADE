package com.example.string;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to add: ");
        int a = scanner.nextInt();
        int sum;
        sum = addDigits(a);
        System.out.println("Sum of the Number is: " + sum);
    }

    public static int addDigits(int input) {
        if (input < 0) {
            System.out.println("Input should be greater than 0");
        }

        int sum = input;
        while (sum > 10) {
            int remainder = (sum % 10);
            int quotient = (sum / 10);

            sum = quotient + remainder ;
        }

        return sum;
    }
}
