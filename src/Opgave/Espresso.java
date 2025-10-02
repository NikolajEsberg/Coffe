package Opgave;

// Espresso subklasse – polymorfi
class Espresso extends Drink {
    public Espresso(String name) {
        super(name);
    }
    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public Cup serve(String drinkName, Size size, boolean hasWhippedCream) {

        return new Cup(drinkName, null,false);
    }
}
