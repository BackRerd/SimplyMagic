package net.mcreator.simplymagic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.simplymagic.network.SimplymagicModVariables;

public class CareerSelectUpButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SimplymagicModVariables.PlayerVariables())).SelectInt + 1;
			entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectInt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
