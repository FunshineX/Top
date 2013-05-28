package com.Martijn.Top.world.generator;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.Martijn.Top.block.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class TopWorldGenerator implements IWorldGenerator{

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:  generateOverworld   (world, random, chunkX * 16, chunkZ * 16);
		case 1:  generateEnd		 (world, random, chunkX * 16, chunkZ * 16);
		case -1: generateNether      (world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
	
	/**
	 * 
	 * This is where you add blocks which you want to spawn in the overworld. See example
	 */
	
	public void generateOverworld (World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(ModBlocks.NewBlock, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, 50, 0, 50);
	}
	
	public void generateEnd (World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(ModBlocks.NewBlock, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 5, 50, 0, 50);
	}

	public void generateNether (World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(ModBlocks.NewBlock, Block.netherrack, world, random, chunkX, chunkZ, 16, 16, 5, 50, 0, 50);
	}

	/**
	 * 
	 * This Method adds ore generation. See below what all params mean
	 * 
	 * @param Block which you want to spawn
	 * @param World where you want it to spawn
	 * @param Randomizer used for spawning
	 * @param Start of the Chunk in X-Direction
	 * @param Start of the Chunk in Z-Direction
	 * @param Max X-Size where the block can spawn, normal = 16
	 * @param Max Z-Size where the block can spawn, normal = 16
	 * @param The vain size
	 * @param The chance to spawn a block
	 * @param Minimum Y-level to spawn block
	 * @param Maximum Y-level to spawn block
	 * 
	 */
	
	public void spawnOres(Block block, Block blockReplaced, World world, Random random, int chunkX, int chunkZ, int XMax, int ZMax, int vainSize, int spawnChance, int YMin, int YMax){
		for(int i = 0; i < spawnChance; i ++){
			int posX = chunkX + random.nextInt(XMax);
			int posZ = chunkZ + random.nextInt(ZMax);
			int posY = YMin + random.nextInt(YMax-YMin);
			(new WorldGenMinable(block.blockID, vainSize, blockReplaced.blockID)).generate(world, random, posX, posY, posZ);
		}
	}
	

}
