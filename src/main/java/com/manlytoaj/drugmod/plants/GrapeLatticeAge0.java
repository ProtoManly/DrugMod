package com.manlytoaj.drugmod.plants;

import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class GrapeLatticeAge0 extends LatticeBase {
	public GrapeLatticeAge0(String name) {
		super(name);
	}
	@Override
	public int getAge() {
		return(0);
	}
	@Override
	public Block growTo() {
		return(ModBlocks.GRAPE_LATTICE1);
	}
}
