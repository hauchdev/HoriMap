package com.horimap.fabric;

import net.fabricmc.api.ClientModInitializer;

/**
 * Fabric client entry point for HoriMap.
 */
public class HoriMapFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HoriMap.LOGGER.info("HoriMap Fabric client initialized");
    }
}
