package com.manlytoaj.drugmod.init;

import java.util.ArrayList;
import java.util.List;

import com.manlytoaj.drugmod.blocks.BlockBase;
import com.manlytoaj.drugmod.blocks.Lattice;
import com.manlytoaj.drugmod.items.ItemBase;
import com.manlytoaj.drugmod.plants.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block WEED_PLANT = new Weed_Plant("weed_plant");
	public static final Block TOBACCO_PLANT = new Tobacco_Plant("tobacco_plant");
	public static final Block COCA_PLANT = new Coca_Plant("coca_plant");
	public static final Block POPPY_PLANT = new Poppy_Plant("poppy_plant");
	public static final Block LATTICE = new Lattice("lattice");
	public static final Block GRAPE_LATTICE0 = new GrapeLatticeAge0("grape_lattice0");
	public static final Block GRAPE_LATTICE1 = new GrapeLatticeAge1("grape_lattice1");
	public static final Block GRAPE_LATTICE2 = new GrapeLatticeAge2("grape_lattice2");
	public static final Block GRAPE_LATTICE3 = new GrapeLatticeAge3("grape_lattice3");
}
