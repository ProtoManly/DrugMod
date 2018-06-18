package com.manlytoaj.drugmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.WEED, new ItemStack(ModItems.DRIED_WEED, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.WET_POWDER, new ItemStack(ModItems.COKE, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.TOBACCO_LEAF, new ItemStack(ModItems.DRIED_TOBACCO, 1), 0.0f);
		GameRegistry.addSmelting(ModItems.USED_NEEDLE, new ItemStack(ModItems.NEEDLE, 1), 0.0f);
	}
}
