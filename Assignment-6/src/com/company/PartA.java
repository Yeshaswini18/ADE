package com.company;

public class PartA {

    public static void main(String[] args) {
        Mreview m = new Mreview("Kill Bill", 3);
        m.addRating(5);
        m.addRating(4);
        int i = m.compareTo(m);
        String s = m.toString();
        Mreview a = new Mreview("Kill Bill", 3);
        a.addRating(5);
        a.addRating(2);
        String c = a.toString();
        System.out.println(c);

    }
}
