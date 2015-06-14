package me.Mammothskier.Giants.entity.nms.v1_7_R4;

import net.minecraft.server.v1_7_R4.World;

import me.Mammothskier.Giants.entity.nms.v1_7_R4.CustomEntityGiantZombie;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R4.CraftWorld;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class EntityCreator {
	
	public static void createEntity (Location location, SpawnReason reason) {
		World world = ((CraftWorld) location.getWorld()).getHandle();
		CustomEntityGiantZombie giant = new CustomEntityGiantZombie(world);
		giant.setPosition(location.getX(), location.getY(), location.getZ());
		world.addEntity(giant, reason);
	}
}
