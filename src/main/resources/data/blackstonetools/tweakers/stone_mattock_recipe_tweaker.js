var RecipeTweaker = libcd.require("libcd.recipe.RecipeTweaker");

RecipeTweaker.removeRecipe("mattocks:stone_mattock");
RecipeTweaker.removeRecipe("mattocks:stone_mattock2");

RecipeTweaker.addShaped(
 [["minecraft:cobblestone", "minecraft:cobblestone", "minecraft:cobblestone"],
  ["minecraft:cobblestone", "minecraft:stick", null],
  [null, "minecraft:stick", null]],
 "mattocks:stone_mattock");

RecipeTweaker.addShaped(
 [["minecraft:cobblestone", "minecraft:cobblestone", "minecraft:cobblestone"],
  [null, "minecraft:stick", "minecraft:cobblestone"],
  [null, "minecraft:stick", "minecraft:cobblestone"]],
 "mattocks:stone_mattock");