package com.Martijn.Top.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockItemTop extends ItemBlock{
	public BlockItemTop(int id){
		super(id);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemStack){
		String name = "";
		
		switch(itemStack.getItemDamage()){
		case 0: { name = "0"; break;}
		case 1: { name = "1"; break;}
		case 2: { name = "2"; break;}
		case 3: { name = "3"; break;}
		case 4: { name = "4"; break;}
		case 5: { name = "5"; break;}
		case 6: { name = "6"; break;}
		case 7: { name = "7"; break;}
		}
		return this.getUnlocalizedName() + name;
	}
	
	public int getMeta (int meta){
		return meta;
	}
}
