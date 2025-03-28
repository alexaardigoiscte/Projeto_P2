package pt.iscte.poo.game;

import objects.Floor;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Point2D;

public class FloorFill {
    public void fill() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                ImageGUI.getInstance().addImage(new Floor(new Point2D(x, y)));

            }
        }
    }
}
