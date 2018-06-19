package com.manlytoaj.drugmod.plants;

import java.util.Random;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.Console;

public class LatticeBase extends Block {
	public LatticeBase(String name) {
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setHardness(0.5f);
		needsRandomTick = true;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.LATTICE);
    }
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
		if(this.getAge()==3){} else if(rand.nextInt(2)==0) {
			worldIn.setBlockState(pos, this.growTo().getDefaultState());
		}
	}
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if(!this.canBlockStay()) {
        	// Do things here later on, im a lazy fuck.
        }
    }
	public boolean canBlockStay() {
		return(true); // Same here
	}
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn){
		if(this.getAge()==3) {
			if(!worldIn.isRemote) {
				worldIn.setBlockState(pos, ModBlocks.LATTICE.getDefaultState());
				EntityItem item = new EntityItem(worldIn, pos.getX(), pos.getY()+1, pos.getZ(), new ItemStack(this.getDrop(), this.getAmmountDropped()));
				worldIn.spawnEntity(item);
			}
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
	public Block growTo() {
		return(this);
	}
	public Item getDrop() {
		return(Items.REEDS);
	}
	public int getAmmountDropped() {
		return(2);
	}
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	public int getAge() {
		return(0);
	}
}
