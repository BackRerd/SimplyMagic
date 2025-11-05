package net.mcreator.simplymagic.procedures;

import net.minecraft.network.chat.Component;

public class TestGuiTitleProcedure {
	public static String execute() {
		return Component.translatable("select.title").getString();
	}
}
