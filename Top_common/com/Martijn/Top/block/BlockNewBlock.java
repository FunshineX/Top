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

import com.Martijn.Top.Top;
import com.Martijn.Top.lib.Strings;

public class BlockNewBlock extends BlockTop {
	public BlockNewBlock(int id){
		super(id, Material.rock);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.NEWBLOCK_NAME);
	}
}