package com.github.telvarost.unitweakstelsaddons;

import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class ModHelper {

    @Entrypoint.Namespace
    public static final Namespace NAMESPACE = Null.get();

    public static class ModHelperFields {
        /** @brief - Special data for disabling mixins */
        public static boolean loadMixinConfigs = true;
    }
}
