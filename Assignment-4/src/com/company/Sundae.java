package com.company;

class Sundae extends IceCream {
    String topping;
    double costOfTopping;

    public Sundae (String name, double cost, String topping, double costOfTopping) {
        super(name, cost);
        this.topping = topping;
        this.costOfTopping = costOfTopping;
    }

    @Override
    public int getCost() {
        return (int) (super.getCost() + costOfTopping);
    }

    public String toString() {
        return topping + "\n";
    }
}
