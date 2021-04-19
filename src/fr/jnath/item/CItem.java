package fr.jnath.item;

import fr.virthia.utils.item.ItemCreator;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class CItem {
    private final static String CItemCode = "§1§1§1§2§2§2";
    protected ItemCreator item;
    protected long id;
    protected static Random random = new Random(System.currentTimeMillis());
    protected static List<CItem> all_custom_item = new ArrayList<>();
    // the Object[] start with the format of the list (CItemActionListType)
    private Consumer<Object[]> rightClick = null, leftClick = null, shiftRightClick = null, shiftLeftClick = null;

    public CItem(long id, String name){

    }

    public CItem(long id, String name, boolean addInList){

    }

    public CItem addAction(Action type, Consumer<Object[]> function){
        switch (type){
            case LEFT:
                leftClick = function;
                return this;
            case RIGHT:
                rightClick = function;
                return this;
            case SHIFT_LEFT:
                shiftLeftClick = function;
                return this;
            case SHIFT_RIGHT:
                shiftRightClick = function;
                return this;
            default:
                return this;
        }
    }
}
