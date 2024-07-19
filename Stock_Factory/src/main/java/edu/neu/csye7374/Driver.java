package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) { 
        Stock techStock = TechStockSingleton.getInstance().createStock("Tesla", 40.00, "Tesla Stock");
        Stock energyStock = EnergyStockSingleton.getInstance().createStock("ExxonMobil", 90.00, "ExxonMobil Corp Stock");   
        
        StockMarket market = StockMarket.getInstance();
        Stock techStock2 = TechStockSingleton.getInstance().createStock("Apple", 150.00, "Apple Stock");
        Stock energyStock2 = EnergyStockSingleton.getInstance().createStock("BPL", 350.00, "BPL Stock");

        market.addStock(energyStock);
        market.addStock(techStock);
        market.addStock(techStock2);
        market.addStock(energyStock2);

        double[] bids = {5, 10, 3, 8, 4, 12};
        System.out.println("Energy Stock Price and Metric Changes:");
        for (double bid : bids) {
            energyStock.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, energyStock.price, energyStock.getMetric()));
        }
        
        System.out.println("\nTech Stock Price and Metric Changes:");
        for (double bid : bids) {
        	techStock.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, techStock.price, techStock.getMetric()));
        }
        
        System.out.println("\nTech Stock Price and Metric Changes:");
        for (double bid : bids) {
        	techStock2.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, techStock2.price, techStock2.getMetric()));
        }
        
        System.out.println("\nEnergy Stock Price and Metric Changes:");
        for (double bid : bids) {
            energyStock2.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, energyStock2.price, energyStock2.getMetric()));
        }
        
        System.out.println("\n**************************************************");
        
        market.showStocks();
    }
}



