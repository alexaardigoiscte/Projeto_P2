package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.util.List;
import java.util.Objects;

import static java.lang.System.out;

public class Attack {

    public boolean oManelSofreAttack(Direction d, Point2D position, List<ImageTile> list) {
        for (int i = 0; i < list.size(); i++) {

            out.println(position.plus(d.asVector()).getY() + " " + (list.get(i).getPosition().getY()));
            boolean itsATrap = Objects.equals(list.get(i).getName(), "Trap")
                    && (position.plus(d.asVector()).getX() == (list.get(i).getPosition().getX())
                    && position.plus(d.asVector()).getY() == (list.get(i).getPosition().getY()));

            if (itsATrap) {
                return true;
            }
        }
        return false;
    }
}
