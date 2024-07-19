package edu.neu.csye7374;
/**
 * 
 * @author Anuja Kale
 * 
 */
public class Driver {
    public static void main(String[] args) {
        StockMarket market = StockMarket.getInstance();
        Stock oilStock = new OilCompanyStock("Exxon", 20.00, "Exxon Stock");
        Stock biotechStack = new BiotechStock("Amgen", 48.50, "Amgen Inc Stock");

        market.addStock(oilStock);
        market.addStock(biotechStack);

        double[] bids = {5, 10, -3, 8, -4, 12};
        System.out.println("Energy Stock Price and Metric Changes:");
        for (double bid : bids) {
            oilStock.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, oilStock.price, oilStock.getMetric()));
        }

        System.out.println("\nBiotech Stock Price and Metric Changes:");
        for (double bid : bids) {
        	biotechStack.setBid(bid);
            System.out.println(String.format("Bid: %.2f, Price: %.2f, Metric: %d", bid, biotechStack.price, biotechStack.getMetric()));
            
        }
    }
}


