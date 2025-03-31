package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.observer.Observer;

public class Main {

	public static void main(String[] args) {
		ImageGUI gui = ImageGUI.getInstance();
		Observer engine = GameEngine.getInstance(); // GameEngine engine = GameEngine.getInstance();
		GameStatus message = GameStatus.getInstance();
		gui.setStatusMessage(message.getMessage());
		gui.registerObserver(engine);
		gui.go();
	}
	
}
