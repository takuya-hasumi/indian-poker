
/**
 * Players
 */
import java.util.ArrayList;
import java.util.ArrayList;

public class Players {

    ArrayList players;

    Players(String player_list) {
        this.setPlayer(player_list);
    }

    /**
     * プレイヤーをフィールドにセットする
     * 
     * @param player_list
     */
    protected void setPlayer(String player_list) {
        this.players = this.createPlayer(player_list);
    }

    /**
     * プレイヤーを生成する
     * 
     * @param player_list
     * @return
     */
    protected ArrayList createPlayer(String player_list) {
        // playerを生成して返す
        // 一旦簡単に
        return player_list;
    }

}