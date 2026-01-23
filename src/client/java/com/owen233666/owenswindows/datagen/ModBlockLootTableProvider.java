package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.OAK_WINDOW);
        dropSelf(ModBlocks.STRIPPED_OAK_WINDOW);
        dropSelf(ModBlocks.OAK_PLANK_WINDOW);
        dropSelf(ModBlocks.SPRUCE_WINDOW);
        dropSelf(ModBlocks.STRIPPED_SPRUCE_WINDOW);
        dropSelf(ModBlocks.SPRUCE_PLANK_WINDOW);
        dropSelf(ModBlocks.BIRCH_WINDOW);
        dropSelf(ModBlocks.STRIPPED_BIRCH_WINDOW);
        dropSelf(ModBlocks.BIRCH_PLANK_WINDOW);
        dropSelf(ModBlocks.JUNGLE_WINDOW);
        dropSelf(ModBlocks.STRIPPED_JUNGLE_WINDOW);
        dropSelf(ModBlocks.JUNGLE_PLANK_WINDOW);
        dropSelf(ModBlocks.ACACIA_WINDOW);
        dropSelf(ModBlocks.STRIPPED_ACACIA_WINDOW);
        dropSelf(ModBlocks.ACACIA_PLANK_WINDOW);
        dropSelf(ModBlocks.DARK_OAK_WINDOW);
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_WINDOW);
        dropSelf(ModBlocks.DARK_OAK_PLANK_WINDOW);
        dropSelf(ModBlocks.MANGROVE_WINDOW);
        dropSelf(ModBlocks.STRIPPED_MANGROVE_WINDOW);
        dropSelf(ModBlocks.MANGROVE_PLANK_WINDOW);
        dropSelf(ModBlocks.CHERRY_WINDOW);
        dropSelf(ModBlocks.STRIPPED_CHERRY_WINDOW);
        dropSelf(ModBlocks.CHERRY_PLANK_WINDOW);
        dropSelf(ModBlocks.BAMBOO_WINDOW);
        dropSelf(ModBlocks.STRIPPED_BAMBOO_WINDOW);
        dropSelf(ModBlocks.BAMBOO_PLANK_WINDOW);
        dropSelf(ModBlocks.CRIMSON_WINDOW);
        dropSelf(ModBlocks.STRIPPED_CRIMSON_WINDOW);
        dropSelf(ModBlocks.CRIMSON_PLANK_WINDOW);
        dropSelf(ModBlocks.WARPED_WINDOW);
        dropSelf(ModBlocks.STRIPPED_WARPED_WINDOW);
        dropSelf(ModBlocks.WARPED_PLANK_WINDOW);
    }
}
