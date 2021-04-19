package fr.jnath.item.spetial;

import fr.jnath.item.CItem;

public class CItemSword extends CItem {
    private int damage;
    public CItemSword(long id, String name, int damage) {
        super(id, name);
    }
    public void onHit(){

    }
}
