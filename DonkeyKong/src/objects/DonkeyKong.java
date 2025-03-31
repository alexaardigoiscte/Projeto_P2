package objects;

import pt.iscte.poo.game.Enemies;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import static java.lang.System.out;

public class DonkeyKong implements Enemies {

    private Point2D position;
    private static Enemies INSTANCE;

    private int currentTick = ImageGUI.getInstance().getTicks();
    private int lastTick;

    public DonkeyKong(Point2D initialPosition) {
        position = initialPosition;
    }

    public static Enemies getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DonkeyKong(new Point2D(0, 0));
        return INSTANCE;
    }

    @Override
    public String getName() {
        return "DonkeyKong";
    }

    @Override
    public Point2D getPosition() {
        return position;
    }

    @Override
    public void move() {

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
    public void move(Direction d) {

        currentTick = ImageGUI.getInstance().getTicks();
        if (currentTick != lastTick) {
            position = position.plus(Direction.random().asVector());
            lastTick = currentTick;
        }

    }
}
