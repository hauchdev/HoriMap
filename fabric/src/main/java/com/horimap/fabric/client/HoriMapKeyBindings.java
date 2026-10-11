package com.horimap.fabric.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

/**
 * Key bindings for HoriMap on Fabric (official Mojang mappings names).
 */
public class HoriMapKeyBindings {
    public static KeyMapping toggleMinimap;
    public static KeyMapping openWorldMap;
    public static KeyMapping openWaypoints;
    public static KeyMapping openSettings;
    public static KeyMapping createWaypoint;

    public static void register() {
        toggleMinimap = registerKey("horimap.key.toggle_minimap", GLFW.GLFW_KEY_J);

        openWorldMap = registerKey("horimap.key.open_worldmap", GLFW.GLFW_KEY_M);

        openWaypoints = registerKey("horimap.key.open_waypoints", GLFW.GLFW_KEY_P);

        openSettings = registerKey("horimap.key.open_settings", GLFW.GLFW_KEY_O);

        createWaypoint = registerKey("horimap.key.create_waypoint", GLFW.GLFW_KEY_B);
    }

    private static KeyMapping registerKey(String name, int key) {
        return KeyBindingHelper.registerKeyBinding(new KeyMapping(
            name,
            InputConstants.Type.KEYSYM,
            key,
            "horimap.name"
        ));
    }
}
