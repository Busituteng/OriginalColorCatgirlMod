package net.mcreator.originalcolorcatgirlmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.originalcolorcatgirlmod.ElementsOriginalColorCatgirlMod;

@ElementsOriginalColorCatgirlMod.ModElement.Tag
public class ProcedureOriginalColorCatgirlEntityDies extends ElementsOriginalColorCatgirlMod.ModElement {
	public ProcedureOriginalColorCatgirlEntityDies(ElementsOriginalColorCatgirlMod instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u4F60\u4E2A\u574F\u4EBA\u55B5..."));
		}
	}
}
