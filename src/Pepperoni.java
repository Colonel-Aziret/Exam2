public class Pepperoni extends Pizza {
    private boolean isSpicy; // Пепперони может быть острой или не острой

    public Pepperoni(int price, int weight, boolean isSpicy) {
        super(price, weight);
        setSpicy(isSpicy);
    }

    public Pepperoni() {
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        if (!spicy) System.out.println("Не острая");
        else System.out.println("Очень острая");
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
        return "Пепперони " +
                "острая = " + isSpicy() + super.toString();
    }
}
