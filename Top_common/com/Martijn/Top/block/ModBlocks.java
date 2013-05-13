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
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;

import com.Martijn.Top.lib.BlockIds;
import com.Martijn.Top.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {


	public static Block NewBlock;
	public static void BlocksInit(){
		NewBlock = new BlockNewBlock(BlockIds.NEWBLOCK_ID);

		GameRegistry.registerBlock(NewBlock, Strings.NEWBLOCK_NAME);
		
		recipesInit();
	}
	
	public static void recipesInit(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.NewBlock,3,0), new Object[]{
			"DDD","SSS","DDD",'D', Block.dirt, 'S', Block.stone
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.NewBlock, 2,0), new Object[]{
			new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.stone)
		});
		
		GameRegistry.addSmelting(Block.dirt.blockID, new ItemStack(ModBlocks.NewBlock,5,0), 1F);
		
		ItemStack enchant = new ItemStack(ModBlocks.NewBlock);
		enchant.addEnchantment(Enchantment.fortune, 2);
		
		GameRegistry.addRecipe(enchant, new Object[]{
				"DSD","DSD","DSD",'D', Block.dirt, 'S', Block.stone
		});
	}
}