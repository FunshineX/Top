package com.Martijn.Top.item;

import net.minecraft.item.Item;

import com.Martijn.Top.lib.ItemIds;

public class ModItems {
	
	public static Item BlackStick;
	
	public static void ItemInit(){
		BlackStick = new ItemBlackStick(ItemIds.BLACKSTICK_ID);
	};
}
