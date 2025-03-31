package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;

import java.util.ArrayList;
import java.util.List;

public interface Listable {

     void addItem(ImageTile item);

     List<ImageTile> getItems();
}
