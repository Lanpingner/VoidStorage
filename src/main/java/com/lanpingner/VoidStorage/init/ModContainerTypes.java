package com.lanpingner.VoidStorage.init;

import com.lanpingner.VoidStorage.VoidStorage;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = new DeferredRegister<>(ForgeRegistries.CONTAINERS, VoidStorage.MOD_ID);
 //   public static final RegistryObject<ContainerType<VSStorageContainer> VSStorage = CONTAINER_TYPE.register("vsstorage", () -> IForgeContainerType.create(VSStorageContainer::new));
}
