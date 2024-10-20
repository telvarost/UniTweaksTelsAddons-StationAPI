package com.github.telvarost.unitweakstelsaddons;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.gcapi3.api.*;

public class Config {

    @ConfigRoot(value = "config", visibleName = "UniTweaksTelsAddons")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigCategory(name = "Particles Config")
        public ParticlesConfig PARTICLES_CONFIG = new ParticlesConfig();

        @ConfigCategory(
                name = "Config: Effectivity List Additions For Shovels",
                description = "Options here require restart to take effect"
        )
        public final ShovelsConfig SHOVELS_CONFIG = new ShovelsConfig();

        @ConfigEntry(name = "Add Biome To Debug Overlay")
        public Boolean addBiomeToDebugOverlay = true;

        @ConfigEntry(name = "Add Day Counter To Debug Overlay")
        public Boolean addDayCounterToDebugOverlay = true;

        @ConfigEntry(
                name = "Add Light Level To Debug Overlay",
                description = "Calculated at player's eye level"
        )
        public Boolean addLightLevelToDebugOverlay = true;

        @ConfigEntry(name = "Boat Logout/Login Fix", multiplayerSynced = true)
        public Boolean boatLogoutLoginFixesEnabled = true;

        @ConfigEntry(name = "Milk Squids", multiplayerSynced = true)
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean milkSquids = false;

        @ConfigEntry(name = "Pigs Drop Brown Mushrooms", multiplayerSynced = true)
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean pigsDropBrownMushrooms = false;

        @ConfigEntry(
                name = "Slab Placement Fixes Enabled",
                description = "Restart required for changes to take effect",
                multiplayerSynced = true
        )
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean slabPlacementFixesEnabled = true;
    }

    public static class ShovelsConfig {
        @ConfigEntry(name = "Effective On Soul Sand", multiplayerSynced = true)
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableShovelsEffectiveOnSoulSand = true;
    }


    public static class ParticlesConfig {
        @ConfigEntry(name = "Disable All Particles")
        public Boolean disableAllParticles = false;

        @ConfigEntry(name = "Disable Water Bubble Particle")
        public Boolean disableWaterBubbleParticle = false;

        @ConfigEntry(name = "Disable Smoke Particle")
        public Boolean disableFireSmokeParticle = false;

        @ConfigEntry(name = "Disable Note Particle")
        public Boolean disableNoteParticle = false;

        @ConfigEntry(name = "Disable Portal Particle")
        public Boolean disablePortalParticle = false;

        @ConfigEntry(name = "Disable Explosion Particle")
        public Boolean disableExplosionParticle = false;

        @ConfigEntry(name = "Disable Flame Particle")
        public Boolean disableFlameParticle = false;

        @ConfigEntry(name = "Disable Lava Ember Particle")
        public Boolean disableLavaEmberParticle = false;

        @ConfigEntry(name = "Disable Footstep Particle")
        public Boolean disableFootstepParticle = false;

        @ConfigEntry(name = "Disable Water Splash Particle")
        public Boolean disableWaterSplashParticle = false;

        @ConfigEntry(name = "Disable Large Smoke Particle")
        public Boolean disableLargeFireSmokeParticle = false;

        @ConfigEntry(name = "Disable Redstone Dust Particle")
        public Boolean disableRedDustParticle = false;

        @ConfigEntry(name = "Disable Snowball Particle")
        public Boolean disableSnowballParticle = false;

        @ConfigEntry(name = "Disable Snow Shovel Particle")
        public Boolean disableSnowShovelParticle = false;

        @ConfigEntry(name = "Disable Slime Particle")
        public Boolean disableSlimeParticle = false;

        @ConfigEntry(name = "Disable Heart Particle")
        public Boolean disableHeartParticle = false;
    }
}
