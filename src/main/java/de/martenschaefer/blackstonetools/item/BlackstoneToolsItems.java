package de.martenschaefer.blackstonetools.item;

import com.github.levoment.superaxes.Items.SuperAxeItem;
import com.github.levoment.superaxes.SuperAxesMaterialGenerator;
import com.github.levoment.superaxes.SuperAxesMod;
import de.martenschaefer.blackstonetools.BlackstoneToolsMod;
import draylar.magna.item.ExcavatorItem;
import draylar.ve.VanillaExcavators;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oriondev.mattocks.mattock.Mattock;
import java.util.function.Function;

public enum BlackstoneToolsItems {
 
	BLACKSTONE_PICKAXE("blackstone_pickaxe", BlackstonePickaxeItem::new, ItemGroup.TOOLS, true),
	BLACKSTONE_SWORD("blackstone_sword", BlackstoneSwordItem::new, ItemGroup.COMBAT, true),
	BLACKSTONE_AXE("blackstone_axe", BlackstoneAxeItem::new, ItemGroup.TOOLS, true),
	BLACKSTONE_SHOVEL("blackstone_shovel", BlackstoneShovelItem::new, ItemGroup.TOOLS, true),
	BLACKSTONE_HOE("blackstone_hoe", BlackstoneHoeItem::new, ItemGroup.TOOLS, true),
	BLACKSTONE_EXCAVATOR("blackstone_excavator", settings -> new ExcavatorItem(BlackstoneToolMaterials.EXCAVATOR, 4, -2.6f, settings), VanillaExcavators.GROUP, isModLoaded("vanillaexcavators")),
	BLACKSTONE_SUPERAXE("blackstone_superaxe", settings -> new SuperAxeItem(new SuperAxesMaterialGenerator(BlackstoneToolMaterials.TOOLS), settings),SuperAxesMod.SUPERAXES_GROUP, isModLoaded("lvmnt")),
	BLACKSTONE_MATTOCK("blackstone_mattock", settings -> new Mattock(3, -3, BlackstoneToolMaterials.TOOLS, settings), ItemGroup.TOOLS, isModLoaded("mattocks"));

	private final Item item;

	BlackstoneToolsItems(String id, Function<Item.Settings, Item> item, ItemGroup group, boolean register) {

  if(register) {

  	this.item = Registry.register(Registry.ITEM, new Identifier(BlackstoneToolsMod.MOD_ID, id), item.apply(new Item.Settings().group(group)));
		}
  else this.item = null;
	}
	public Item get() {

		return this.item;
	}
	private static boolean isModLoaded(String mod) {

		return FabricLoader.getInstance().isModLoaded(mod);
	}
	public static void registerItems() {

		// Load the class
	}
}