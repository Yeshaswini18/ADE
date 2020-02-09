package com.company;

class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        double cost = (double) (number * pricePerDozen)/12;
        return (int) Math.round(cost);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(number)
                .append(" @ ")
                .append(String.format("%.2f", (double) pricePerDozen/100))
                .append(" /dz.\n");
        return builder.toString();
    }
}