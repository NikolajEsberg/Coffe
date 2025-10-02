package Opgave;

public class Cup {

    private String drinkName;
    private Size size;
    private boolean hasWhippedCream;

    // Constructor
    public Cup(String drinkName, Size size, boolean hasWhippedCream) {
        this.drinkName = drinkName;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }
    // Getters
    public String getDrinkName() {
        return drinkName;
    }

    public Size getSize() {
        return size;
    }

    public boolean hasWhippedCream() {
        return hasWhippedCream;
    }
    // toString method
    @Override
    public String toString() {
        return ("Drink name: " +  drinkName + "\n" +
                "Size: " + size + "\n" +
                "Whipped cream: " + hasWhippedCream);
    }

}