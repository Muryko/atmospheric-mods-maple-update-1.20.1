package net.mapleupdate.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mapleupdate.AtmosphericModsMapleUpdate;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.*;

public class ModBlocks {
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AtmosphericModsMapleUpdate.mod_id, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AtmosphericModsMapleUpdate.mod_id, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AtmosphericModsMapleUpdate.LOGGER.info("Registering ModBlocks for " + AtmosphericModsMapleUpdate.mod_id);
    }
}