package com.lanpingner.VoidStorage.util;
import com.lanpingner.VoidStorage.VoidStorage;
import com.lanpingner.VoidStorage.blocks.*;
import com.lanpingner.VoidStorage.items.ItemBase;
import com.lanpingner.VoidStorage.items.drives.IIkdrive;
import com.lanpingner.VoidStorage.items.drives.Ikdrive;
import com.lanpingner.VoidStorage.items.drives.emptydisk;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VoidStorage.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, VoidStorage.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Items //Make sure name: "small letters"
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

        //ITEMS Drives
        public static final RegistryObject<Item> EMPTYDRIVE = ITEMS.register("emptydisk", emptydisk::new);
        public static final RegistryObject<Item> IKDRIVE = ITEMS.register("ikdrive", Ikdrive::new);
        public static final RegistryObject<Item> IIKDRIVE = ITEMS.register("iikdrive", IIkdrive::new);

    //Blocks
    public static final RegistryObject<Block> VSCONTROLLER_BLOCK = BLOCKS.register("vscontroller_block", vscontroller_block::new);
    public static final RegistryObject<Block> DISKIO_BLOCK = BLOCKS.register("diskio_block", diskio_block::new);
    public static final RegistryObject<Block> CRAFTINGPANEL = BLOCKS.register("craftingpanel", craftingpanel::new);
    public static final RegistryObject<Block> VSDISKDRIVE_BLOCK = BLOCKS.register("vsdiskdrive_block", vsdiskdrive_block::new);

    //Block Items
    public static final RegistryObject<Item> VSCONTROLLER_BLOCK_ITEM = ITEMS.register("vscontroller_block", () -> new BlockItemBase(VSCONTROLLER_BLOCK.get()));
    public static final RegistryObject<Item> DISKIO_BLOCK_ITEM = ITEMS.register("diskio_block", () -> new BlockItemBase(DISKIO_BLOCK.get()));
    public static final RegistryObject<Item> CRAFTINGPANEL_ITEM = ITEMS.register("craftingpanel", () -> new BlockItemBase(CRAFTINGPANEL.get()));
    public static final RegistryObject<Item> VSDISKDRIVE_BLOCK_ITEM = ITEMS.register("vsdiskdrive_block", () -> new BlockItemBase(VSDISKDRIVE_BLOCK.get()));
}
