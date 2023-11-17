package net.mapleupdate;

import net.fabricmc.api.ModInitializer;

import net.mapleupdate.block.ModBlocks;
import net.mapleupdate.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AtmosphericModsMapleUpdate implements ModInitializer {
	public static final String mod_id = "oreupdate";
	public static final Logger LOGGER = LoggerFactory.getLogger(mod_id);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}