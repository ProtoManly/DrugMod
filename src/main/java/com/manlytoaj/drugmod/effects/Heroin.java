package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Heroin {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 4000, 10));
		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 4000, 8));
		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 4000, 4));
		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 4000, 3));
		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 4000, 1));
	}
}
