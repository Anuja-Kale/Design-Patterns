package edu.neu.csye7374;

/**
 * Adapter class that integrates the legacy API with the new client API.
 */
public class StockAdapter implements StockClientAPI {
    private StockLegacyAPI legacyStockSystem;

    public StockAdapter(StockLegacyAPI legacyStockSystem) {
        this.legacyStockSystem = legacyStockSystem;
    }

    @Override
    public void fetchAndDisplayStockPrice() {
        System.out.println("Fetching stock price from the legacy system...");
        double price = legacyStockSystem.getStockPrice();
        System.out.println("The current stock price is: $" + price);
    }

    @Override
    public void trade(double bid) {
        double currentPrice = legacyStockSystem.getStockPrice();
        System.out.println("Performing trading action with bid: $" + bid);
        legacyStockSystem.setStockPrice(currentPrice + bid);
        System.out.println("Original stock price: $" + currentPrice + ", New stock price: $" + (currentPrice + bid));
    }

    public static void demo() {
        StockLegacyAPI legacyAPI = new LegacyStockSystem();
        StockClientAPI adapter = new StockAdapter(legacyAPI);
        adapter.fetchAndDisplayStockPrice();
        adapter.trade(50.0);
        adapter.fetchAndDisplayStockPrice();
    }
}
