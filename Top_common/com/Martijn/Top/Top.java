package com.Martijn.Top;

import java.io.File;

import com.Martijn.Top.block.ModBlocks;
import com.Martijn.Top.configuration.ConfigurationHander;
import com.Martijn.Top.core.handler.LocalizationHandler;
import com.Martijn.Top.core.proxy.CommonProxy;
import com.Martijn.Top.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * Top
 * 
 * Top
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(
		modid= Reference.MOD_ID ,
		name = Reference.MOD_NAME,
		version = Reference.VERSION)

@NetworkMod(
		channels = {Reference.CHANNEL_NAME},
		serverSideRequired = false,
		clientSideRequired = true)

public class Top {
	
	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		ModBlocks.BlocksInit();
		
		LocalizationHandler.loadLanguages();
		
		ConfigurationHander.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

	}
	@Init
	public void init(FMLInitializationEvent event){
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}

}
