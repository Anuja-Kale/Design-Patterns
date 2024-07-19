package edu.neu.csye7374;

public class TechGrowthStrategy implements StockStrategy {
    @Override
    public void calculatePrice(Stock stock) {
        stock.price *= 1.10; // Increase price by 10%
    }
}
