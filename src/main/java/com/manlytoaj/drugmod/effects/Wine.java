package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Wine {
	public static void addEffect(EntityLivingBase player, int strength) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, strength, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, strength, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, strength, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, strength, 1));
	}
}
