package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Cannabis {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 1500, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 10, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 1500, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1500, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 1500, 1));
	}
}
