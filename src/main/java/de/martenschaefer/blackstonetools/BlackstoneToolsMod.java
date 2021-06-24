package de.martenschaefer.blackstonetools;

import net.fabricmc.api.ModInitializer;
import de.martenschaefer.blackstonetools.block.BlackstoneToolsBlocks;
import de.martenschaefer.blackstonetools.item.BlackstoneToolsItems;

public class BlackstoneToolsMod implements ModInitializer {
    public static final String MODID = "blackstonetools";

    @Override
    public void onInitialize() {
        BlackstoneToolsItems.init();
        BlackstoneToolsBlocks.init();

        // ModItems.mapOfIdentifiers.put(new Identifier(MODID, "blackstone_superaxe"), BlackstoneToolsItems.BLACKSTONE_SUPERAXE.get());
    }
}