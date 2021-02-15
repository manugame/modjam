package com.vgmanou.traveler.Init;

import com.vgmanou.traveler.TravelerMain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TravelerMain.MODID);

    public static final RegistryObject<Item> CRAFTING_PAD = ITEMS.register("crafting_pad", () -> new Item(new Item.Properties().group(TravelerMain.TAB)));


    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote()) {
            playerIn.openContainer(new SimpleNamedContainerProvider((id, playerInv, player) -> new CraftingPadContainer(id, playerInv, IWorldPosCallable.of(worldIn, player.getPosition())), new TranslationTextComponent("item.vanillatweaks.pad")));
            return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
        }
        return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
