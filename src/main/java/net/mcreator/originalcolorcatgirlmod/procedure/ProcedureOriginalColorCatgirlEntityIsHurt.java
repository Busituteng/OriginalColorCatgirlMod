package net.mcreator.originalcolorcatgirlmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.originalcolorcatgirlmod.ElementsOriginalColorCatgirlMod;

@ElementsOriginalColorCatgirlMod.ModElement.Tag
public class ProcedureOriginalColorCatgirlEntityIsHurt extends ElementsOriginalColorCatgirlMod.ModElement {
	public ProcedureOriginalColorCatgirlEntityIsHurt(ElementsOriginalColorCatgirlMod instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u5582\uFF01\u8FD9\u6837\u5B50\u5F88\u75BC\u7684\u55B5\uFF01"));
		}
	}
}
