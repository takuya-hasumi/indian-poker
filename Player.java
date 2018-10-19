/**
 * Player
 */
public class Player {

    String name;
    Int card;

    Player(String name) {
        this.name = name;
    }

    /**
     * プレイヤーを生成する
     */
    public static Player create(string name) {
        return new Player(name);
    }
}