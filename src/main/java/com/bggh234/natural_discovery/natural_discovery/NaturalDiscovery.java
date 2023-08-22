package com.bggh234.natural_discovery.natural_discovery;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturalDiscovery implements ModInitializer {
    //References
    public static final String MOD_ID = "natural_discovery";

    // Mod Logger
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello explorer!");
    }
}
