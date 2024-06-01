package com.github.telvarost.unitweakstelsaddons;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "UniTweaksTelsAddons")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Add Biome To Debug Overlay")
        public Boolean addBiomeToDebugOverlay = true;

        @ConfigName("Add Day Counter To Debug Overlay")
        public Boolean addDayCounterToDebugOverlay = true;

        @ConfigName("Add Light Level To Debug Overlay")
        @Comment("Calculated at player's eye level")
        public Boolean addLightLevelToDebugOverlay = true;

        @ConfigName("Boat Logout/Login Fix")
        @MultiplayerSynced
        public Boolean boatLogoutLoginFixesEnabled = true;

        @ConfigName("Slab Placement Fixes Enabled")
        @Comment("Restart required for changes to take effect")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean slabPlacementFixesEnabled = true;
    }
}
