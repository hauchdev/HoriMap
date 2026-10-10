package com.horimap.waypoint;

import com.horimap.HoriMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages waypoints for HoriMap.
 * Handles creation, deletion, and persistence of waypoints.
 */
public class WaypointManager {
    private final List<Waypoint> waypoints = new ArrayList<>();
    private boolean loaded = false;

    public void load() {
        if (loaded) return;
        HoriMap.LOGGER.info("Loading WaypointManager...");
        this.loaded = true;
    }

    public void save() {
        HoriMap.LOGGER.info("Saving WaypointManager...");
        // TODO: Save waypoints to file
    }

    public Waypoint createWaypoint(String name, double x, double y, double z, int dimension) {
        Waypoint waypoint = new Waypoint(name, x, y, z, dimension);
        waypoints.add(waypoint);
        return waypoint;
    }

    public void removeWaypoint(Waypoint waypoint) {
        waypoints.remove(waypoint);
    }

    public List<Waypoint> getWaypoints() {
        return new ArrayList<>(waypoints);
    }

    public List<Waypoint> getWaypointsInDimension(int dimension) {
        List<Waypoint> result = new ArrayList<>();
        for (Waypoint wp : waypoints) {
            if (wp.getDimension() == dimension) {
                result.add(wp);
            }
        }
        return result;
    }
}
