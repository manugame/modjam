package com.vgmanou.traveler.items.CraftingPad;

import com.vgmanou.traveler.TravelerMain;
import com.vgmanou.traveler.init.SoundInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CraftingPadItem extends Item {
    public CraftingPadItem() {
        super(new Item.Properties().group(TravelerMain.TAB).maxStackSize(1));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote()) {
            worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundInit.DELTA_SOUND.get(), SoundCategory.VOICE, 1.0F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
            playerIn.openContainer(new SimpleNamedContainerProvider((id, playerInv, player) -> new CraftingPadContainer(id, playerInv, IWorldPosCallable.of(worldIn, player.getPosition())), new TranslationTextComponent("item.traveler.crafting_pad")));
            return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
        }
        return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
    }
}