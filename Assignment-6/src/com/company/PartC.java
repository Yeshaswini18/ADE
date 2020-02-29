package com.company;

public class PartC {
    public static void main(String[] args) {
        Pet c = new Cat("Spot","yash","black","short");
        c.setSex(1);
        String s = c.toString();
        System.out.println(s);
        Pet d = new Dog("doggie","sank","white","medium");
        d.setSex(4);
        String a = d.toString();
        System.out.println(a);
    }
}
