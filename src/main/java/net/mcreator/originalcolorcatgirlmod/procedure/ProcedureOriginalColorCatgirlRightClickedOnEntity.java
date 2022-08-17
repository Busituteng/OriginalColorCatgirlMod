package net.mcreator.originalcolorcatgirlmod.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.originalcolorcatgirlmod.ElementsOriginalColorCatgirlMod;

@ElementsOriginalColorCatgirlMod.ModElement.Tag
public class ProcedureOriginalColorCatgirlRightClickedOnEntity extends ElementsOriginalColorCatgirlMod.ModElement {
	public ProcedureOriginalColorCatgirlRightClickedOnEntity(ElementsOriginalColorCatgirlMod instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(
						new TextComponentString("\u773C\u775B\u91CC\u5192\u7231\u5FC3\u53EF\u4E0D\u662F\u4EC0\u4E48\u597D\u5146\u5934\u55B5~"));
		}
	}
}
