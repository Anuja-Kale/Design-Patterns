package edu.neu.csye7374;

public class TechStockSingleton {
    private static TechStockFactory instance;

    private TechStockSingleton() {}

    public static synchronized TechStockFactory getInstance() {
    	//Lazy Singleton
        if (instance == null) {
            instance = new TechStockFactory();
        }
        return instance;
    }

    public Stock createStock(String name, double price, String description) {
        return new TechStock(name, price, description);
    }
}