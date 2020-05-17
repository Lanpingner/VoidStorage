package com.lanpingner.VoidStorage.init;

import com.lanpingner.VoidStorage.VoidStorage;
import com.lanpingner.VoidStorage.util.RegistryHandler;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, VoidStorage.MOD_ID);
   // public static final RegistryObject<TileEntityType<VSDiskDriveTileEntity>> VSDISKDRIVE = TILE_ENTITY_TYPE.register("vsdiskdrive", () -> TileEntityType.Builder.create(VSDiskDriveTileEntity, RegistryHandler.VSDISKDRIVE_BLOCK.get()).build(null));
}
