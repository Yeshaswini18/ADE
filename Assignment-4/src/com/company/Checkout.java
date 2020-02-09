package com.company;
import java.util.ArrayList;


public class Checkout {
    ArrayList<DessertItem> dessertItems;

    public Checkout() {
        dessertItems = new ArrayList<DessertItem>();
    }

    public int numberOfItems() {
        return dessertItems.size();
    }

    public void enterItem(DessertItem item) {
        dessertItems.add(item);
    }

    public void clear() {
        dessertItems.clear();
    }

    public int totalCost() {
        int totalCostBeforeTax = 0;
        for (DessertItem desertItem : dessertItems) {
            totalCostBeforeTax += desertItem.getCost();
        }
        return totalCostBeforeTax;
    }

    public int totalTax() {
        double Tax =  (DessertShoppe.TAX_RATES / 100) * totalCost();
        return (int) Math.round(Tax);
    }
    public String toString() {
        String s1 = "                     " + DessertShoppe.NAME_OF_THE_STORE + "\n";
        String s2 = "                     " + "---------------------" + "\n";
        String s = s1 + s2;
        StringBuilder items = new StringBuilder();
        for (DessertItem dessertItem : dessertItems) {
            items.append(String.format("%s%-" + String.valueOf(DessertShoppe.MAXIMUM_SIZE_OF_ITEM_NAME) + "s %" + DessertShoppe.WIDTH_OF_THE_COST + "s\n", dessertItem, dessertItem.getName(), DessertShoppe.centsToDollarsAndCents(dessertItem.getCost())));
        }

        String s3 = String.format("%-" + String.valueOf(DessertShoppe.MAXIMUM_SIZE_OF_ITEM_NAME) + "s %" + DessertShoppe.WIDTH_OF_THE_COST + "s\n", "Tax", DessertShoppe.centsToDollarsAndCents(totalTax()));
        String s4 = String.format("%-" + String.valueOf(DessertShoppe.MAXIMUM_SIZE_OF_ITEM_NAME) + "s %" + DessertShoppe.WIDTH_OF_THE_COST + "s\n","Total Cost", DessertShoppe.centsToDollarsAndCents(totalCost()+totalTax()));
        return s + items + "\n" + s3 + s4;
    }
}
