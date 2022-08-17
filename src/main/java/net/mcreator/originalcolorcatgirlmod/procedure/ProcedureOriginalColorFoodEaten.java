package net.mcreator.originalcolorcatgirlmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.originalcolorcatgirlmod.ElementsOriginalColorCatgirlMod;

@ElementsOriginalColorCatgirlMod.ModElement.Tag
public class ProcedureOriginalColorFoodEaten extends ElementsOriginalColorCatgirlMod.ModElement {
	public ProcedureOriginalColorFoodEaten(ElementsOriginalColorCatgirlMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OriginalColorFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 40, (int) 1));
	}
}
