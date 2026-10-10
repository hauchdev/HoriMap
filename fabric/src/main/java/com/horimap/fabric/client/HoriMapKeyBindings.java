package com.horimap.fabric.client;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

/**
 * Key bindings for HoriMap on Fabric.
 */
public class HoriMapKeyBindings {
    public static KeyBinding toggleMinimap;
    public static KeyBinding openWorldMap;
    public static KeyBinding openWaypoints;
    public static KeyBinding openSettings;
    public static KeyBinding createWaypoint;

    public static void register() {
        toggleMinimap = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "horimap.key.toggle_minimap",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_J,
            "horimap.name"
        ));

        openWorldMap = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "horimap.key.open_worldmap",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_M,
            "horimap.name"
        ));

        openWaypoints = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "horimap.key.open_waypoints",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_P,
            "horimap.name"
        ));

        openSettings = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "horimap.key.open_settings",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            "horimap.name"
        ));

        createWaypoint = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "horimap.key.create_waypoint",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_B,
            "horimap.name"
        ));
    }
}
