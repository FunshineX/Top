package com.Martijn.Top.item;

import net.minecraft.item.Item;

public class ItemTop extends Item{
	public ItemTop(int id){
		super(id-256);
<<<<<<< HEAD
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
=======
>>>>>>> Tutorial 15
	}
}
