package pt.iscte.poo.game;

import objects.Manel;
import pt.iscte.poo.utils.Point2D;

public class Lives {

    private int lives = 3;
    private int damages = 0;

    private static Lives INSTANCE;


    public static Lives getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Lives();
        return INSTANCE;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int damageOrPatch) {
        lives += damageOrPatch;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages() {
        damages++;
    }
}
