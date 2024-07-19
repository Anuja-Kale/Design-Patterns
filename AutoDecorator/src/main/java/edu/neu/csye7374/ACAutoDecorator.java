package edu.neu.csye7374;

public class ACAutoDecorator extends AutoDecorator {
    public ACAutoDecorator(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 1500; // Adding cost of AC
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Air Conditioning";
    }
}
