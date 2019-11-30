package ml.khaliman.Task_3_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {

    //private Card[][] card;
    private Card[] arr = new Card[36];
    public void shuffle() {
//card = new Card[9][4];
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i*4+j] = new Card(Rank.values[i], Suit.values[j]);

                System.out.println(arr[i*4+j].toString());
            }

        }
    }
    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */


    public void order() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i*9+j] = new Card(Rank.values[j], Suit.values[i]);
                System.out.println(arr[i*9+j].toString());
            }
        }



    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (arr.length>0) {
            return true;
        }
        else {
            return false;
        }
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if(arr.length>0){
           /* List<Card> list = new ArrayList<>();
            Collections.addAll(list, arr);


            Card oneCard = list.get(arr.length-1);

            list.remove(arr.length-1);
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);

            }*/
           Card oneCard = arr[arr.length-1];
           arr = Arrays.stream(arr).limit(arr.length-1).toArray(Card[]::new);
            return oneCard;

        }
        else {
            return null;
        }


    }
}

