package pt.iscte.poo.game;

import objects.*;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    private List<String> map = new ArrayList<>();
    private final String room;

    public Walls walls = new Walls();

    public Map(String room) {
        this.room = room;
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
                        ImageGUI.getInstance().addImage(new Wall(point));
                        walls.addWall(point);
                        break;
                    }
                    case 'H': {
                        Manel.getInstance().setPosition(new Point2D(x, y));
                        ImageGUI.getInstance().addImage(Manel.getInstance());
                        break;
                    }
                    case 'G': {
                        DonkeyKong.getInstance().setPosition(new Point2D(x, y));
                        ImageGUI.getInstance().addImage(DonkeyKong.getInstance());
                        break;
                    }

                    case 'S': {
                        ImageGUI.getInstance().addImage(new Stairs(new Point2D(x, y)));
                        break;
                    }
                    case 's': {
                        ImageGUI.getInstance().addImage(new Sword(new Point2D(x, y)));
                        break;
                    }
                    case 't': {
                        ImageGUI.getInstance().addImage(new Trap(new Point2D(x, y)));
                        break;
                    }
                }
            }
        }
    }
}
