package net.mapleupdate.item;

import net.mapleupdate.AtmosphericModsMapleUpdate;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mapleupdate.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup OREUPDATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AtmosphericModsMapleUpdate.mod_id, "mapleupdate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mapleupdate"))
                    .icon(() -> new ItemStack(Items.DIAMOND)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                    }).build());


    public static void registerItemGroups() {
        AtmosphericModsMapleUpdate.LOGGER.info("Registering Item Groups for " + AtmosphericModsMapleUpdate.mod_id);
    }
}

