package com.Martijn.Top.block;

/**
 * Top
 * 
 * ModBlocks
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

import net.minecraft.block.Block;

import com.Martijn.Top.lib.BlockIds;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {


	public static Block NewBlock;
	public static void BlocksInit(){
		NewBlock = new BlockNewBlock(BlockIds.NEWBLOCK_ID);

		GameRegistry.registerBlock(NewBlock);
	}
}