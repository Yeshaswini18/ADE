package com.company;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrix = rotateClockwise(matrix);
        printMatrix(matrix);

        int[][] matrix2 = {{2,3},{8,9}};
        matrix2 = rotateClockwise(matrix2);
        printMatrix(matrix2);

        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        matrix3 = rotateClockwise(matrix3);
        printMatrix(matrix3);
    }

    public static int[][] rotateClockwise(int [][] matrix){
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for(int j = i; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < length; i++) {
            int j = 0, k = length-1;
            while (j < k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }

        return matrix;
    }

    public static void printMatrix(int [][] matrix) {
        for (int[] a : matrix){
            for(int i: a){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
