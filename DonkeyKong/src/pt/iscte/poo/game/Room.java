package pt.iscte.poo.game;

import objects.DonkeyKong;
import objects.Manel;
import pt.iscte.poo.utils.Direction;


import static java.lang.System.out;

public class Room {

	private Movables manel = Manel.getInstance();
	private Enemies donkeyKong = DonkeyKong.getInstance();


	private Mapping map = Mapping.getInstance();


	public Room() {

		FloorFill floor = new FloorFill();
		floor.fill();

		map.create();

		donkeyKong.move();

		out.println(GameStatus.getInstance().getMessage());
    }

	public void moveManel(Direction d) {
		manel.move(d);
	}



}