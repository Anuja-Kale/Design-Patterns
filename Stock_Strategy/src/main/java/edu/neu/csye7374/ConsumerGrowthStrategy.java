package edu.neu.csye7374;

public class ConsumerGrowthStrategy implements StockStrategy {
    @Override
    public void calculatePrice(Stock stock) {
        double oldPrice = stock.price;
        stock.price *= 1.05; // Increase the stock price by 5%
        System.out.println("Consumer Growth Strategy applied: old price was " + oldPrice + ", new price is " + stock.price);
    }
}
