package com.Martijn.Top.block;

/**
 * Top
 * 
 * NewBlock
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class NewBlock extends BlockTop {
	public NewBlock(int id){
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("NewBlock");
	}

}
