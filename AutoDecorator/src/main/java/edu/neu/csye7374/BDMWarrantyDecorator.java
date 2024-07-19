package edu.neu.csye7374;

public class BDMWarrantyDecorator extends AutoDecorator {
    public BDMWarrantyDecorator(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 2500; // Price adjustment for Bumper to Bumper Warranty
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Bumper to Bumper Warranty";
    }
}
