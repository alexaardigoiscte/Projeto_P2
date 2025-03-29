package pt.iscte.poo.game;

import pt.iscte.poo.utils.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Walls {

    private List<Point2D> walls = new ArrayList<>();

    public void addWall(Point2D point) {
        walls.add(point);
    }

    public List<Point2D> getWalls() {
        return walls;
    }
}
