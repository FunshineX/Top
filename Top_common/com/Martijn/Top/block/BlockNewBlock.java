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

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import com.Martijn.Top.Top;
import com.Martijn.Top.item.ModItems;
import com.Martijn.Top.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNewBlock extends BlockTop {
	public BlockNewBlock(int id){
		super(id, Material.rock);
		this.setCreativeTab(Top.TabTop);
		this.setUnlocalizedName(Strings.NEWBLOCK_NAME);
	}
	
	@Override
	public int idDropped(int i, Random rand, int j){
		return ModItems.BlackStick.itemID;
	}
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random){
		float f1 = (float)x + 0.5F;
		float f2 = (float)y + 1.1F;
		float f3 = (float)z + 0.5F;
		float f4 = random.nextFloat() * 0.6F -0.3F;
		float f5 = random.nextFloat() * -0.6F - -0.3F;
		
		world.spawnParticle("smoke", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
		world.spawnParticle("flame", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
	}
}