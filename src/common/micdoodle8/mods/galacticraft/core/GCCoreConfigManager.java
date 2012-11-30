package micdoodle8.mods.galacticraft.core;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

/**
 * Copyright 2012, micdoodle8
 * 
 *  All rights reserved.
 *
 */
public class GCCoreConfigManager 
{
	public static boolean loaded;
	
	static Configuration configuration;
	
	public GCCoreConfigManager(File file)
	{
		if (!loaded)
		{
			configuration = new Configuration(file);
			setDefaultValues();
		}
	}

	// BLOCKS
	public static int idBlockID;
	
	public static int idBlockBreatheableAir;
	public static int idBlockTreasureChest;
	public static int idBlockLandingPad;
	public static int idBlockUnlitTorch;
	public static int idBlockUnlitTorchLit;
	public static int idBlockAirDistributor;
	public static int idBlockAirDistributorActive;
	public static int idBlockAirPipe;
	public static int idBlockAirCollector;
	public static int idBlockOre;
	public static int idBlockSapling2;
	public static int idBlockRocketBench;
	public static int idBlockFallenMeteor;

	// ITEMS
	public static int idItemLightOxygenTank;
	public static int idItemLightOxygenTankEmpty;
	public static int idItemMedOxygenTank;
	public static int idItemMedOxygenTankEmpty;
	public static int idItemHeavyOxygenTank;
	public static int idItemHeavyOxygenTankEmpty;
	public static int idItemSpaceship;
	public static int idItemIngotTitanium;
	public static int idItemIngotCopper;
	public static int idItemIngotAluminum;
	public static int idItemAluminumCanister;
	public static int idItemAirVent;
	public static int idItemOxygenConcentrator;
	public static int idItemFan;
	public static int idItemGravityBow;
	public static int idItemRocketEngine;
	public static int idItemHeavyPlate;
	public static int idItemRocketNoseCone;
	public static int idItemRocketFins;
	public static int idItemSensorLens;
	public static int idItemBuggy;
	public static int idItemFlag;
	
	// ARMOR
	public static int idArmorOxygenMask;
	public static int idArmorSensorGlasses;
	public static int idArmorSensorGlassesWithOxygenMask;
	public static int idArmorTitaniumHelmet;
	public static int idArmorTitaniumChestplate;
	public static int idArmorTitaniumLeggings;
	public static int idArmorTitaniumBoots;
	public static int idArmorTitaniumHelmetBreathable;

	// TOOLS
	public static int idToolTitaniumSword;
	public static int idToolTitaniumPickaxe;
	public static int idToolTitaniumAxe;
	public static int idToolTitaniumSpade;
	public static int idToolTitaniumHoe;
	
	// GUI
	public static int idGuiTankRefill;
	public static int idGuiAirDistributor;
	public static int idGuiRocketCraftingBench;
	public static int idGuiBuggyCraftingBench;
	
	// ACHIEVEMENTS
	public static int idAchievBase;
	
	public static int idEntityEvolvedSpider;
	public static int idEntityEvolvedCreeper;
	public static int idEntityEvolvedZombie;
	public static int idEntityEvolvedSkeleton;
	public static int idEntitySpaceship;
	public static int idEntityAntiGravityArrow;
	public static int idEntityMeteor;
	public static int idEntityBuggy;
	public static int idEntityFlag;
	
	// GENERAL
	public static boolean transparentBreathableAir;
	
