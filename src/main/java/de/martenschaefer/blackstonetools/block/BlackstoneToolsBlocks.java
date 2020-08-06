package de.martenschaefer.blackstonetools.block;

import de.martenschaefer.blackstonetools.BlackstoneToolsMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public enum BlackstoneToolsBlocks {

 BLACKSTONE_FURNACE("blackstone_furnace", BlackstoneFurnaceBlock::new, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.8f, 3.8f).lightLevel(createLightLevelFromBlockState(13)), ItemGroup.DECORATIONS);

 private final Block block;
 private final Item item;

 BlackstoneToolsBlocks(String id, Function<AbstractBlock.Settings, Block> block, AbstractBlock.Settings settings, ItemGroup group) {

  this.block = Registry.register(Registry.BLOCK, new Identifier(BlackstoneToolsMod.MOD_ID, id), block.apply(settings));
  this.item = Registry.register(Registry.ITEM, new Identifier(BlackstoneToolsMod.MOD_ID, id), new BlockItem(this.block, new Item.Settings().group(group)));
 }
 public Block get() {

  return this.block;
 }
 public Item getItem() {

  return this.item;
 }
 private static ToIntFunction<BlockState> createLightLevelFromBlockState(int litLevel) {
  return (blockState) -> blockState.get(Properties.LIT)? litLevel : 0;
 }
 public static void registerBlocks() {

  // Load the class
 }
}