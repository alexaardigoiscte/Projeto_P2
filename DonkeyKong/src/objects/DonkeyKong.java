package objects;

import pt.iscte.poo.game.Movables;
import pt.iscte.poo.game.Walls;
import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public class DonkeyKong implements Movables {

	private Point2D position;
	private static Movables INSTANCE;


	public DonkeyKong(Point2D initialPosition){
		position = initialPosition;
	}

	public static Movables getInstance() {
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
	public void setPosition(Point2D point2D) {
		position = point2D;
	}

	@Override
	public int getLayer() {
		// TODO Auto-generated method stub
		return 3;
	}

	public void move(Direction d, Walls walls) {
		position = position.plus(d.asVector());	
	}
	
}
