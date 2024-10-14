package com.github.telvarost.unitweakstelsaddons;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public final class UniTweaksTelsAddonsMixinPlugin implements IMixinConfigPlugin {

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (ModHelper.ModHelperFields.loadMixinConfigs) {
            ModHelper.ModHelperFields.loadMixinConfigs = false;

            File ymlFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), "unitweakstelsaddons/config.yml");

            try {
                Scanner myReader = new Scanner(ymlFile);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if (data.contains("slabPlacementFixesEnabled")) {
                        if (data.contains("true")) {
                            Config.config.slabPlacementFixesEnabled = true;
                        } else {
                            Config.config.slabPlacementFixesEnabled = false;
                        }
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        if (mixinClassName.equals("com.github.telvarost.unitweakstelsaddons.mixin.modernslabplacement.SlabBlockItemMixin")) {
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
