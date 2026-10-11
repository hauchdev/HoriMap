package com.horimap.fabric.client;

import com.horimap.HoriMap;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/**
 * HUD rendering for HoriMap on Fabric (official Mojang mappings names).
 */
public class HoriMapHud {
    public static void register() {
        HudRenderCallback.EVENT.register((graphics, tickDelta) -> {
            Minecraft client = Minecraft.getInstance();
            if (client.player == null || client.options.hideGui) return;

            HoriMap horimap = HoriMap.getInstance();
            if (horimap == null) return;

            if (horimap.getConfig().isMinimapEnabled()) {
                renderMinimap(graphics, client);
            }

            if (horimap.getConfig().isShowCoordinates()) {
                renderCoordinates(graphics, client);
            }
        });
    }

    private static void renderMinimap(GuiGraphics graphics, Minecraft client) {
        int size = HoriMap.getInstance().getConfig().getMinimapSize();
        int x = client.getWindow().getGuiScaledWidth() - size - 5;
        int y = 5;

        graphics.fill(x, y, x + size, y + size, 0x80000000);
    }

    private static void renderCoordinates(GuiGraphics graphics, Minecraft client) {
        if (client.player == null) return;
        String coords = String.format("XYZ: %.1f / %.1f / %.1f",
            client.player.getX(), client.player.getY(), client.player.getZ());
        graphics.drawString(client.font, coords, 5, 5, 0xFFFFFF, true);
    }
}
