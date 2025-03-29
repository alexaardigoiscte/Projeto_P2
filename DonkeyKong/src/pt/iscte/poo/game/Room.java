package pt.iscte.poo.game;

import objects.DonkeyKong;
import objects.Manel;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Room {

	private Movables manel = Manel.getInstance();

	public List<ImageTile> tiles = new ArrayList<>();

	private Map map;


	public Room() {

		FloorFill floor = new FloorFill();
		floor.fill();

		map = new Map("DonkeyKong/rooms/room0.txt");
		map.create();

    }

	public void moveManel(Direction d) {
		manel.move(d, map.walls);
	}



}