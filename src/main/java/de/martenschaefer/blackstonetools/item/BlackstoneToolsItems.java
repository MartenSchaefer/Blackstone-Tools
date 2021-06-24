package de.martenschaefer.blackstonetools.item;

import java.util.function.Function;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.loader.api.FabricLoader;
import de.martenschaefer.blackstonetools.BlackstoneToolsMod;

public enum BlackstoneToolsItems {
    BLACKSTONE_PICKAXE("blackstone_pickaxe", BlackstonePickaxeItem::new, ItemGroup.TOOLS, true),
    BLACKSTONE_SWORD("blackstone_sword", BlackstoneSwordItem::new, ItemGroup.COMBAT, true),
    BLACKSTONE_AXE("blackstone_axe", BlackstoneAxeItem::new, ItemGroup.TOOLS, true),
    BLACKSTONE_SHOVEL("blackstone_shovel", BlackstoneShovelItem::new, ItemGroup.TOOLS, true),
    BLACKSTONE_HOE("blackstone_hoe", BlackstoneHoeItem::new, ItemGroup.TOOLS, true);
    // BLACKSTONE_EXCAVATOR("blackstone_excavator", settings -> new ExcavatorItem(BlackstoneToolMaterials.EXCAVATOR, 4, -2.6f, settings), VanillaExcavators.GROUP, isModLoaded("vanillaexcavators")),
    // BLACKSTONE_SUPERAXE("blackstone_superaxe", settings -> new SuperAxeItem(new SuperAxesMaterialGenerator(BlackstoneToolMaterials.TOOLS), settings),SuperAxesMod.SUPERAXES_GROUP, isModLoaded("lvmnt")),
    // BLACKSTONE_MATTOCK("blackstone_mattock", settings -> new Mattock(3, -3, BlackstoneToolMaterials.TOOLS, settings), ItemGroup.TOOLS, isModLoaded("mattocks"));

    private final Item item;

    BlackstoneToolsItems(String id, Function<Item.Settings, Item> item, ItemGroup group, boolean register) {
        if (register) {
            this.item = Registry.register(Registry.ITEM, new Identifier(BlackstoneToolsMod.MODID, id), item.apply(new Item.Settings().group(group)));
        } else this.item = null;
    }

    public Item get() {
        return this.item;
    }

    private static boolean isModLoaded(String mod) {
        return FabricLoader.getInstance().isModLoaded(mod);
    }

    public static void init() {
        // Load the class
    }
}
