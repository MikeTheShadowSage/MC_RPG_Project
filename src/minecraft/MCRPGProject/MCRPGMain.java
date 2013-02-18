package MCRPGProject;

import java.util.Random;
import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.*;



@Mod(modid = "RPGProject", name = "Minecraft RPG Project", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MCRPGMain {


	// Blocks, Tools, And item Class Declarations!

	public static int coolID;
	public static int blastID;



	public static int blastSides;


	// Items

	//TODO add Ice Ingots

	public void mod_SmeltCraft() {

	}

	static // Re Defines mod_SmeltCraft to have more Methods.

	{

	}

//Worldgen Would go here.

	// The instance of your mod that Forge uses.
	@Instance//("RPGProject")
	public static MCRPGMain instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "MCRPGProject.Client.ClientProxy", serverSide = "MCRPGProject.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		// Stub Method
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		//FMLCommonHandler.instance().showGuiScreen(new Guicool);
       // NetworkRegistry.instance().registerGuiHandler(instance, proxy);
        
        NetworkRegistry.instance().registerGuiHandler(this.instance, proxy);
		// Blocks
        
        //blocks.init();

		// Items
        
       // items.init();

		//ModLoader.addSmelting(oreAnditite.blockID, new ItemStack(andIngot));

		// Other (Such as TileEntity's!)

		// Example ModLoader.registerTileEntity(TileEntityBlast.class, "Blast");



		// Config File Section Soon-to-be!
		coolID = (126);
		blastID = (125);

		// Recipes

	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}


}
