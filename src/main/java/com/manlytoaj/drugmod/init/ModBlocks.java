package com.manlytoaj.drugmod.init;

import java.util.ArrayList;
import java.util.List;

import com.manlytoaj.drugmod.blocks.BlockBase;
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
}
