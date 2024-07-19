package edu.neu.csye7374;

public class TechDividendStrategy implements StockStrategy {
    private static TechDividendStrategy instance;

    private TechDividendStrategy() {}

    public static TechDividendStrategy getInstance() {
        if (instance == null) {
            instance = new TechDividendStrategy();
        }
        return instance;
    }

    @Override
    public void calculatePrice(Stock stock) {
        double oldPrice = stock.price;
        stock.price *= 0.95;  // Decrease by 5%
        System.out.println("Tech Dividend Strategy applied: old price was " + oldPrice + ", new price is " + stock.price);
    }
}
