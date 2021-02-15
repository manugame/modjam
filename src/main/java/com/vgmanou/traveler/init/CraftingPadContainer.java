package com.vgmanou.traveler.init;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.IWorldPosCallable;

public class CraftingPadContainer extends WorkbenchContainer {
    public CraftingPadContainer(int id, PlayerInventory playerInventory, IWorldPosCallable worldPosCallable) {
        super(id, playerInventory, worldPosCallable);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
