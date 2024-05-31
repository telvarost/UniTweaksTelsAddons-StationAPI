package com.github.telvarost.unitweakstelsaddons;

import blue.endless.jankson.Jankson;
import blue.endless.jankson.JsonObject;
import blue.endless.jankson.api.SyntaxError;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public final class UniTweaksTelsAddonsMixinPlugin implements IMixinConfigPlugin {

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (ModHelper.ModHelperFields.loadMixinConfigs) {
            ModHelper.ModHelperFields.loadMixinConfigs = false;

            try {
                JsonObject configObject = Jankson
                        .builder()
                        .build()
                        .load(new File("config/unitweakstelsaddons", "config.json"));

                Config.config.slabPlacementFixesEnabled = configObject.getBoolean("slabPlacementFixesEnabled", true);
            } catch (IOException ex) {
                System.out.println("Couldn't read the config file" + ex.toString());
            } catch (SyntaxError error) {
                System.out.println("Couldn't read the config file" + error.getMessage());
                System.out.println(error.getLineMessage());
            }
        }

        if (mixinClassName.equals("com.github.telvarost.unitweakstelsaddons.mixin.SlabBlockItemMixin")) {
            return Config.config.slabPlacementFixesEnabled;
        } else {
            return true;
        }
    }

    // Boilerplate

    @Override
    public void onLoad(String mixinPackage) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}
