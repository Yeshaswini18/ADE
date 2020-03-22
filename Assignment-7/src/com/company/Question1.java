package com.company;

public class Question1 {

    public static void main(String[] args) throws Exception {
	    int[] array = {1,2,3,4,5};
	    int length = array.length;
	    int index = 5;
	    try {
            System.out.println(array[5]);
        } catch(ArrayIndexOutOfBoundsException e ) {
            throw new MyIndexOutOfBoundException(0, length, index);
        }
    }
}
