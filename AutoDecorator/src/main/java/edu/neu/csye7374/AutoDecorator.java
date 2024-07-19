package edu.neu.csye7374;

public abstract class AutoDecorator implements AutoAPI {
    protected AutoAPI auto;

    public AutoDecorator(AutoAPI auto) {
        this.auto = auto;
    }

    @Override
    public abstract double getPrice();

    @Override
    public abstract String getDescription();
}
