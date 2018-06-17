package com.manlytoaj.drugmod.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class PositiveDrugTest {
	public static void addEffect(EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 250, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 250, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.POISON, 250, 1));
	}
}
