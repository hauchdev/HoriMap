package com.horimap.forge.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

/**
 * Key mappings for HoriMap on Forge.
 */
public class HoriMapKeyMappings {
    public static final String KEY_CATEGORY = "horimap.name";

    public static final KeyMapping TOGGLE_MINIMAP = new KeyMapping(
        "horimap.key.toggle_minimap",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        InputConstants.KEY_J,
        KEY_CATEGORY
    );

    public static final KeyMapping OPEN_WORLDMAP = new KeyMapping(
        "horimap.key.open_worldmap",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        InputConstants.KEY_M,
        KEY_CATEGORY
    );

    public static final KeyMapping OPEN_WAYPOINTS = new KeyMapping(
        "horimap.key.open_waypoints",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        InputConstants.KEY_P,
        KEY_CATEGORY
    );

    public static final KeyMapping OPEN_SETTINGS = new KeyMapping(
        "horimap.key.open_settings",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        InputConstants.KEY_O,
        KEY_CATEGORY
    );

    public static final KeyMapping CREATE_WAYPOINT = new KeyMapping(
        "horimap.key.create_waypoint",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        InputConstants.KEY_B,
        KEY_CATEGORY
    );
}
