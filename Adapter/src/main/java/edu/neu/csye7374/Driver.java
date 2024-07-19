package edu.neu.csye7374;

/**
 * Main driver class to demonstrate the use of the Adapter pattern.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n");

        // Using the adapter to demonstrate functionality
        StockAdapter.demo();

        System.out.println("\n============Main Execution End===================");
    }
}
