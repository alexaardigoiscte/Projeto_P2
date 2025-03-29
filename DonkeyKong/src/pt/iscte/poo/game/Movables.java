package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public interface Movables extends ImageTile {
    void move(Direction d, Walls walls);

    void setPosition(Point2D point2D);

}
