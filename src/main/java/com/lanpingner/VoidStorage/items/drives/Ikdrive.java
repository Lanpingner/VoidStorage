package com.lanpingner.VoidStorage.items.drives;

import com.lanpingner.VoidStorage.VoidStorage;
import net.minecraft.item.Item;

public class Ikdrive extends Item {
    public int datatypes = 0;
    public int bytes = 0;
    public Ikdrive() {
        super(new Item.Properties().group(VoidStorage.TAB));
    }
}
