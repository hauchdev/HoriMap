package com.horimap.fabric;

import com.horimap.HoriMap;
import net.fabricmc.api.ModInitializer;

/**
 * Fabric entry point for HoriMap.
 */
public class HoriMapFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HoriMap.init();
    }
}
