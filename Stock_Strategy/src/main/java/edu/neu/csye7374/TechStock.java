package edu.neu.csye7374;

public class TechStock extends Stock {

    public TechStock(double initialPrice, StockStrategy strategy) {
        super(initialPrice);
        this.strategy = strategy;
    }

    @Override
    public void display() {
        System.out.println("Tech Stock Strategy with price: " + this.price);
    }
}
