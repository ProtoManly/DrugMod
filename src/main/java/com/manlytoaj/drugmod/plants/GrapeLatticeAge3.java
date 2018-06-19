package com.manlytoaj.drugmod.plants;

import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class GrapeLatticeAge3 extends LatticeBase {
	public GrapeLatticeAge3(String name) {
		super(name);
		setSoundType(SoundType.PLANT);
	}
	@Override
	public Item getDrop() {
		return(ModItems.GRAPE);
	}
	@Override
	public int getAge() {
		return(3);
	}
	@Override
	public Block growTo() {
		return(ModBlocks.GRAPE_LATTICE3);
	}
}
