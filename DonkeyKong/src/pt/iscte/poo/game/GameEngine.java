package pt.iscte.poo.game;

import objects.Manel;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.observer.Observed;
import pt.iscte.poo.observer.Observer;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public class GameEngine implements Observer {
	
	private Room currentRoom = new Room();
	private int lastTickProcessed = 0;
	private static Observer INSTANCE;


	public GameEngine() {
		ImageGUI.getInstance().update();
	}

	public static Observer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GameEngine();
		return INSTANCE;
	}


	@Override
	public void update(Observed source) {
		
		if (ImageGUI.getInstance().wasKeyPressed()) {
			int k = ImageGUI.getInstance().keyPressed();
			System.out.println("Keypressed " + k);
			if (Direction.isDirection(k)) {
				System.out.println("Direction! ");
				currentRoom.moveManel(Direction.directionFor(k));
			}
		}

		if (ImageGUI.getInstance().getTicks() >= lastTickProcessed) {

			lastTickProcessed = ImageGUI.getInstance().getTicks();
		}

		ImageGUI.getInstance().update();
	}



}
