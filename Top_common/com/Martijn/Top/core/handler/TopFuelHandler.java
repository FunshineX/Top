package com.Martijn.Top.core.handler;

import com.Martijn.Top.item.ModItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class TopFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ModItems.BlackStick.itemID){
			return 2400;
		}else return 0;
	}
}