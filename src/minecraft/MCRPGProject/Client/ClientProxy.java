package MCRPGProject.Client;

import net.minecraftforge.client.MinecraftForgeClient;
import MCRPGProject.CommonProxy;

public abstract class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		
		
	}
	
}