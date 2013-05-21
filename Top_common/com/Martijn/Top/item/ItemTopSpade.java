package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemTopSpade extends ItemSpade {

	public ItemTopSpade(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.ITEMTOPSPADE_NAME);
	}

}
