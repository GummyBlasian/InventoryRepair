package com.sangam1.InventoryRepair.GUI.Slots;

import com.sangam1.InventoryRepair.Item.ItemPortableFurnace;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class FurnaceFuelSlots extends FurnaceSlots
{
    public FurnaceFuelSlots(ItemPortableFurnace itemPortableFurnace, int slotIndex, int xPosition, int yPosition)
    {
        super(itemPortableFurnace, slotIndex, xPosition, yPosition);
    }

    /**
     * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace fuel.
     */
    public boolean isItemValid(ItemStack stack)
    {
        return TileEntityFurnace.isItemFuel(stack) || isBucket(stack);
    }

    public int getItemStackLimit(ItemStack stack)
    {
        return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
    }

    public static boolean isBucket(ItemStack stack)
    {
        return stack.getItem() == Items.BUCKET;
    }
}