package pt.iscte.poo.game;

import objects.DonkeyKong;
import objects.Manel;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;

import static java.lang.System.out;

public class Room {

	private Manel manel;

	private DonkeyKong donkeyKong;

	public Room() {

		out.println(ImageGUI.getInstance());

		FloorFill floor = new FloorFill();
		floor.fill();

		Map map = new Map("DonkeyKong/rooms/room0.txt");
		map.obterCoordenadasRoom();

		manel = new Manel(map.manel.getPosition());
		ImageGUI.getInstance().addImage(manel);

		donkeyKong = new DonkeyKong(map.donkeyKong.getPosition());
		ImageGUI.getInstance().addImage(donkeyKong);



    }

	public void moveManel(Direction d) {
		manel.move(d);
	}

}