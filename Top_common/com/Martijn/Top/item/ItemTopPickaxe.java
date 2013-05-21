package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemTopPickaxe extends ItemPickaxe {

	public ItemTopPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.ITEMTOPPICKAXE_NAME);
		this.setCreativeTab(Top.TabTop);
		
	}
	
}
