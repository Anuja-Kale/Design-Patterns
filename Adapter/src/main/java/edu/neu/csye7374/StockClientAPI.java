package edu.neu.csye7374;

/**
 * Interface for client-side operations on stock prices.
 */
public interface StockClientAPI {
    void fetchAndDisplayStockPrice();
    void trade(double bid);
}
