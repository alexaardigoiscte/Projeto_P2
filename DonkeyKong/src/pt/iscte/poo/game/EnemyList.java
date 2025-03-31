package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;

import java.util.ArrayList;
import java.util.List;

public class EnemyList implements Listable {

    List<ImageTile> list = new ArrayList<>();

    @Override
    public void addItem(ImageTile item) {
        list.add(item);
    }

    @Override
    public List<ImageTile> getItems() {
        return list;
    }
}
