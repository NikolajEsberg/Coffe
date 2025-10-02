package Opgave;

class ChocolateDrink extends Drink {
    public ChocolateDrink(String name) {
        super(name);
    }
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    @Override
    public Cup serve(Size size, boolean whippedCream) {
        return new Cup(this.name, size, true);
    }
}
