package com.company;

public class DessertShoppe {
    public static double TAX_RATES = 6.5;
    public static String NAME_OF_THE_STORE = "M & M Dessert Shoppe";
    public static int MAXIMUM_SIZE_OF_ITEM_NAME = 30;
    public static int WIDTH_OF_THE_COST = 6;

    public static String centsToDollarsAndCents(int cents) {
        double dollars;
        dollars = (double) cents / 100;
        return String.valueOf(dollars);
    }
}
