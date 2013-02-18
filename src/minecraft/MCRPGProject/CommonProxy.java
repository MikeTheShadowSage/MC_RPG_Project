package MCRPGProject;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.*;
import MCRPGProject.Library.GuiIds;

public abstract class CommonProxy implements IGuiHandler{
	public static String ITEMS_PNG = "/SmeltCraft/MTSS/items.png";
	public static String BLOCK_PNG = "/SmeltCraft/MTSS/block.png";

	// Client stuff
	public void registerRenderers() {
		// Nothing here as this is the server side proxy
	}


	
   
}