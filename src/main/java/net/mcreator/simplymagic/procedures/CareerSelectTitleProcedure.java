package net.mcreator.simplymagic.procedures;

import net.minecraft.network.chat.Component;

public class CareerSelectTitleProcedure {
	public static String execute() {
		return Component.translatable("career.select.title").getString();
	}
}
