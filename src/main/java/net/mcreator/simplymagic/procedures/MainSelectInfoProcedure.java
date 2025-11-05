package net.mcreator.simplymagic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.simplymagic.network.SimplymagicModVariables;

public class MainSelectInfoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SimplymagicModVariables.PlayerVariables())).SelectInt == 1) {
			return true;
		}
		return false;
	}
}
