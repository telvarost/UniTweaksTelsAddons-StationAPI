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
            }
        }
    }
}
