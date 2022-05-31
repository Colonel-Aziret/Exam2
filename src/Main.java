public class Main {
    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(420, 800, false);
        pepperoni.doPizza();
        pepperoni.deliverPizza();
        System.out.println(pepperoni);

        Margarita margarita = new Margarita(350, 560, false);
        margarita.doPizza();
        margarita.deliverPizza();
        System.out.println(margarita);

        LaFinta laFinta = new LaFinta(790, 500, true);
        laFinta.doPizza();
        laFinta.deliverPizza();
        System.out.println(laFinta);
    }
}