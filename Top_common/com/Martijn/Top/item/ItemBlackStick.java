package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;

public class ItemBlackStick extends ItemTop {
	public ItemBlackStick(int id){
		super(id);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.BLACKSTICK_NAME);
	}
}
