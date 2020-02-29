package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class PartD {
    public static void main(String[] args) {
        int[] array = {4,5,7,9,10 };
        int target = 8;
        System.out.println(findTarget(array,target));

    }
    public static int findTarget(int[] array, int target){
        int i, index = -1;
        ArrayList<Integer> resultArray = new ArrayList<>();
        try{
            if (array == null || array.length == 0){
                throw new ArrayIndexOutOfBoundsException();
            }
            else {
                for(i = 0; i < array.length ; i++){
                    int result = Math.abs(array[i] - target);
                    resultArray.add(result);
                }
                int minimum = Collections.min(resultArray);
                index = resultArray.indexOf(minimum);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The given array is empty");
        }
        return index;
    }
}
