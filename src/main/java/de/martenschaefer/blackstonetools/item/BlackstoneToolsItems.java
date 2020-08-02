package de.martenschaefer.blackstonetools.item;

import com.github.levoment.superaxes.Items.SuperAxeItem;
import com.github.levoment.superaxes.SuperAxesMaterialGenerator;
import com.github.levoment.superaxes.SuperAxesMod;
import draylar.magna.item.ExcavatorItem;
import draylar.ve.VanillaExcavators;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.oriondev.mattocks.mattock.Mattock;

public class BlackstoneToolsItems {
 
	public static final Item BLACKSTONE_PICKAXE = new BlackstonePickaxeItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_SWORD = new BlackstoneSwordItem(new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item BLACKSTONE_AXE = new BlackstoneAxeItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_SHOVEL = new BlackstoneShovelItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_HOE = new BlackstoneHoeItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final ExcavatorItem BLACKSTONE_EXCAVATOR = FabricLoader.getInstance().isModLoaded("vanillaexcavators")?
									new ExcavatorItem(BlackstoneToolMaterials.EXCAVATOR, 4, -2.6f, new Item.Settings().group(VanillaExcavators.GROUP)) : null;
	public static final SuperAxeItem BLACKSTONE_SUPERAXE = FabricLoader.getInstance().isModLoaded("lvmnt")?
									new SuperAxeItem(new SuperAxesMaterialGenerator(BlackstoneToolMaterials.TOOLS), new Item.Settings().group(SuperAxesMod.SUPERAXES_GROUP)) : null;
	public static final Mattock BLACKSTONE_MATTOCK = FabricLoader.getInstance().isModLoaded("mattocks")?
									new Mattock(3, -3, BlackstoneToolMaterials.TOOLS, new Item.Settings().group(ItemGroup.TOOLS)) : null;
}