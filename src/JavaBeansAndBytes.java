import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    int discount;
    double drinkChoiceDecimal;
    public CoffeeDrink Order1;
    public CoffeeDrink Order2;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 1603;
        System.out.println("We were actully founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Hot Chocolate");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        Order1 = new CoffeeDrink(3, "Vanila",true);
        Order2 = new CoffeeDrink(10, "Pumpkin", false);



        // TODO
        Order1.printInfo();
        Order2.printInfo();
        // Print out the order details



    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        discount = (int)(Math.random() * 31) ;
        System.out.println("Todays discount is " + discount + "%");
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Todays special is " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int x = 1; x <= 5; x ++){
            System.out.println(x);

        }


        // Print 2, 5, 8, 11
        for (int x = 2; x <= 11; x = x+3){
            System.out.println(x);

        }


        // Print 8 to 0

        for (int x = 8; x >= 0; x = x -1 ) {
            System.out.println(x);
        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        drinkChoiceDecimal = ((double)Math.random());

        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.

        if(drinkChoiceDecimal <= 0.25){
            System.out.println("Coffee");
        }
        if(drinkChoiceDecimal > 0.25 && drinkChoiceDecimal <= 0.5){
            System.out.println("Hot Chocolate");
        }
        if(drinkChoiceDecimal > 0.5 && drinkChoiceDecimal <= 0.75){
            System.out.println("Iced Coffee");
        }
        if(drinkChoiceDecimal > 0.75 && drinkChoiceDecimal <= 1){
            System.out.println("Water");
        }
    }
}

