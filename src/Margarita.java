public class Margarita extends Pizza {
    private boolean withMeat; // Маргарита – с мясом или без

    public Margarita() {
    }

    public Margarita(int price, int weight, boolean withMeat) {
        super(price, weight);
        setWithMeat(withMeat);
    }

    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        if (!withMeat) System.out.println("Без мяса");
        else System.out.println("С мясом");
    }

    @Override
    protected void doPizza() {
        super.doPizza();
    }

    @Override
    protected void deliverPizza() {
        super.deliverPizza();
    }

    @Override
    public String toString() {
        return "Маргарита " +
                "с мясом " + isWithMeat() + super.toString();
    }
}
