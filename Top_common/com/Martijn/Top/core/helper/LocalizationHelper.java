package com.Martijn.Top.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Top
 * 
 * LocalizationHelper
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class LocalizationHelper {

	public static boolean isXMLLanguageFile(String fileName){
		return fileName.endsWith(".xml");
	}
	
	public static String getLocaleFromFileName(String fileName){
		return fileName.substring(fileName.lastIndexOf("/")+1,fileName.lastIndexOf("."));
	}
	
	public static String getLocalizationString(String key){
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}
