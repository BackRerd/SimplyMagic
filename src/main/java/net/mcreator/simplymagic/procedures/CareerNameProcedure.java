package net.mcreator.simplymagic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.simplymagic.network.SimplymagicModVariables;

public class CareerNameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SimplymagicModVariables.PlayerVariables())).SelectInt == 1) {
			return "\u5251\u58EB(\u6D4B\u8BD5)";
		}
		if ((entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SimplymagicModVariables.PlayerVariables())).SelectInt == -1) {
			return "\u94C1\u81C0(\u6D4B\u8BD5)";
		}
		if ((entity.getCapability(SimplymagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SimplymagicModVariables.PlayerVariables())).SelectInt == 0) {
			return "\u672A\u77E5";
		}
		return "\u672A\u77E5";
	}
}
