package objects;

import pt.iscte.poo.game.Collectables;
import pt.iscte.poo.utils.Point2D;

public class Sword implements Collectables {

	private Point2D position;

	public Sword(Point2D initialPosition){
		position = initialPosition;
	}

	@Override
	public String getName() {
		return "Sword";
	}

	@Override
	public Point2D getPosition() {
		return position;
	}

	@Override
	public int getLayer() {
		return 0;
	}

	@Override
	public void setPosition(Point2D point2D) {

	}

}
