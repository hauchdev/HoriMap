package com.horimap.forge.client;

import com.horimap.HoriMap;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Forge client entry point for HoriMap.
 */
@Mod.EventBusSubscriber(modid = HoriMap.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HoriMapForgeClient {
    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        // TODO: Register key mappings
    }

    @SubscribeEvent
    public static void onRenderGui(RenderGuiEvent.Post event) {
        // TODO: Render HUD elements
    }
}
