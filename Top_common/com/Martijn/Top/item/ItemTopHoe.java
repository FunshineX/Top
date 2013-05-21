package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemTopHoe extends ItemHoe {

	public ItemTopHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.ITEMTOPHOE_NAME);
	}

}
