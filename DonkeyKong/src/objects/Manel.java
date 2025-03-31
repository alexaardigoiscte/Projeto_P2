package objects;

import pt.iscte.poo.game.*;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import static java.lang.System.out;

public class Manel implements Movables {

    private Point2D position;

    private static Movables INSTANCE;

    private Mapping map = Mapping.getInstance();
    private ImageGUI gui = ImageGUI.getInstance();
    private GameStatus gameStatus = GameStatus.getInstance();

    private Point2D previousPosition;

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
    public void move(Direction d) {
        previousPosition = position;
        Collision collision = new Collision();
        CollectItems collect = new CollectItems();
        Attack attack = new Attack();

        position = collision.oManelTemColisao(d, position, map.walls.getWalls())
                ? position
                : position.plus(d.asVector());

        if (collect.oManelEstaSobreItem(position, map.items.getItems())) {
            gui.removeImage(collect.getItem());
            gui.setStatusMessage(gameStatus.getMessage());
        }

        if (attack.oManelSofreAttack(d, position, map.enemyList.getItems())) {
            out.println("attack!");
            Lives.getInstance().setLives(-1);
            Lives.getInstance().setDamages();
            position = previousPosition;
        }

        /*if (collision.oManelEstaSobreAPorta(d, position, map.doors.getDoors())) {
            collision.
        }*/
    }
}
