package de.martenschaefer.blackstonetools;

import com.github.levoment.superaxes.Items.ModItems;
import de.martenschaefer.blackstonetools.block.BlackstoneToolsBlocks;
import de.martenschaefer.blackstonetools.item.BlackstoneToolsItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class BlackstoneToolsMod implements ModInitializer {
 
 public static final String MOD_ID = "blackstonetools";
 
 @Override
 public void onInitialize() {

 	BlackstoneToolsItems.registerItems();
  BlackstoneToolsBlocks.registerBlocks();

 	ModItems.mapOfIdentifiers.put(new Identifier(MOD_ID, "blackstone_superaxe"), BlackstoneToolsItems.BLACKSTONE_SUPERAXE.get());
	}
}