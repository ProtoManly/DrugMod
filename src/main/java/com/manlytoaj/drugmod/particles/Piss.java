package com.manlytoaj.drugmod.particles;

import java.util.concurrent.TimeUnit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class Piss {
	private static double speedMod = 10;
	
	public static void doEffect(EntityLivingBase player, World world) {
		if(world.isRemote) {
			world.spawnParticle(EnumParticleTypes.WATER_DROP, player.posX+(player.getLookVec().x*0.2), player.posY+1, player.posZ+(player.getLookVec().z*0.2), player.getLookVec().x*speedMod, 0, player.getLookVec().z*speedMod, new int[0]);
		}
	}
}
