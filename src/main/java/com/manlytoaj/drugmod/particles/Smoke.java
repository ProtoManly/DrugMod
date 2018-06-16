package com.manlytoaj.drugmod.particles;

import java.util.concurrent.TimeUnit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class Smoke {
	private static double speedMod = 0.1;
	
	public static void doEffect(EntityLivingBase player, World world) {
		if(world.isRemote) {
			world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, player.posX, player.posY+1.5, player.posZ, player.getLookVec().x*speedMod, player.getLookVec().y*speedMod, player.getLookVec().z*speedMod, new int[0]);
		}
	}
}
