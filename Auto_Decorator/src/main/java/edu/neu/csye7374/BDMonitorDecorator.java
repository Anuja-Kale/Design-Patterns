package edu.neu.csye7374;

public class BDMonitorDecorator extends AutoDecorator {
    public BDMonitorDecorator(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 10; // Adding $10 for the Blind-side Detection Monitor
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Blind-side Detection Monitor";
    }
}
