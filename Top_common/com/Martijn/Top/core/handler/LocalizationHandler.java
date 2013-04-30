package com.Martijn.Top.core.handler;

import com.Martijn.Top.core.helper.LocalizationHelper;
import com.Martijn.Top.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Top
 * 
 * LocalizationHandler
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class LocalizationHandler {
	public static void loadLanguages(){
		for(String LocationFile: Localizations.localeFiles){
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		}
	}
}
