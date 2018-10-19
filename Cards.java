/**
 * Cards
 */
public class Cards {

    int cards[];

    Cards(int number) {
        this.setCard(number);
    }

    /**
     * カードをフィールドにセットする
     * @param number
     */
    protected void setCard(int number) {
        this.cards = new int[number];
    }

}