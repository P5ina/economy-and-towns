package com.p5ina.economytowns;

import com.p5ina.economytowns.block.ModBlocks;
import com.p5ina.economytowns.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EconomyAndTownsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("economytowns");

	public static final String MOD_ID = "economytowns";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
