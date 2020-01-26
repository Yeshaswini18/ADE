package com.example.string;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = scanner.nextLine();
        System.out.println("Enter the character you want to count");
        char b = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b == a.charAt(i)) {
                count++;
            }
        }
        System.out.println("The string "+ a +" has " + count + " '" + b + "' ");
    }
}



