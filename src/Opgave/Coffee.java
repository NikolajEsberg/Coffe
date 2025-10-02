package Opgave;

class Coffee extends Drink {
    public Coffee(String name) {
        super(name);
    }
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    @Override
    public Cup serve(Size size, boolean whippedCream) {
        return new Cup(this.name, size, false);
    }
}
