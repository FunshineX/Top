package com.Martijn.Top.item;

import net.minecraft.item.Item;

public class ItemTop extends Item{
	public ItemTop(int id){
		super(id-256);
<<<<<<< HEAD
=======
<<<<<<< HEAD
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
=======
>>>>>>> Tutorial 15
>>>>>>> 488eace9ef59fc06efca56ad694589af5e24c408
	}
}
