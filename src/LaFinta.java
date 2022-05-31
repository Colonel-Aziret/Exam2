public class LaFinta extends Pizza {
    private boolean withMushrooms; // Ла Финта с грибами или без

    public LaFinta() {
    }

    public LaFinta(int price, int weight, boolean withMushrooms) {
        super(price, weight);
        setWithMushrooms(withMushrooms);
    }

    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        if (!withMushrooms) System.out.println("Без грибов");
        else System.out.println("С грибами");
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
        return "Ла Финта " +
                "с грибами " + withMushrooms + super.toString();
    }
}
