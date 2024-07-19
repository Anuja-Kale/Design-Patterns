package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

      
        AutoAPI car1 = new ACAutoDecorator(new SportyCoupeAuto());
        System.out.println("User Configuration 1:");
        System.out.println("Price: $" + car1.getPrice());
        System.out.println("Description: " + car1.getDescription() + "\n");


        AutoAPI car2 = new AWHAutoDecorator(new ABSAutoDecorator(new SportyCoupeAuto()));
        System.out.println("User Configuration 2:");
        System.out.println("Price: $" + car2.getPrice());
        System.out.println("Description: " + car2.getDescription() + "\n");

      
        AutoAPI car3 = new BDMWarrantyDecorator(new BDMonitorDecorator(new SportyCoupeAuto()));
        System.out.println("User Configuration 3:");
        System.out.println("Price: $" + car3.getPrice());
        System.out.println("Description: " + car3.getDescription() + "\n");

        System.out.println("============Main Execution End===================");
    }
}
