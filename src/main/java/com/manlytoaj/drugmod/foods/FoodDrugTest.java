package com.manlytoaj.drugmod.foods;

import com.manlytoaj.drugmod.Main;
import com.manlytoaj.drugmod.init.ModItems;
import com.manlytoaj.drugmod.particles.Piss;
import com.manlytoaj.drugmod.util.IHasModel;
import com.manlytoaj.drugmod.effects.*;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scala.Console;

public class FoodDrugTest extends ItemFood implements IHasModel {
	public FoodDrugTest(String name, int amount, float saturation, boolean isWolfFood) {
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
        return EnumAction.NONE;
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase player) {
		EntityPlayer plr = (EntityPlayer)player;
		if(plr.isPotionActive(Potion.getPotionById(9))){
			plr.addItemStackToInventory(new ItemStack(ModItems.POSITIVE_DRUG_TEST, 1));
		}else {
			plr.addItemStackToInventory(new ItemStack(ModItems.NEGATIVE_DRUG_TEST, 1));
		}
		stack.shrink(1);
		return(stack);
	}
	@Override
	public void onUsingTick(ItemStack stack, EntityLivingBase player, int count)
    {
		Piss.doEffect(player, player.world);
    }
}
