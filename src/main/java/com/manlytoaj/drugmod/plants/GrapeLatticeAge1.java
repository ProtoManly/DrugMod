package com.manlytoaj.drugmod.plants;

import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class GrapeLatticeAge1 extends LatticeBase {
	public GrapeLatticeAge1(String name) {
		super(name);
	}
	@Override
	public int getAge() {
		return(1);
	}
	@Override
	public Block growTo() {
		return(ModBlocks.GRAPE_LATTICE2);
	}
}
