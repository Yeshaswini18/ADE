package com.company;

class Candy extends DessertItem {
    private double weight;
    private double pricePerPound;

    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerPound);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("")
                .append(String.format("%.2f", weight))
                .append(" lbs. @ ")
                .append(String.format("%.2f", pricePerPound/100))
                .append("/lb.\n");
        return builder.toString();
    }
}
