package com.Martijn.Top.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.Martijn.Top.lib.ItemIds;
import com.Martijn.Top.lib.Strings;

public class ModItems {
	
	public static Item BlackStick;
	public static Item ItemTopPickaxe;
	public static EnumToolMaterial TopToolMaterial;
	
	public static void ItemInit(){
		
		
		TopToolMaterial = EnumHelper.addToolMaterial(Strings.TOPTOOLMATERIAL, 3, 500, 15F, 2, 2);
		BlackStick = new ItemBlackStick(ItemIds.BLACKSTICK_ID);
		ItemTopPickaxe = new ItemTopPickaxe(ItemIds.ITEMTOPPICKAXE_ID, TopToolMaterial);
		
	};
}