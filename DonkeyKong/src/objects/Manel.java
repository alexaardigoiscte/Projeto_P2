package objects;

import pt.iscte.poo.game.Collision;
import pt.iscte.poo.game.GameEngine;
import pt.iscte.poo.game.Movables;
import pt.iscte.poo.game.Walls;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.util.List;

import static java.lang.System.out;

public class Manel implements Movables {

    private Point2D position;

    private static Movables INSTANCE;


    public Manel(Point2D initialPosition) {
        position = initialPosition;
    }

    public static Movables getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Manel(new Point2D(0, 0));
        return INSTANCE;
    }

    @Override
    public String getName() {
        return "JumpMan";
    }

    @Override
    public Point2D getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point2D point2D) {
        position = point2D;
    }

    @Override
    public int getLayer() {
        // TODO Auto-generated method stub
        return 3;
    }


    @Override
    public void move(Direction d, Walls walls) {
        List<Point2D> wallList = walls.getWalls();
        Collision collision = new Collision();
        position = collision.temColisao(d, position, wallList) ? position : position.plus(d.asVector());
    }

}
