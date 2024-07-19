package edu.neu.csye7374;

public class ConsumerDividendStrategy implements StockStrategy {
    private static ConsumerDividendStrategy instance;

    private ConsumerDividendStrategy() {}

    public static ConsumerDividendStrategy getInstance() {
        if (instance == null) {
            instance = new ConsumerDividendStrategy();
        }
        return instance;
    }

    @Override
    public void calculatePrice(Stock stock) {
        stock.price *= 0.95; // Decrease price by 5%, simulating a dividend payout effect
    }
}
