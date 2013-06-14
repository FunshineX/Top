package com.Martijn.Top.item;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Reference;
import com.Martijn.Top.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemTopAxe extends ItemAxe {

	public ItemTopAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super((par1-256), par2EnumToolMaterial);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.ITEMTOPAXE_NAME);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}