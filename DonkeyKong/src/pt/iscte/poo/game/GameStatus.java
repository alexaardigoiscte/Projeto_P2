package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;

import static java.lang.System.in;
import static java.lang.System.out;

public class GameStatus {

    private String message;
    private Lives lives = Lives.getInstance();
    private CollectItems collectItems = CollectItems.getInstance();
    private static GameStatus INSTANCE;
    public static GameStatus getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GameStatus();
        return INSTANCE;
    }

    public String toString(String s) {
        return s;
    }

    public String getMessage() {
        out.println(collectItems.getCollectedItems().size());
        String items = "";
        for (ImageTile item : collectItems.getCollectedItems()) {
            out.println(item.getName());
            items += item.getName() + " ";
        }

        message = "Vidas: "
                + lives.getLives()
                + " | Items: "
                + (collectItems.getCollectedItems().isEmpty() ? "Vazío" : items);

        return toString(message);
    }

    public void setMessage() {
        message = "";
    }
}
