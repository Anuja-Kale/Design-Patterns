package edu.neu.csye7374;

public abstract class Stock {
    protected StockStrategy strategy;
    protected double price;  // Price of the stock

    public Stock(double initialPrice) {
        this.price = initialPrice;
    }

    public void setStrategy(StockStrategy strategy) {
        this.strategy = strategy;
    }

    public void updatePrice() {
        strategy.calculatePrice(this);
    }

    public abstract void display();
}

interface StockStrategy {
    void calculatePrice(Stock stock);
}
