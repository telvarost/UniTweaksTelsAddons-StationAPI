package com.github.telvarost.unitweakstelsaddons.events;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.glasslauncher.mods.gcapi3.impl.GlassYamlFile;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.client.Minecraft;

@EventListener
public class ConfigListener implements net.glasslauncher.mods.gcapi3.api.PreConfigSavedListener {

    @Override
    public void onPreConfigSaved(int source, GlassYamlFile oldValues, GlassYamlFile newValues) {
        if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT){
            Minecraft minecraft = (Minecraft)FabricLoader.getInstance().getGameInstance();
            if (null != minecraft) {
            }
        }
    }
}
