package MCRPGProject.Load;


import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//import SmeltCraft.BlockIds;
import net.minecraft.src.*;

public class blocks {
    
    /* Block name constants */

	
    /* Mod block instances */


	public static void init() {
		

		// TODO: NeedsChanging.addSmelting(oreAnditite.blockID, new ItemStack(items.andIngot));

		/*
		calcinator = new BlockCalcinator(BlockIds.CALCINATOR).setBlockName(CALCINATOR_NAME);
		redWaterStill = new BlockRedWaterStill(BlockIds.RED_WATER_STILL, Material.water);
		redWaterFlowing = new BlockRedWaterFlowing(BlockIds.RED_WATER_STILL - 1, Material.water);
		
		LanguageRegistry.addName(calcinator, "Calcinator");
		LanguageRegistry.addName(redWaterStill, "Red Water (Still)");
		LanguageRegistry.addName(redWaterFlowing, "Red Water (Flowing)");
		
		GameRegistry.registerBlock(calcinator);
		GameRegistry.registerBlock(redWaterStill);
		GameRegistry.registerBlock(redWaterFlowing);*/
		
		initBlockRecipes();
		
	}
	
	private static void initBlockRecipes() {
	    

	    
	}

}
