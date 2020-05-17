package com.lanpingner.VoidStorage;
import com.lanpingner.VoidStorage.blocks.vscontroller_block;
import com.lanpingner.VoidStorage.init.ModContainerTypes;
import com.lanpingner.VoidStorage.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("voidstorage")
@Mod.EventBusSubscriber(modid = "voidstorage", bus = Mod.EventBusSubscriber.Bus.MOD)
public class VoidStorage
{
    private static final Logger LOGGER = LogManager.getLogger();
    public  static  final String MOD_ID = "voidstorage";
    public VoidStorage() {
        final IEventBus modeventbus = FMLJavaModLoadingContext.get().getModEventBus();
        modeventbus.addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(vscontroller_block.class);
        MinecraftForge.EVENT_BUS.register(this);
        ModContainerTypes.CONTAINER_TYPE.register(modeventbus);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    public static final ItemGroup TAB = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.VSCONTROLLER_BLOCK_ITEM.get());
        }
    };

}
