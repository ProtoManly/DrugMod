package com.manlytoaj.drugmod.foods;

import java.util.Random;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.util.IHasModel;
import com.manlytoaj.drugmod.effects.*;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.SoundEvent;
import scala.Console;

public class FoodFilled_Bong extends ItemFood implements IHasModel {
	public FoodFilled_Bong(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DrugModTab);
		this.setAlwaysEdible();
		
		ModItems.ITEMS.add(this);
	}
	@Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.DRINK;
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase player) {
		if(!worldIn.isRemote) {
			Cannabis.addEffect(player);
		}
		EntityPlayer plr = (EntityPlayer)player;
		if(!plr.isCreative()){
			stack.shrink(1);
			Random rand = new Random();
			if(rand.nextInt(50)+1==1) {
				ResourceLocation location = new ResourceLocation("block.glass.break");
				SoundEvent sound = new SoundEvent(location);
				plr.playSound(sound, 1, 1);
				plr.setHealth(plr.getHealth()-2);
				plr.performHurtAnimation();
			}else {
				plr.addItemStackToInventory(new ItemStack(ModItems.BONG, 1));
			}
		}
		return(stack);
	}
}
