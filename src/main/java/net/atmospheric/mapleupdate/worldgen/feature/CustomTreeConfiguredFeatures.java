package net.atmospheric.mapleupdate.worldgen.feature;

import net.atmospheric.mapleupdate.MapleUpdate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

public class CustomTreeConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE = ConfiguredFeatures.of("red_maple");

    public static void registerCustomTreeConfiguredFeatures() {
        MapleUpdate.LOGGER.info("Registering Item Groups for " + MapleUpdate.mod_id);
    }

}
