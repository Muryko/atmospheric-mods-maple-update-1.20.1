package net.atmospheric.mapleupdate.item;

import net.atmospheric.mapleupdate.MapleUpdate;
import net.atmospheric.mapleupdate.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup OREUPDATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MapleUpdate.mod_id, "mapleupdate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mapleupdate"))
                    .icon(() -> new ItemStack(ModBlocks.RED_MAPLE_LEAVES)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                        entries.add(ModBlocks.ORANGE_MAPLE_LEAVES);
                        entries.add(ModBlocks.YELLOW_MAPLE_LEAVES);
                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.RED_MAPLE_SAPLING);

                    }).build());


    public static void registerItemGroups() {
        MapleUpdate.LOGGER.info("Registering Item Groups for " + MapleUpdate.mod_id);
    }
}
