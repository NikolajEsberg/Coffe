package Opgave;
import java.util.ArrayList;
import java.util.List;

// Kaffemaskine klasse – aggregation
public class CoffeMachine {
    private List<Drink> drinks;

    public CoffeMachine() {
        drinks = new ArrayList<>();
        drinks.add(new Coffee("Black Coffee"));
        drinks.add(new Espresso("Espresso"));
        drinks.add(new ChocolateDrink("Hot Chocolate"));

    }
        /*
         * Serve en drik
         * - Søger i listen efter navn
         * - Kalder serve() på den rigtige drik
         */
        public Cup serveDrink (String drinkName, Size size,boolean whippedCream){
            for (Drink drink : drinks) {
                if (drink.getName().equalsIgnoreCase(drinkName)) {
                    return drink.serve(size, whippedCream);
                }
            }

            System.out.println("Drikken findes ikke:" + drinkName);
            return null;
        }

        public void sortDrinks () {
            drinks.sort(null);
        }

        public void listDrinks () {
            for (Drink drink : drinks) {
                System.out.println(drink);
            }
        }
    }

