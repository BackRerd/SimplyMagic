package net.mcreator.simplymagic.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.simplymagic.world.inventory.TestGuiMenu;
import net.mcreator.simplymagic.procedures.TestGuiTitleProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TestGuiScreen extends AbstractContainerScreen<TestGuiMenu> {
	private final static HashMap<String, Object> guistate = TestGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TestGuiScreen(TestGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 102;
	}

	private static final ResourceLocation texture = new ResourceLocation("simplymagic:textures/screens/test_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("simplymagic:textures/screens/zhu_ti_-kong_.png"), this.leftPos + -7, this.topPos + 3, 0, 0, 192, 93, 192, 93);

		guiGraphics.blit(new ResourceLocation("simplymagic:textures/screens/biao_ti_.png"), this.leftPos + 37, this.topPos + -38, 0, 0, 109, 36, 109, 36);

		guiGraphics.blit(new ResourceLocation("simplymagic:textures/screens/xuan_ze_kuang_2.png"), this.leftPos + 112, this.topPos + 13, 0, 0, 57, 71, 57, 71);

		guiGraphics.blit(new ResourceLocation("simplymagic:textures/screens/que_ren_an_niu_.png"), this.leftPos + 71, this.topPos + 106, 0, 0, 37, 9, 37, 9);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				TestGuiTitleProcedure.execute(), 60, -28, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
