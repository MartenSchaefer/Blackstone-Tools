package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum BlackstoneToolMaterials implements ToolMaterial {
    TOOLS(131, 4.0f, 1.0f),
    EXCAVATOR(856, 1.155f, 1.0f);

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final Lazy<Ingredient> repairIngredient;

    BlackstoneToolMaterials(int itemDurability, float miningSpeed, float attackDamage) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.repairIngredient = new Lazy<>(() -> Ingredient.ofItems(Items.BLACKSTONE));
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 7;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
