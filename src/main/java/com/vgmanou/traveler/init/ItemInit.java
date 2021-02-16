package com.vgmanou.traveler.init;

import com.vgmanou.traveler.TravelerMain;
import com.vgmanou.traveler.items.CraftingPad.CraftingPadItem;
import com.vgmanou.traveler.items.Delta;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TravelerMain.MODID);

    public static final RegistryObject<Item> CRAFTING_PAD = ITEMS.register("crafting_pad", CraftingPadItem::new);
    public static final RegistryObject<Item> DELTA = ITEMS.register("delta", Delta::new);

}
