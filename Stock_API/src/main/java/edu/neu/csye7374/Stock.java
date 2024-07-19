package edu.neu.csye7374;

public abstract class Stock implements Tradable {
    protected String name;
    protected double price;
    protected String description;
    protected double lastBid;

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%s: %s at price $%.2f", name, description, price);
    }
}

