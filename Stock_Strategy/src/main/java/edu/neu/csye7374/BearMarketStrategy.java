package edu.neu.csye7374;

public class BearMarketStrategy implements StockStrategy {
    @Override
    public void calculatePrice(Stock stock) {
        stock.price *= 0.85; // Bear market reduces stock price by 15%
    }
}
