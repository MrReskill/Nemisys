package org.itxtech.nemisys.event.potion;

import org.itxtech.nemisys.event.Event;
import org.itxtech.nemisys.potion.Potion;

/**
 * Created by Snake1999 on 2016/1/12.
 * Package org.itxtech.nemisys.event.potion in project nukkit
 */
public abstract class PotionEvent extends Event {

    private Potion potion;

    public PotionEvent(Potion potion) {
        this.potion = potion;
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

}