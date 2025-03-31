package pt.iscte.poo.game;

import pt.iscte.poo.utils.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Walls {

    private List<Point2D> list = new ArrayList<>();

    public void addWall(Point2D point) {
        list.add(point);
    }

    public List<Point2D> getWalls() {
        return list;
    }
}
