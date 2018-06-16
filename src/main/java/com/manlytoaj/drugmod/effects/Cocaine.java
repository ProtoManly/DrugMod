package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Cocaine {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 2000, 3));
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2000, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 2000, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1500, 1));
	}
}
