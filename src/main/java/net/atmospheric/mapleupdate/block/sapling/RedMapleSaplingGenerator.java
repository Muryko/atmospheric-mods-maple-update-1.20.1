package net.atmospheric.mapleupdate.block.sapling;

import net.atmospheric.mapleupdate.MapleUpdate;
import net.atmospheric.mapleupdate.world.gen.feature.CustomTreeConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RedMapleSaplingGenerator extends SaplingGenerator {
    public RedMapleSaplingGenerator() {
    }

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return CustomTreeConfiguredFeatures.;
    }

    public static void registerRedMapleSaplingGenerator() {
        MapleUpdate.LOGGER.info("Registering Item Groups for " + MapleUpdate.mod_id);
    }
}
