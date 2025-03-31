package pt.iscte.poo.game;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class CollectItems {

    private boolean oManelEstaSobreItem;
    private ImageTile item;

    private List<ImageTile> collectedItems = new ArrayList<>();

    private static CollectItems INSTANCE;
    public static CollectItems getInstance() {
        if (INSTANCE == null)
            INSTANCE = new CollectItems();
        return INSTANCE;
    }

    public boolean oManelEstaSobreItem(Point2D position, List<ImageTile> list) {
        for (int i = 0; i < list.size(); i++) {
            oManelEstaSobreItem = position.equals(list.get(i).getPosition())
                    && position.equals(list.get(i).getPosition());
            if (oManelEstaSobreItem) {
                item = list.get(i);
                CollectItems.getInstance().addItem(item);
                return true;
            }
        }
        return false;
    }

    public ImageTile getItem() {
        return item;
    }

    public List<ImageTile> getCollectedItems() {
        return collectedItems;
    }

    public void addItem(ImageTile item) {
        collectedItems.add(item);
    }

}
