package com.manlytoaj.drugmod.items;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
	public FoodBase(String name, int ammount, float saturation, boolean isWolfFood) {
		super(ammount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DrugModTab);
		this.setAlwaysEdible();
		
		ModItems.ITEMS.add(this);
		ModItems.FOODS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}
}
