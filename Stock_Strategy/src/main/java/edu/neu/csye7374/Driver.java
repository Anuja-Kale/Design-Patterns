package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Applying strategies to stocks:");
        Stock techStock = new TechStock(100.0, TechDividendStrategy.getInstance());
        techStock.display();
        techStock.updatePrice();
        techStock.display();

        Stock consumerStock = new ConsumerStock(100.0, new ConsumerGrowthStrategy());
        consumerStock.display();
        consumerStock.updatePrice();
        consumerStock.display();

        System.out.println("\n*****************************************\n");

        System.out.println("Applying market conditions:");
        techStock.setStrategy(new BullMarketStrategy());
        techStock.updatePrice();
        techStock.display();

        consumerStock.setStrategy(new BearMarketStrategy());
        consumerStock.updatePrice();
        consumerStock.display();

        System.out.println("\n*****************************************\n");

        // If there are more sections or strategies, continue to add them here with headers.
    }
}
