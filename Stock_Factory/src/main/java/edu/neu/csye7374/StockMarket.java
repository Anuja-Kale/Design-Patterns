package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private static StockMarket instance;
    private List<Stock> stocks;

    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void removeStock(Stock stock) {
    	
        if (stocks.contains(stock)) {
            stocks.remove(stock);
            System.out.println("\nRemoved: " + stock.name);
        } else {
            System.out.println("Stock not found: " + stock.name);
        }
    }

    public void showStocks() {
        System.out.println("\n===== Currently traded stocks =====");
        for (Stock stock : stocks) {
            System.out.println("\n"+stock);
        }
        if (stocks.isEmpty()) {
            System.out.println("\nNo stocks in the market.");
        }
    }
}
