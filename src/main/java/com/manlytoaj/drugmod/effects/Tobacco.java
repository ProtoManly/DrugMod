package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Tobacco {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, 500, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 500, 1));
	}
}
