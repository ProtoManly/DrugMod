package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class DirtyNeedle {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 2000, 4));
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 2000, 100));
		player.addPotionEffect(new PotionEffect(MobEffects.POISON, 2000, 2));
	}
}
