package com.github.GummyBlasian.InventoryPower.Screen;

import com.github.GummyBlasian.InventoryPower.Main;
import com.github.GummyBlasian.InventoryPower.GUI.Container.PFContainer;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.ForgeHooks;

public class PFScreen extends ContainerScreen<PFContainer>{

    private ResourceLocation GUI = new ResourceLocation(Main.MODID, "textures/gui/portable_furnace.png");

	public PFScreen(PFContainer container, PlayerInventory inv, ITextComponent name) {
		super(container, inv, name);
	}
	
	@Override
	public void render(int mouseX, int mouseY, float partialTicks) {
		this.renderBackground();
		super.render(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.font.drawString("Burn energy: " + container.getBurn(), 28.0F, 6.0F, 4210752);
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.minecraft.player.isAlive()) {
			this.minecraft.player.closeScreen();
		}
	}
}
