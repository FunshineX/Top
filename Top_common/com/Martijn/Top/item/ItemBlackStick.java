package com.Martijn.Top.item;

import com.Martijn.Top.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;

public class ItemBlackStick extends ItemTop {
	public ItemBlackStick(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(Strings.BLACKSTICK_NAME);
	}
}
