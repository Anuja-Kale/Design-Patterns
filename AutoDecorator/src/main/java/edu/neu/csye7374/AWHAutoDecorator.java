package edu.neu.csye7374;

public class AWHAutoDecorator extends AutoDecorator {
    public AWHAutoDecorator(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 3000; // Price adjustment for All Wheel Drive
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with All Wheel Drive";
    }
}
