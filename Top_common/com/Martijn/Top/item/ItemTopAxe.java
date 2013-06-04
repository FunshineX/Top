package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemTopAxe extends ItemAxe {

	public ItemTopAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super((par1-256), par2EnumToolMaterial);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.ITEMTOPAXE_NAME);
	}

}
