// CoffeeDrink object class

import java.sql.SQLOutput;

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pNumberOfCups, String pFlavor, boolean pHasWhippedCream) {
        // TODO
        numberOfCups = pNumberOfCups;
        flavor = pFlavor;
        hasWhippedCream = pHasWhippedCream;
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        System.out.println("Order details:");
        System.out.println("Number of cups: " + numberOfCups);
        System.out.println("Flavor: " + flavor);
        System.out.println("This drink has whipped cream: " + hasWhippedCream);
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
