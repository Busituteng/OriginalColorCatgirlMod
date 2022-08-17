
package net.mcreator.originalcolorcatgirlmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.originalcolorcatgirlmod.item.ItemLogo;
import net.mcreator.originalcolorcatgirlmod.ElementsOriginalColorCatgirlMod;

@ElementsOriginalColorCatgirlMod.ModElement.Tag
public class TabOCCM extends ElementsOriginalColorCatgirlMod.ModElement {
	public TabOCCM(ElementsOriginalColorCatgirlMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("taboccm") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
