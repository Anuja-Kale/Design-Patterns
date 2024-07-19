package edu.neu.csye7374;

public class EnergyStockSingleton {
	//Eager Singleton
    private static final EnergyStockFactory instance = new EnergyStockFactory();

    private EnergyStockSingleton() {}

    public static EnergyStockFactory getInstance() {
        return instance;
    }

    public Stock createStock(String name, double price, String description) {
        return new EnergyStock(name, price, description);
    }
}
