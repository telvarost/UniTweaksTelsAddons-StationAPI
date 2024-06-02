package com.github.telvarost.unitweakstelsaddons;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "UniTweaksTelsAddons")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigCategory("Particles Config")
        public ParticlesConfig PARTICLES_CONFIG = new ParticlesConfig();

        @ConfigCategory("Config: Effectivity List Additions For Shovels")
        @Comment("Options here require restart to take effect")
        public final ShovelsConfig SHOVELS_CONFIG = new ShovelsConfig();

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

    public static class ShovelsConfig {
        @ConfigName("Effective On Soul Sand")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableShovelsEffectiveOnSoulSand = true;
    }


    public static class ParticlesConfig {
        @ConfigName("Disable All Particles")
        public Boolean disableAllParticles = false;

        @ConfigName("Disable Water Bubble Particle")
        public Boolean disableWaterBubbleParticle = false;

        @ConfigName("Disable Smoke Particle")
        public Boolean disableFireSmokeParticle = false;

        @ConfigName("Disable Note Particle")
        public Boolean disableNoteParticle = false;

        @ConfigName("Disable Portal Particle")
        public Boolean disablePortalParticle = false;

        @ConfigName("Disable Explosion Particle")
        public Boolean disableExplosionParticle = false;

        @ConfigName("Disable Flame Particle")
        public Boolean disableFlameParticle = false;

        @ConfigName("Disable Lava Ember Particle")
        public Boolean disableLavaEmberParticle = false;

        @ConfigName("Disable Footstep Particle")
        public Boolean disableFootstepParticle = false;

        @ConfigName("Disable Water Splash Particle")
        public Boolean disableWaterSplashParticle = false;

        @ConfigName("Disable Large Smoke Particle")
        public Boolean disableLargeFireSmokeParticle = false;

        @ConfigName("Disable Redstone Dust Particle")
        public Boolean disableRedDustParticle = false;

        @ConfigName("Disable Snowball Particle")
        public Boolean disableSnowballParticle = false;

        @ConfigName("Disable Snow Shovel Particle")
        public Boolean disableSnowShovelParticle = false;

        @ConfigName("Disable Slime Particle")
        public Boolean disableSlimeParticle = false;

        @ConfigName("Disable Heart Particle")
        public Boolean disableHeartParticle = false;
    }
}
