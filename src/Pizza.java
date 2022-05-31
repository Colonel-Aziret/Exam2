public class Pizza {
    private int price;
    private int weight;
    protected static int numOfPizza;

    protected void doPizza() {
        System.out.println("Пицца готовится, номер пиццы - " + ++numOfPizza);
    }

    protected void deliverPizza() {
        System.out.println("Пицца доставляется");
    }

    public Pizza(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public Pizza() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getNumOfPizza() {
        return numOfPizza;
    }

    public static void setNumOfPizza(int numOfPizza) {
        Pizza.numOfPizza = numOfPizza;
    }

    @Override
    public String toString() {
        return ", цена: " + price + " сом" +
                ", вес: " + weight + "г" + "\n";
    }
}