	private void setDefaultValues()
    {
		try
		{
	        configuration.load();
	        
	        idBlockID = 							configuration.get(configuration.CATEGORY_BLOCK, "idBlock", 								3349)		.getInt(3349);
	        
	        idBlockBreatheableAir = 				configuration.get(configuration.CATEGORY_BLOCK, "idBlockCoreBreatheableAir", 			3350)		.getInt(3350);
	        idBlockTreasureChest = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockTreasureChest", 				3351)		.getInt(3351);
	        idBlockLandingPad = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockLandingPad", 					3352)		.getInt(3352);
	        idBlockUnlitTorch = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockUnlitTorch", 					3353)		.getInt(3353);
	        idBlockUnlitTorchLit = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockUnlitTorchLit", 				3354)		.getInt(3354);
	        idBlockAirDistributor = 				configuration.get(configuration.CATEGORY_BLOCK, "idBlockAirDistributor", 				3355)		.getInt(3355);
	        idBlockAirDistributorActive = 			configuration.get(configuration.CATEGORY_BLOCK, "idBlockAirDistributorActive", 			3356)		.getInt(3356);
	        idBlockAirPipe = 						configuration.get(configuration.CATEGORY_BLOCK, "idBlockAirPipe", 						3357)		.getInt(3357);
	        idBlockAirCollector = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockAirCollector", 					3358)		.getInt(3358);
	        idBlockOre = 							configuration.get(configuration.CATEGORY_BLOCK, "idBlockOre", 							3359)		.getInt(3359);
	        idBlockSapling2 = 						configuration.get(configuration.CATEGORY_BLOCK, "idBlockSapling2", 						3360)		.getInt(3360);
	        idBlockRocketBench = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockRocketBench", 					3361)		.getInt(3361);
	        idBlockFallenMeteor = 					configuration.get(configuration.CATEGORY_BLOCK, "idBlockFallenMeteor", 					3362)		.getInt(3362);

	        idItemLightOxygenTankEmpty = 			configuration.get(configuration.CATEGORY_BLOCK, "idItemLightOxygenTankEmpty", 			9854)		.getInt(9854);
	        idItemLightOxygenTank = 				configuration.get(configuration.CATEGORY_BLOCK, "idItemLightOxygenTank", 				9855)		.getInt(9855);
	        idItemMedOxygenTankEmpty = 				configuration.get(configuration.CATEGORY_BLOCK, "idItemMedOxygenTankEmpty", 			9856)		.getInt(9856);
	        idItemMedOxygenTank = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemMedOxygenTank", 					9857)		.getInt(9857);
	        idItemHeavyOxygenTank = 				configuration.get(configuration.CATEGORY_BLOCK, "idItemHeavyOxygenTank", 				9858)		.getInt(9858);
	        idItemHeavyOxygenTankEmpty = 			configuration.get(configuration.CATEGORY_BLOCK, "idItemHeavyOxygenTankEmpty",			9859)		.getInt(9859);
	        idArmorOxygenMask = 					configuration.get(configuration.CATEGORY_BLOCK, "idArmorOxygenMask", 					9860)		.getInt(9860);
	        idItemSpaceship = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemSpaceship", 						9861)		.getInt(9861);
	        idArmorSensorGlasses = 					configuration.get(configuration.CATEGORY_BLOCK, "idArmorSensorGlasses", 				9862)		.getInt(9862);
	        idArmorSensorGlassesWithOxygenMask = 	configuration.get(configuration.CATEGORY_BLOCK, "idArmorSensorGlassesWithOxygenMask", 	9863)		.getInt(9863);
	        idItemIngotTitanium = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemIngotTitanium", 					9864)		.getInt(9864);
	        idItemIngotCopper = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemIngotCopper", 					9865)		.getInt(9865);
	        idItemIngotAluminum = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemIngotAluminum", 					9866)		.getInt(9866);
	        idItemAluminumCanister = 				configuration.get(configuration.CATEGORY_BLOCK, "idItemAluminumCanister", 				9867)		.getInt(9867);
	        idItemAirVent = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemAirVent", 						9868)		.getInt(9868);
	        idItemOxygenConcentrator = 				configuration.get(configuration.CATEGORY_BLOCK, "idItemOxygenConcentrator", 			9869)		.getInt(9869);
	        idItemFan = 							configuration.get(configuration.CATEGORY_BLOCK, "idItemFan", 							9870)		.getInt(9870);
	        idItemGravityBow = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemGravityBow", 					9871)		.getInt(9871);
	        idItemRocketEngine = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemRocketEngine", 					9872)		.getInt(9872);
	        idItemHeavyPlate = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemHeavyPlate", 					9873)		.getInt(9873);
	        idItemRocketNoseCone = 					configuration.get(configuration.CATEGORY_BLOCK, "idItemRocketNoseCone", 				9874)		.getInt(9874);
	        idItemRocketFins = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemRocketFins", 					9875)		.getInt(9875);
	        idItemSensorLens = 						configuration.get(configuration.CATEGORY_BLOCK, "idItemSensorLens", 					9886)		.getInt(9886);
	        idItemBuggy = 							configuration.get(configuration.CATEGORY_BLOCK, "idItemBuggyPlacer", 					9887)		.getInt(9887);
	        idItemFlag = 							configuration.get(configuration.CATEGORY_BLOCK, "idItemFlagPlacer", 					9888)		.getInt(9888);
	        
	        idToolTitaniumSword = 					configuration.get(configuration.CATEGORY_BLOCK, "idToolTitaniumSword", 					9876)		.getInt(9876);
	        idToolTitaniumPickaxe = 				configuration.get(configuration.CATEGORY_BLOCK, "idToolTitaniumPickaxe", 				9877)		.getInt(9877);
	        idToolTitaniumSpade = 					configuration.get(configuration.CATEGORY_BLOCK, "idToolTitaniumSpade", 					9878)		.getInt(9878);
	        idToolTitaniumHoe = 					configuration.get(configuration.CATEGORY_BLOCK, "idToolTitaniumHoe", 					9879)		.getInt(9879);
	        idToolTitaniumAxe = 					configuration.get(configuration.CATEGORY_BLOCK, "idToolTitaniumAxe", 					9880)		.getInt(9880);

	        idArmorTitaniumHelmet = 				configuration.get(configuration.CATEGORY_BLOCK, "idArmorTitaniumHelmet", 				9881)		.getInt(9881);
	        idArmorTitaniumChestplate = 			configuration.get(configuration.CATEGORY_BLOCK, "idArmorTitaniumChestplate", 			9882)		.getInt(9882);
	        idArmorTitaniumLeggings = 				configuration.get(configuration.CATEGORY_BLOCK, "idArmorTitaniumLeggings", 				9883)		.getInt(9883);
	        idArmorTitaniumBoots = 					configuration.get(configuration.CATEGORY_BLOCK, "idArmorTitaniumBoots", 				9884)		.getInt(9884);
	        idArmorTitaniumHelmetBreathable = 		configuration.get(configuration.CATEGORY_BLOCK, "idArmorTitaniumHelmetBreathable", 		9885)		.getInt(9885);

	        idGuiTankRefill = 						configuration.get("GUI", "idGuiTankRefill", 											128)		.getInt(128);
	        idGuiAirDistributor = 					configuration.get("GUI", "idGuiAirDistributor", 										129)		.getInt(129);
	        idGuiRocketCraftingBench = 				configuration.get("GUI", "idGuiRocketCraftingBench", 									130)		.getInt(130);
	        idGuiBuggyCraftingBench = 				configuration.get("GUI", "idGuiBuggyCraftingBench", 									131)		.getInt(131);
	        
	        idAchievBase = 							configuration.get("Achievements", "idAchievBase", 										1784)		.getInt(1784);

	        idEntityEvolvedSpider = 				configuration.get("Entities", "idEntityEvolvedSpider", 									155)		.getInt(155);
	        idEntityEvolvedCreeper = 				configuration.get("Entities", "idEntityEvolvedCreeper", 								156)		.getInt(156);
	        idEntityEvolvedZombie = 				configuration.get("Entities", "idEntityEvolvedZombie", 									157)		.getInt(157);
	        idEntityEvolvedSkeleton = 				configuration.get("Entities", "idEntityEvolvedSkeleton", 								158)		.getInt(158);
	        idEntitySpaceship = 					configuration.get("Entities", "idEntitySpaceship", 										159)		.getInt(159);
	        idEntityAntiGravityArrow = 				configuration.get("Entities", "idEntityAntiGravityArrow", 								160)		.getInt(160);
	        idEntityMeteor = 						configuration.get("Entities", "idEntityMeteor", 										161)		.getInt(161);
	        idEntityBuggy = 						configuration.get("Entities", "idEntityBuggy", 											162)		.getInt(162);
	        idEntityFlag = 							configuration.get("Entities", "idEntityFlag", 											163)		.getInt(163);
	        
	        transparentBreathableAir = 				configuration.get(configuration.CATEGORY_GENERAL, "transparentBreathableAir", 			true)		.getBoolean(true);
		}
		catch (Exception e)
		{
			FMLLog.log(Level.SEVERE, e, "Galacticraft Core has a problem loading it's configuration");
		}
		finally 
		{
			configuration.save();
			loaded = true;
		}
    }
}
