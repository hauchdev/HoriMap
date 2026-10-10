package com.horimap;

import com.horimap.config.HoriMapConfig;
import com.horimap.map.MapManager;
import com.horimap.waypoint.WaypointManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * HoriMap - A JourneyMap-inspired minimap and world map mod.
 * Main entry point for the common module.
 */
public class HoriMap {
    public static final String MOD_ID = "horimap";
    public static final String MOD_NAME = "HoriMap";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    private static HoriMap instance;

    private final HoriMapConfig config;
    private final MapManager mapManager;
    private final WaypointManager waypointManager;

    public HoriMap() {
        this.config = new HoriMapConfig();
        this.mapManager = new MapManager();
        this.waypointManager = new WaypointManager();
    }

    public static HoriMap getInstance() {
        return instance;
    }

    public static void init() {
        if (instance != null) {
            throw new IllegalStateException("HoriMap is already initialized!");
        }
        instance = new HoriMap();
        instance.onInitialize();
    }

    private void onInitialize() {
        LOGGER.info("Initializing {} v{}", MOD_NAME, HoriMap.class.getPackage().getImplementationVersion());
        config.load();
        mapManager.initialize();
        waypointManager.load();
        LOGGER.info("{} initialized successfully!", MOD_NAME);
    }

    public HoriMapConfig getConfig() {
        return config;
    }

    public MapManager getMapManager() {
        return mapManager;
    }

    public WaypointManager getWaypointManager() {
        return waypointManager;
    }
}
