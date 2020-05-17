package com.lanpingner.VoidStorage.items;

import com.lanpingner.VoidStorage.VoidStorage;
import net.minecraft.item.Item;

public class ItemBase extends Item{

    public ItemBase() {
        super(new Item.Properties().group(VoidStorage.TAB));
    }
}
