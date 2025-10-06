package Opgave;

import java.util.Scanner;

public class CoffeeMachineTest {
    public static void main(String[] args) {

        public class CoffeeMachineTest {
            public static void main(String[] args) {

                CoffeeMachine machine = new CoffeeMachine();

                // TODO: Sort and print all drinks
                System.out.println("\n=== All drinks sorted ===");
                machine.sortDrinks();
                machine.listDrinks();

                // TODO: Serve different drinks and print Cups
                System.out.println("\n=== Serving different drinks ===");
                Cup cup1 = machine.serveDrink("Black Coffee", Size.MEDIUM, false);
                System.out.println(cup1);

                Cup cup2 = machine.serveDrink("Espresso", Size.SMALL, false);
                System.out.println(cup2);

                Cup cup3 = machine.serveDrink("Hot Chocolate", Size.LARGE, true);
                System.out.println(cup3);

                // TODO: Add more serving examples with different types and whipped cream
                System.out.println("\n=== More examples with different variations ===");

                Cup cup4 = machine.serveDrink("Espresso", Size.SMALL, true);
                System.out.println(cup4);

                Cup cup5 = machine.serveDrink("Black Coffee", Size.LARGE, false);
                System.out.println(cup5);

                Cup cup6 = machine.serveDrink("Hot Chocolate", Size.MEDIUM, true);
                System.out.println(cup6);

                // TODO: Consider adding user input with Scanner for dynamic ordering
                System.out.println("\n=== Dynamic ordering with user input ===");
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nWelcome to the coffee machine!");
                System.out.println("Available drinks:");
                machine.listDrinks();

                System.out.print("\nEnter the name of your drink: ");
                String drinkName = scanner.nextLine();

                System.out.println("Choose size:");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");
                System.out.print("Your choice (1-3): ");
                int sizeChoice = scanner.nextInt();

                Size size = switch(sizeChoice) {
                    case 1 -> Size.SMALL;
                    case 2 -> Size.MEDIUM;
                    case 3 -> Size.LARGE;
                    default -> Size.MEDIUM;
                };

                System.out.print("Do you want whipped cream? (yes/no): ");
                scanner.nextLine(); // Consume newline
                String creamChoice = scanner.nextLine();
                boolean whippedCream = creamChoice.equalsIgnoreCase("yes");

                Cup customCup = machine.serveDrink(drinkName, size, whippedCream);

                if (customCup != null) {
                    System.out.println("\n" + customCup);
                    System.out.println("Enjoy your drink!");
                } else {
                    System.out.println("\nThe drink does not exist in the machine.");
                }

                scanner.close();
            }
        }

