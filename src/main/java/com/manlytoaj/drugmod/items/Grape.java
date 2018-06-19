package com.manlytoaj.drugmod.items;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
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

public class Grape extends Item implements IHasModel, IPlantable {
	public Grape(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DrugModTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack stack = player.getHeldItem(hand);
        IBlockState state = worldIn.getBlockState(pos);
        if(player.canPlayerEdit(pos, facing, stack) && state.getBlock() == ModBlocks.LATTICE) {
        	worldIn.setBlockState(pos, ModBlocks.GRAPE_LATTICE0.getDefaultState());
        	EntityPlayer plr = (EntityPlayer)player;
        	if(!plr.isCreative()){
    			stack.shrink(1);
    		}
        	return(EnumActionResult.SUCCESS);
        }else {
        	return(EnumActionResult.FAIL);
        }
    }

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return net.minecraftforge.common.EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return null;
	}
}
