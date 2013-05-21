package com.Martijn.Top.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Martijn.Top.lib.BlockIds;
import com.Martijn.Top.lib.ItemIds;
import com.Martijn.Top.lib.Reference;
import com.Martijn.Top.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHander {
	public static Configuration config;
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
			
			BlockIds.NEWBLOCK_ID = config.getBlock(Strings.NEWBLOCK_NAME, BlockIds.NEWBLOCK_ID_DEFAULT).getInt(BlockIds.NEWBLOCK_ID_DEFAULT);
			ItemIds.BLACKSTICK_ID = config.getItem(Strings.BLACKSTICK_NAME, ItemIds.BLACKSTICK_ID_DEFAULT).getInt(ItemIds.BLACKSTICK_ID_DEFAULT);
			ItemIds.ITEMTOPPICKAXE_ID = config.getItem(Strings.ITEMTOPPICKAXE_NAME, ItemIds.ITEMTOPPICKAXE_ID_DEFAULT).getInt(ItemIds.ITEMTOPPICKAXE_ID_DEFAULT);
			
		}
		catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
		}
		finally{
			config.save();
		}
		
	}
}
