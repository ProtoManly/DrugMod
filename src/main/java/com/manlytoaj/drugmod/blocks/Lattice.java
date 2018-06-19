package com.manlytoaj.drugmod.blocks;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModBlocks;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Lattice extends Block implements IHasModel {
	public Lattice(String name) {
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DrugModTab);
		setSoundType(SoundType.WOOD);
		setHardness(0.5f);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if(worldIn.getBlockState(pos) == Blocks.AIR.getDefaultState() && !worldIn.isRemote) {
        	worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState());
	        EntityItem item = new EntityItem(worldIn, pos.getX(), pos.getY()+1, pos.getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.LATTICE), 1));
			worldIn.spawnEntity(item);
        }
    }
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
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
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
