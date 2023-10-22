package de.flo.magica2.core.client;

import com.mojang.blaze3d.systems.RenderSystem;
import de.flo.magica2.Magica2;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.GuiOverlayManager;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;

public class ManaHudOverlay {
    private static final ResourceLocation FULL_MANA = new ResourceLocation(Magica2.MODID,
            "textures/mana/full_mana.png");
    private static final ResourceLocation EMPTY_MANA = new ResourceLocation(Magica2.MODID,
            "textures/mana/empty_mana.png");


    public static final IGuiOverlay HUD_MANA = ((gui, guiGraphics, partialTick, screenWidth, screenHeight) -> {
        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f,1.0f);
        RenderSystem.setShaderTexture(0, EMPTY_MANA);
        for (int i = 0; i < 10; i++)
        {
            guiGraphics.blit(EMPTY_MANA, x - 94 + (i * 9), y - 54, 0, 0, 12, 12);
        }

        //RenderSystem.setShaderTexture(0, FULL_MANA);

        /*for (int i = 0; i < 10; i++)
        {
            if(ClientManaData.getPlayerMana() > i){
                guiGraphics.blit(EMPTY_MANA, x - 94 + (i * 9), y - 54, 0, 0, 12, 12);
            }else {
                break;
            }

        }*/

    });

}
