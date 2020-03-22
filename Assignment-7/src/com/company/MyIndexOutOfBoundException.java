package com.company;

public class MyIndexOutOfBoundException extends Exception {
    int lowerBound;
    int upperBound;
    int index;

    public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

    public String toString() {
        return "Error Message: Index: " + index + ", but Lower Bound: " + lowerBound + ", Upper Bound: " + upperBound;
    }
}
