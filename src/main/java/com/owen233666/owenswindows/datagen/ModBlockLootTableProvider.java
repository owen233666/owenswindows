package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)
        ));
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.OAK_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_OAK_WINDOW.get());
        dropSelf(ModBlocks.OAK_PLANK_WINDOW.get());
        dropSelf(ModBlocks.SPRUCE_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_WINDOW.get());
        dropSelf(ModBlocks.SPRUCE_PLANK_WINDOW.get());
        dropSelf(ModBlocks.BIRCH_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_WINDOW.get());
        dropSelf(ModBlocks.BIRCH_PLANK_WINDOW.get());
        dropSelf(ModBlocks.JUNGLE_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_WINDOW.get());
        dropSelf(ModBlocks.JUNGLE_PLANK_WINDOW.get());
        dropSelf(ModBlocks.ACACIA_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_WINDOW.get());
        dropSelf(ModBlocks.ACACIA_PLANK_WINDOW.get());
        dropSelf(ModBlocks.DARK_OAK_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_WINDOW.get());
        dropSelf(ModBlocks.DARK_OAK_PLANK_WINDOW.get());
        dropSelf(ModBlocks.MANGROVE_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_WINDOW.get());
        dropSelf(ModBlocks.MANGROVE_PLANK_WINDOW.get());
        dropSelf(ModBlocks.CHERRY_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_WINDOW.get());
        dropSelf(ModBlocks.CHERRY_PLANK_WINDOW.get());
        dropSelf(ModBlocks.BAMBOO_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_WINDOW.get());
        dropSelf(ModBlocks.BAMBOO_PLANK_WINDOW.get());
        dropSelf(ModBlocks.CRIMSON_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_WINDOW.get());
        dropSelf(ModBlocks.CRIMSON_PLANK_WINDOW.get());
        dropSelf(ModBlocks.WARPED_WINDOW.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_WINDOW.get());
        dropSelf(ModBlocks.WARPED_PLANK_WINDOW.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
