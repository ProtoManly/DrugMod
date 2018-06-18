package com.manlytoaj.drugmod;

import com.manlytoaj.drugmod.creative.CreativeTabBase;
import com.manlytoaj.drugmod.effects.HighEffects;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.init.ModRecipes;
import com.manlytoaj.drugmod.proxy.CommonProxy;
import com.manlytoaj.drugmod.util.Ref;

import net.minecraft.advancements.Advancement;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Ref.MOD_ID,name=Ref.NAME,version=Ref.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static CreativeTabs DrugModTab = new CreativeTabBase(CreativeTabs.getNextID(), "Drug Mod");
	
	@SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS, serverSide = Ref.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		//Set Container Items
		ModItems.KNIFE.setContainerItem(ModItems.KNIFE);
		ModItems.WATER_DRUG_TEST.setContainerItem(ModItems.DRUG_TEST);
		ModItems.NEGATIVE_DRUG_TEST.setContainerItem(ModItems.DRUG_TEST);
		ModItems.POSITIVE_DRUG_TEST.setContainerItem(ModItems.DRUG_TEST);
		Items.POTIONITEM.setContainerItem(Items.GLASS_BOTTLE);
		
		//Add seeds
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.WEED_SEED), 3);
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.TOBACCO_SEED), 4);
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.COCA_SEEDS), 2);
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.POPPY_SEED), 2);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		if(FMLCommonHandler.instance().getSide().isClient()) {
			//MinecraftForge.EVENT_BUS.register(new HighEffects()); Affects performace immensly
		}
	}
}