package edu.neu.csye7374;

public class ABSAutoDecorator extends AutoDecorator {
    public ABSAutoDecorator(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 1000; // Price adjustment for Anti-lock Braking System
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Anti-lock Braking System";
    }
}
