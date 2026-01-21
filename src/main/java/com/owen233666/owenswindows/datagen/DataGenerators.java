package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = owen233666swindows.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider =event.getLookupProvider();

        generator.addProvider(event.includeClient(), ModBlockLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStatesProvider(packOutput, existingFileHelper));
    }
}
