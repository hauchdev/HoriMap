package com.horimap.fabric.client;

import com.horimap.HoriMap;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

/**
 * HUD rendering for HoriMap on Fabric.
 */
public class HoriMapHud {
    public static void register() {
        HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.player == null || client.options.hudHidden) return;

            HoriMap horimap = HoriMap.getInstance();
            if (horimap == null) return;

            if (horimap.getConfig().isMinimapEnabled()) {
                renderMinimap(matrices, client);
            }

            if (horimap.getConfig().isShowCoordinates()) {
                renderCoordinates(matrices, client);
            }
        });
    }

    private static void renderMinimap(MatrixStack matrices, MinecraftClient client) {
        int size = HoriMap.getInstance().getConfig().getMinimapSize();
        int x = client.getWindow().getScaledWidth() - size - 5;
        int y = 5;

        DrawableHelper.fill(matrices, x, y, x + size, y + size, 0x80000000);
    }

    private static void renderCoordinates(MatrixStack MatrixStack, MinecraftClient client) {
        if (client.player == null) return;
        String coords = String.format("XYZ: %.1f / %.1f / %.1f",
            client.player.getX(), client.player.getY(), client.player.getZ());
        client.textRenderer.drawWithShadow(MatrixStack, coords, 5, 5, 0xFFFFFF);
    }
}
