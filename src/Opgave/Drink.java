package Opgave;

/*
     * Abstrakt klasse Opgave.Drink
     * - Skal arves af alle drikke
     * - Viser abstraktion, polymorfi og arv
     */
    abstract class Drink implements Comparable<Drink> {

        protected String name;

        public Drink(String name) {
            this.name = name;

        }
        /*
         * Polymorf metode serve
         * - Skal implementeres forskelligt i subklasser
         * - Skal returnere en Cup med den valgte drik
         */

        public abstract Cup serve(Size size, boolean whippedCream);


        public String getName() {
            return name;
        }


        @Override
        public int compareTo(Drink other) {
            return this.name.compareToIgnoreCase(other.name);
        }

        @Override
        public String toString() {
            return name;

        }
    }

