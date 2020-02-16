package com.company;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 0, 3, 12};
        int[] result1;
        result1 = seperateZeros(array1);
        for(int i = 0; i< result1.length; i++)
            System.out.print(result1[i] + " ");
        System.out.println();

        int[] array2 = {0, 0, 21};
        int[] result2;
        result2 = seperateZeros(array2);
        for(int i = 0; i< result2.length; i++)
            System.out.print(result2[i] + " ");
        System.out.println();

        int[] array3 = {0, 0, 0, 0, 1, 7, 3};
        int[] result3;
        result3 = seperateZeros(array3);
        for(int i = 0; i< result3.length; i++)
            System.out.print(result3[i] + " ");
        System.out.println();

        int[] array4 = {12, 0, 9, 0, 1, 0, 7, 0};
        int[] result4;
        result4 = seperateZeros(array4);
        for(int i = 0; i< result4.length; i++)
            System.out.print(result4[i] + " ");
        System.out.println();

        int[] array5 = {1, 9, 4, 10, 0, 0, 0, 0};
        int[] result5;
        result5 = seperateZeros(array5);
        for(int i = 0; i< result5.length; i++)
            System.out.print(result5[i] + " ");
        System.out.println();

        int[] array6 = {0, 0, 0, 0, 0, 0, 0};
        int[] result6;
        result6 = seperateZeros(array6);
        for(int i = 0; i< result6.length; i++)
            System.out.print(result6[i] + " ");
        System.out.println();

        int[] array7 = {1, 4, 9, 3};
        int[] result7;
        result7 = seperateZeros(array7);
        for(int i = 0; i< result7.length; i++)
            System.out.print(result7[i] + " ");
        System.out.println();
    }
    public static int[] seperateZeros(int[] array) {
        int length = array.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if(array[i] != 0) {
                array[count++] = array[i];
            }
        }

        while (count< length) {
            array[count++] = 0;
        }

        int index = -1;
        for (int k = 0; k < array .length; k++) {
            if(array[k] == 0) {
                index = k;
                break;
            }
        }
        if (index == -1){
            Arrays.sort(array);
            return array;
        }
        Arrays.sort(array, 0, index);
        return array;
    }
}
