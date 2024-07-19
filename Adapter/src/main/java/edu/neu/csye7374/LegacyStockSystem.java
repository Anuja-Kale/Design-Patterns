package edu.neu.csye7374;

/**
 * Concrete implementation of the legacy stock management system.
 */
public class LegacyStockSystem implements StockLegacyAPI {
    private double stockPrice = 100.0; // default stock price

    @Override
    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public void setStockPrice(double price) {
        this.stockPrice = price;
    }
}
