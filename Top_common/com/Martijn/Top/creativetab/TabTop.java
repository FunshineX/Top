package com.Martijn.Top.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.Martijn.Top.item.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabTop extends CreativeTabs {
	public TabTop(int id, String name){
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack(){
	
		return new ItemStack(ModItems.BlackStick,1,0);
		
	}
	
}
