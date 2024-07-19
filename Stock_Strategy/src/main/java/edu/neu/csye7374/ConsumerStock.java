package edu.neu.csye7374;

public class ConsumerStock extends Stock {

    public ConsumerStock(double initialPrice, StockStrategy strategy) {
        super(initialPrice);
        this.strategy = strategy;
    }

    @Override
    public void display() {
        System.out.println("Consumer Stock Strategy with price: " + this.price);
    }
}
