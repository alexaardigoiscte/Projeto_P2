package objects;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

public class Door implements ImageTile {

	private String name = "DoorClosed";

	private boolean isDoorOpen = false;
	private Point2D position;

	public Door(Point2D initialPosition){
		position = initialPosition;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = isDoorOpen ? "DoorOpen" : "DoorClosed";
	}

	@Override
	public int getLayer() {
		return 0;
	}

	@Override
	public Point2D getPosition() {
		return position;
	}


}
