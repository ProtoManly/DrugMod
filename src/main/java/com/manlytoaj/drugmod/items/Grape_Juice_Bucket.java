package com.manlytoaj.drugmod.items;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class Grape_Juice_Bucket extends Item implements IHasModel {
	public Grape_Juice_Bucket(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DrugModTab);
		setMaxDamage(24000);
		maxStackSize = 1;
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected){
		this.setDamage(stack, this.getDamage(stack)+1);
		if(this.getDamage(stack)==this.getMaxDamage(stack)-1) {
			EntityPlayer player = (EntityPlayer)entityIn;
			player.inventory.setInventorySlotContents(itemSlot, new ItemStack(ModItems.WINE_BUCKET));
		}
    }
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
