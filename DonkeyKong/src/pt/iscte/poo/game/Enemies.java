package pt.iscte.poo.game;

import pt.iscte.poo.utils.Point2D;

public interface Enemies extends Movables {

    void move();

    void setPosition(Point2D point2D);


}
