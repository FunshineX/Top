package com.Martijn.Top.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Reference;
import com.Martijn.Top.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockMetaBlock extends BlockTop {

	public BlockMetaBlock(int id){
		
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.BLOCKMETA_NAME);
		this.setCreativeTab(Top.TabTop);
	}
	
	public Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconReg){
		icons = new Icon[8];
		for(int i = 0; i < icons.length ; i++){
			icons[i] = iconReg.registerIcon(Reference.MOD_ID+ ":" + (this.getUnlocalizedName2()) + i );
		}
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int i, int j){
		return icons[j];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs creativeTabe, List list){
		for(int i = 0; i < 8 ; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
}