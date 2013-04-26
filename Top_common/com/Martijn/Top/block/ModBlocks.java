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

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	
	public static Block NewBlock;
	public static void BlocksInit(){
		NewBlock = new NewBlock(190);
		
		GameRegistry.registerBlock(NewBlock);
	}
}
