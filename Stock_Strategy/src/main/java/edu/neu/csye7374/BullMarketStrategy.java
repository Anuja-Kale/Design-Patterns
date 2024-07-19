package edu.neu.csye7374;

public class BullMarketStrategy implements StockStrategy {
    @Override
    public void calculatePrice(Stock stock) {
        stock.price *= 1.15; // Bull market increases stock price by 15%
    }
}
