package com.github.telvarost.unitweakstelsaddons;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "UniTweaksTelsAddons")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigName("Slab Placement Fixes Enabled")
        @Comment("Restart required for changes to take effect")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean slabPlacementFixesEnabled = true;
    }
}
