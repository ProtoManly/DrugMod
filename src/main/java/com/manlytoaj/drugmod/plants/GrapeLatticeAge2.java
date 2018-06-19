package com.manlytoaj.drugmod.plants;

import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class GrapeLatticeAge2 extends LatticeBase {
	public GrapeLatticeAge2(String name) {
		super(name);
		setSoundType(SoundType.PLANT);
	}
	@Override
	public int getAge() {
		return(2);
	}
	@Override
	public Block growTo() {
		return(ModBlocks.GRAPE_LATTICE3);
	}
}
