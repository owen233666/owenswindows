package com.owen233666.owenswindows;

import com.mojang.logging.LogUtils;
import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.creativetab.ModcreativeTabs;
import com.owen233666.owenswindows.item.ModItems;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(owen233666swindows.MODID)
public class owen233666swindows {
    //1
    public static final String MODID = "owenswindows";
    public static final Logger LOGGER = LogUtils.getLogger();

    public owen233666swindows(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModcreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);



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
