package pt.iscte.poo.game;

import objects.Manel;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.util.List;

public class Collision {

    public boolean contraParede;
    private boolean foraDoFrame;

    public boolean oManelTemColisao(Direction d, Point2D position, List<Point2D> list) {


        for (int i = 0; i < list.size(); i++) {

            contraParede = position.plus(d.asVector()).equals(list.get(i))
                    && position.plus(d.asVector()).equals(list.get(i));
            foraDoFrame = (position.plus(d.asVector()).getX() < 0 || position.plus(d.asVector()).getX() >= 10)
                    || (position.plus(d.asVector()).getY() < 0 || position.plus(d.asVector()).getY() >= 10);

            if (contraParede || foraDoFrame) return true;

        }
        return false;
    }
}
