package com.owen233666.owenswindows;

import com.mojang.logging.LogUtils;
import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.creativetab.ModcreativeTabs;
import com.owen233666.owenswindows.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(owen233666swindows.MODID)
public class owen233666swindows {
    public static final String MODID = "owenswindows";
    public static final Logger LOGGER = LogUtils.getLogger();

    public owen233666swindows(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModcreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


//        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
//        // Some common setup code
//        LOGGER.info("HELLO FROM COMMON SETUP");
//
//        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
//            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
//        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
//        LOGGER.info("HELLO from server starting");
    }
}
