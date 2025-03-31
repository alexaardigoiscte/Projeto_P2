package pt.iscte.poo.game;

import objects.*;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Point2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mapping {
    private List<String> map = new ArrayList<>();
    public Walls walls = new Walls();
    public CollectableItems items = new CollectableItems();

    public Doors doors = new Doors();

    public EnemyList enemyList = new EnemyList();
    private ImageGUI gui = ImageGUI.getInstance();
    private final String room;
    private static Mapping INSTANCE;

    public Mapping(String room) {
        this.room = room;
    }

    public static Mapping getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Mapping("DonkeyKong/rooms/room0.txt");
        return INSTANCE;
    }


    private void scanearFicheiro() {
        try {
            Scanner scanner = new Scanner(new File(room));
            while (scanner.hasNextLine()) {
                map.add(scanner.nextLine());
            }

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void create() {
        scanearFicheiro();
        for (int y = 0; y < map.size() - 1; y++) {
            for (int x = 0; x < map.get(y).length(); x++) {
                switch (map.get(y).charAt(x)) {
                    case 'W': {
                        Point2D point = new Point2D(x, y);
                        gui.addImage(new Wall(point));
                        walls.addWall(point);
                        break;
                    }
                    case '0': {
                        Door door = new Door(new Point2D(x, y));
                        doors.addDoor(door);
                        gui.addImage(door);
                    }
                    case 'H': {
                        Manel.getInstance().setPosition(new Point2D(x, y));
                        gui.addImage(Manel.getInstance());
                        break;
                    }
                    case 'G': {
                        DonkeyKong.getInstance().setPosition(new Point2D(x, y));
                        gui.addImage(DonkeyKong.getInstance());
                        enemyList.addItem(DonkeyKong.getInstance());
                        break;
                    }

                    case 'S': {
                        gui.addImage(new Stairs(new Point2D(x, y)));
                        break;
                    }
                    case 's': {
                        Sword sword = new Sword(new Point2D(x, y));
                        gui.addImage(sword);
                        items.addItem(sword);
                        break;
                    }
                    case 't': {
                        Trap trap = new Trap(new Point2D(x, y));
                        gui.addImage(trap);
                        enemyList.addItem(trap);
                        break;
                    }
                }
            }
        }
    }
}
