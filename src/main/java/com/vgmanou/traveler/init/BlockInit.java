package com.vgmanou.traveler.init;

import com.vgmanou.traveler.TravelerMain;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TravelerMain.MODID);

    public static final RegistryObject<Block> BBQ = createBlock("bbq", () -> new Block(AbstractBlock.Properties.create(Material.ANVIL).hardnessAndResistance(3f, 15f)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier){
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(TravelerMain.TAB)));
        return block;
    }

}
