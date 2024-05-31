package com.github.telvarost.unitweakstelsaddons.events;

import blue.endless.jankson.JsonObject;
import com.github.telvarost.unitweakstelsaddons.Config;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.glasslauncher.mods.api.gcapi.api.PreConfigSavedListener;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.achievement.Achievements;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.modificationstation.stationapi.api.entity.player.PlayerHelper;

import java.util.Random;

@EventListener
public class ConfigListener implements PreConfigSavedListener {

    @Override
    public void onPreConfigSaved(int var1, JsonObject var2, JsonObject var3) {
        if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT){
            Minecraft minecraft = (Minecraft)FabricLoader.getInstance().getGameInstance();
            if (null != minecraft) {
                Random rand = new Random();

                PlayerEntity player = PlayerHelper.getPlayerFromGame();
                if (null != player) {
                    JsonObject missingAchievementsJsonObject = var3.getObject("MISSING_ACHIEVEMENTS_CONFIG");
                    if (null != missingAchievementsJsonObject) {
                        if (missingAchievementsJsonObject.getBoolean("OPEN_INVENTORY", false)) {
                            player.incrementStat(Achievements.OPEN_INVENTORY);
                        }
                        if (missingAchievementsJsonObject.getBoolean("MINE_WOOD", false)) {
                            player.incrementStat(Achievements.MINE_WOOD);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_WORKBENCH", false)) {
                            player.incrementStat(Achievements.CRAFT_WORKBENCH);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_PICKAXE", false)) {
                            player.incrementStat(Achievements.CRAFT_PICKAXE);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_FURNACE", false)) {
                            player.incrementStat(Achievements.CRAFT_FURNACE);
                        }
                        if (missingAchievementsJsonObject.getBoolean("AQUIRE_IRON", false)) {
                            player.incrementStat(Achievements.ACQUIRE_IRON);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_HOE", false)) {
                            player.incrementStat(Achievements.CRAFT_HOE);
                        }
                        if (missingAchievementsJsonObject.getBoolean("MAKE_BREAD", false)) {
                            player.incrementStat(Achievements.CRAFT_BREAD);
                        }
                        if (missingAchievementsJsonObject.getBoolean("BAKE_CAKE", false)) {
                            player.incrementStat(Achievements.CRAFT_CAKE);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_BETTER_PICKAXE", false)) {
                            player.incrementStat(Achievements.CRAFT_STONE_PICKAXE);
                        }
                        if (missingAchievementsJsonObject.getBoolean("COOK_FISH", false)) {
                            player.incrementStat(Achievements.COOK_FISH);
                        }
                        if (missingAchievementsJsonObject.getBoolean("ON_A_RAIL", false)) {
                            player.incrementStat(Achievements.CRAFT_RAIL);
                        }
                        if (missingAchievementsJsonObject.getBoolean("CRAFT_SWORD", false)) {
                            player.incrementStat(Achievements.CRAFT_SWORD);
                        }
                        if (missingAchievementsJsonObject.getBoolean("KILL_ENEMY", false)) {
                            player.incrementStat(Achievements.KILL_ENEMY);
                        }
                        if (missingAchievementsJsonObject.getBoolean("KILL_COW", false)) {
                            player.incrementStat(Achievements.KILL_COW);
                        }
                        if (missingAchievementsJsonObject.getBoolean("FLY_PIG", false)) {
                            player.incrementStat(Achievements.FLY_PIG);
                        }
                    }
                }
            }
        }
    }
}
