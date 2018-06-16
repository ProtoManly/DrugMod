package com.manlytoaj.drugmod.init;

import java.util.ArrayList;
import java.util.List;

import com.manlytoaj.drugmod.foods.*;
import com.manlytoaj.drugmod.items.FoodBase;
import com.manlytoaj.drugmod.items.ItemBase;
import com.manlytoaj.drugmod.items.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {
	public static final List <Item> ITEMS = new ArrayList<Item>();
	public static final List <ItemFood> FOODS = new ArrayList<ItemFood>();
	
	//Tools
	public static final Item KNIFE = new ItemBase("knife");
	
	//Cocaine
	public static final Item COCA_LEAF = new ItemBase("coca_leaf");
	public static final Item COCA_SEEDS = new Coca_Seed("coca_seeds");
	public static final Item CRUSHED_COCA = new ItemBase("crushed_coca");
	public static final Item POWDER = new ItemBase("powder");
	public static final Item WET_POWDER = new ItemBase("wet_powder");
	public static final ItemFood COKE = new FoodCoke("coke", 0, 0.5f, false);
	
	//Cannabis
	public static final Item CANNABIS_OIL = new ItemBase("cannabis_oil");
	public static final ItemFood CANNABIS_PILL = new FoodCannabis_Pill("cannabis_pill", 0, 0.5f, false);
	public static final Item DRIED_WEED = new ItemBase("dried_weed");
	public static final ItemFood FILLED_BONG = new FoodFilled_Bong("filled_bong", 0, 0.5f, false);
	public static final ItemFood JOINT = new FoodJoint("joint", 0, 0.5f, false);
	public static final Item WEED_SEED = new Weed_Seeds("weed_seed");
	public static final Item WEED = new ItemBase("weed");
	
	//Tobacco
	public static final ItemFood CIG = new FoodCig("cig", 0, 0.5f, false);
	public static final Item DRIED_TOBACCO = new ItemBase("dried_tobacco");
	public static final Item TOBACCO_LEAF = new ItemBase("tobacco_leaf");
	public static final Item TOBACCO_SEED = new Tobacco_Seeds("tobacco_seed");
	
	//Heroin
	public static final Item HEROIN_BOTTLE = new ItemBase("heroin_bottle");
	public static final ItemFood HEROIN_NEEDLE = new FoodHeroin("heroin_needle", 0, 0.5f, false);
	public static final Item POPPY_SEED = new Poppy_Seeds("poppy_seed");
	public static final ItemFood USED_HEROIN_NEEDLE = new FoodHeroinDirty("used_heroin_needle", 0, 0.5f, false);
	
	//OtherItems
	public static final Item BONG = new ItemBase("bong");
	public static final Item PILL = new ItemBase("pill");
	public static final Item NEEDLE = new ItemBase("needle");
	public static final Item USED_NEEDLE = new ItemBase("used_needle");
}
