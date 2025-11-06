
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplymagic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.simplymagic.world.inventory.TestGuiMenu;
import net.mcreator.simplymagic.world.inventory.CareerSelectMenu;
import net.mcreator.simplymagic.world.inventory.CareerInfoGuiMenu;
import net.mcreator.simplymagic.SimplymagicMod;

public class SimplymagicModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SimplymagicMod.MODID);
	public static final RegistryObject<MenuType<TestGuiMenu>> TEST_GUI = REGISTRY.register("test_gui", () -> IForgeMenuType.create(TestGuiMenu::new));
	public static final RegistryObject<MenuType<CareerSelectMenu>> CAREER_SELECT = REGISTRY.register("career_select", () -> IForgeMenuType.create(CareerSelectMenu::new));
	public static final RegistryObject<MenuType<CareerInfoGuiMenu>> CAREER_INFO_GUI = REGISTRY.register("career_info_gui", () -> IForgeMenuType.create(CareerInfoGuiMenu::new));
}
