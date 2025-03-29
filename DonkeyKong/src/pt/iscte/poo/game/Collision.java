package pt.iscte.poo.game;

import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.util.List;

public class Collision {

    public boolean contraParede;
    private boolean foraDoFrame;

    public boolean temColisao(Direction d, Point2D position, List<Point2D> list) {


        for (int i = 0; i < list.size() - 1; i++) {
            contraParede = position.plus(d.asVector()).getX() == list.get(i).getX()
                    && position.plus(d.asVector()).getY() == list.get(i).getY();
            foraDoFrame = (position.plus(d.asVector()).getX() < 0 || position.plus(d.asVector()).getX() >= 10)
                    || (position.plus(d.asVector()).getY() < 0 || position.plus(d.asVector()).getY() >= 10);

            if (contraParede || foraDoFrame) return true;

        }
        return false;
    }
}
