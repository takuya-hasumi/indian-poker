import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] arg) {
        // カードの定義
        Cards cards = new Cards(5);
        // プレイヤーの定義
        String player_list = {"oba", "hasu", "ami"};
        Players players = new Players(player_list);
        // プレイヤーにランダムにカードを配る
        players.setCard(cards);
        // ゲームスタート
        IndianPoker.startGame(players, cards);
    }
}