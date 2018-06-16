package com.manlytoaj.drugmod.creative;

import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabBase extends CreativeTabs {
	public CreativeTabBase(int par1, String par2) {
		super(par1, par2);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.WEED, 1, 0);
	}
	public String getTranslatedTabLabel(){
		return "Drug Mod";
	}
	@Override
	public ItemStack getTabIconItem() {
		return null;
	}
}
