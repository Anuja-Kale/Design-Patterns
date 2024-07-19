package edu.neu.csye7374;

public class EnergyStockFactory implements StockFactoryInterface {
    @Override
    public Stock createStock(String name, double price, String description) {
        return new EnergyStock(name, price, description);
    }
}

