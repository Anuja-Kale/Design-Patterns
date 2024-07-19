package edu.neu.csye7374;

public class TechStockFactory implements StockFactoryInterface {
    @Override
    public Stock createStock(String name, double price, String description) {
        return new TechStock(name, price, description);
    }
}
