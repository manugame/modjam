package com.vgmanou.traveler;

import com.vgmanou.traveler.init.BlockInit;
import com.vgmanou.traveler.init.ItemInit;
import com.vgmanou.traveler.init.SoundInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(TravelerMain.MODID)
public class TravelerMain {

    public static final String MODID = "traveler";

    private static final Logger LOGGER = LogManager.getLogger();

    public TravelerMain() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        SoundInit.SOUNDS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }


    public static final ItemGroup TAB = new ItemGroup("tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.STRUCTURE_VOID);
        }
    };
}
