package com.manlytoaj.drugmod.effects;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import scala.Console;

public class HighEffects {
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {
		if(e.side == Side.CLIENT) {
			EntityPlayer player = e.player;
			if(player.isPotionActive(MobEffects.NAUSEA)){
				Random rand = new Random();
				if(rand.nextInt(10)+1==1) {
					int num = rand.nextInt(4);
					if(num==0) {
						player.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, player.posX+(rand.nextInt(10)-10)/10, player.posY+(rand.nextInt(10)-10)/10, player.posZ+(rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, new int[0]);
					}else if(num==1) {
						player.world.spawnParticle(EnumParticleTypes.DRIP_WATER, player.posX+(rand.nextInt(10)-10)/10, player.posY+(rand.nextInt(10)-10)/10, player.posZ+(rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, new int[0]);
					}else if(num==2) {
						player.world.spawnParticle(EnumParticleTypes.SWEEP_ATTACK, player.posX+(rand.nextInt(10)-10)/10, player.posY+(rand.nextInt(10)-10)/10, player.posZ+(rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, new int[0]);
					}else if(num==3) {
						player.world.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, player.posX+(rand.nextInt(10)-10), player.posY+(rand.nextInt(10)-10), player.posZ+(rand.nextInt(10)-10), (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, (rand.nextInt(10)-10)/10, new int[0]);
					}
				}
				if(rand.nextInt(80)+1==1) {
					int num = rand.nextInt(4);
					if(num==0) {
						player.playSound(new SoundEvent(new ResourceLocation("block.glass.break")), rand.nextInt(15)+5/10, rand.nextInt(15)+5/10);
					}else if(num==1){
						player.playSound(new SoundEvent(new ResourceLocation("entity.enderdragon.growl")), rand.nextInt(15)+5/10, rand.nextInt(15)+5/10);
					}else if(num==2){
						player.playSound(new SoundEvent(new ResourceLocation("entity.endermen.scream")), rand.nextInt(15)+5/10, rand.nextInt(15)+5/10);
					}else if(num==3){
						player.playSound(new SoundEvent(new ResourceLocation("entity.skeleton.shoot")), rand.nextInt(15)+5/10, rand.nextInt(15)+5/10);
					}
				}
			}
		}
	}
}
