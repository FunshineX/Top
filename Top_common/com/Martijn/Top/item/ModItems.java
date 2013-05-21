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
	public static Item ItemTopSpade;
	public static Item ItemTopHoe;
	public static Item ItemTopSword;
	public static Item ItemTopAxe;
	
	public static void ItemInit(){
		
		
		TopToolMaterial = EnumHelper.addToolMaterial(Strings.TOPTOOLMATERIAL, 3, 500, 15F, 2, 2);
		BlackStick = new ItemBlackStick(ItemIds.BLACKSTICK_ID);
		ItemTopPickaxe = new ItemTopPickaxe(ItemIds.ITEMTOPPICKAXE_ID, TopToolMaterial);
		ItemTopAxe = new ItemTopAxe(ItemIds.ITEMTOPAXE_ID,TopToolMaterial);
		ItemTopSword = new ItemTopSword(ItemIds.ITEMTOPSWORD_ID,TopToolMaterial);
		ItemTopHoe = new ItemTopHoe(ItemIds.ITEMTOPHOE_ID,TopToolMaterial);
		ItemTopSpade = new ItemTopSpade(ItemIds.ITEMTOPSPADE_ID,TopToolMaterial);
		
	};
}