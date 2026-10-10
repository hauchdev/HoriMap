package com.horimap.config;

import com.horimap.HoriMap;

/**
 * Central configuration handler for HoriMap.
 * Manages all mod settings and persistence.
 */
public class HoriMapConfig {
    private boolean minimapEnabled = true;
    private boolean worldMapEnabled = true;
    private boolean waypointsEnabled = true;
    private boolean entityRadarEnabled = true;
    private boolean caveMapEnabled = false;

    private int minimapSize = 128;
    private int minimapZoom = 2;
    private String minimapPosition = "top-right";

    private boolean showCoordinates = true;
    private boolean showBiome = true;
    private boolean showFPS = false;
    private boolean showTime = true;

    private int mapUpdateInterval = 500;
    private int waypointRenderDistance = 1000;

    public void load() {
        HoriMap.LOGGER.info("Loading HoriMap configuration...");
        // TODO: Load from config file
    }

    public void save() {
        HoriMap.LOGGER.info("Saving HoriMap configuration...");
        // TODO: Save to config file
    }

    // Getters and setters
    public boolean isMinimapEnabled() { return minimapEnabled; }
    public void setMinimapEnabled(boolean minimapEnabled) { this.minimapEnabled = minimapEnabled; }

    public boolean isWorldMapEnabled() { return worldMapEnabled; }
    public void setWorldMapEnabled(boolean worldMapEnabled) { this.worldMapEnabled = worldMapEnabled; }

    public boolean isWaypointsEnabled() { return waypointsEnabled; }
    public void setWaypointsEnabled(boolean waypointsEnabled) { this.waypointsEnabled = waypointsEnabled; }

    public boolean isEntityRadarEnabled() { return entityRadarEnabled; }
    public void setEntityRadarEnabled(boolean entityRadarEnabled) { this.entityRadarEnabled = entityRadarEnabled; }

    public boolean isCaveMapEnabled() { return caveMapEnabled; }
    public void setCaveMapEnabled(boolean caveMapEnabled) { this.caveMapEnabled = caveMapEnabled; }

    public int getMinimapSize() { return minimapSize; }
    public void setMinimapSize(int minimapSize) { this.minimapSize = minimapSize; }

    public int getMinimapZoom() { return minimapZoom; }
    public void setMinimapZoom(int minimapZoom) { this.minimapZoom = minimapZoom; }

    public String getMinimapPosition() { return minimapPosition; }
    public void setMinimapPosition(String minimapPosition) { this.minimapPosition = minimapPosition; }

    public boolean isShowCoordinates() { return showCoordinates; }
    public void setShowCoordinates(boolean showCoordinates) { this.showCoordinates = showCoordinates; }

    public boolean isShowBiome() { return showBiome; }
    public void setShowBiome(boolean showBiome) { this.showBiome = showBiome; }

    public boolean isShowFPS() { return showFPS; }
    public void setShowFPS(boolean showFPS) { this.showFPS = showFPS; }

    public boolean isShowTime() { return showTime; }
    public void setShowTime(boolean showTime) { this.showTime = showTime; }

    public int getMapUpdateInterval() { return mapUpdateInterval; }
    public void setMapUpdateInterval(int mapUpdateInterval) { this.mapUpdateInterval = mapUpdateInterval; }

    public int getWaypointRenderDistance() { return waypointRenderDistance; }
    public void setWaypointRenderDistance(int waypointRenderDistance) { this.waypointRenderDistance = waypointRenderDistance; }
}
