package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

// Command Interface
interface Command {
    String execute();
}

// Concrete Commands
class AddCommand implements Command {
    private double a, b;

    public AddCommand(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String execute() {
        double result = a + b;
        return a + " + " + b + " = " + result;
    }
}

class SubtractCommand implements Command {
    private double a, b;

    public SubtractCommand(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String execute() {
        double result = a - b;
        return a + " - " + b + " = " + result;
    }
}

class MultiplyCommand implements Command {
    private double a, b;

    public MultiplyCommand(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String execute() {
        double result = a * b;
        return a + " * " + b + " = " + result;
    }
}

class DivideCommand implements Command {
    private double a, b;

    public DivideCommand(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String execute() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = a / b;
        return a + " / " + b + " = " + result;
    }
}

class SumCommand implements Command {
    private double[] numbers;

    public SumCommand(double... numbers) {
        this.numbers = numbers;
    }

    @Override
    public String execute() {
        double sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(" + ");
            }
        }
        sb.append(" = ").append(sum);
        return sb.toString();
    }
}

// Invoker
class Invoker {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            String result = command.execute();
            System.out.println(result);
        }
    }
}

// CommandDesignPattern Class
public class CommandDesignPattern {
    public static void demo() {
        Invoker invoker = new Invoker();

        invoker.addCommand(new AddCommand(6, 3));
        invoker.addCommand(new SubtractCommand(6, 3));
        invoker.addCommand(new MultiplyCommand(6, 3));
        invoker.addCommand(new DivideCommand(6, 3));
        invoker.addCommand(new SumCommand(1, 2, 3, 4));

        invoker.executeCommands();
    }
}
