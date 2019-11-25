package ml.khaliman.Task_3_2;
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println();
        deck.order();
        System.out.println();
        System.out.println(deck.drawOne().toString());
        System.out.println(deck.drawOne().toString());
    }
}
