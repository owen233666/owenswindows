package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.HashMap;
import java.util.Map;

public class ModBlockModelProvider extends BlockModelProvider {

    private static final Map<String, String> WOOD_TEXTURES = new HashMap<>();

    static {
        WOOD_TEXTURES.put("oak",                "minecraft:block/oak_log");
        WOOD_TEXTURES.put("stripped_oak",       "minecraft:block/stripped_oak_log");
        WOOD_TEXTURES.put("oak_plank",          "minecraft:block/oak_planks");
        WOOD_TEXTURES.put("spruce",             "minecraft:block/spruce_log");
        WOOD_TEXTURES.put("stripped_spruce",    "minecraft:block/stripped_spruce_log");
        WOOD_TEXTURES.put("spruce_plank",       "minecraft:block/spruce_planks");
        WOOD_TEXTURES.put("birch",              "minecraft:block/birch_log");
        WOOD_TEXTURES.put("stripped_birch",     "minecraft:block/stripped_birch_log");
        WOOD_TEXTURES.put("birch_plank",        "minecraft:block/birch_planks");
        WOOD_TEXTURES.put("jungle",             "minecraft:block/jungle_log");
        WOOD_TEXTURES.put("stripped_jungle",    "minecraft:block/stripped_jungle_log");
        WOOD_TEXTURES.put("jungle_plank",       "minecraft:block/jungle_planks");
        WOOD_TEXTURES.put("acacia",             "minecraft:block/acacia_log");
        WOOD_TEXTURES.put("stripped_acacia",    "minecraft:block/stripped_acacia_log");
        WOOD_TEXTURES.put("acacia_plank",       "minecraft:block/acacia_planks");
        WOOD_TEXTURES.put("dark_oak",           "minecraft:block/dark_oak_log");
        WOOD_TEXTURES.put("stripped_dark_oak",  "minecraft:block/stripped_dark_oak_log");
        WOOD_TEXTURES.put("dark_oak_plank",     "minecraft:block/dark_oak_planks");
        WOOD_TEXTURES.put("mangrove",           "minecraft:block/mangrove_log");
        WOOD_TEXTURES.put("stripped_mangrove",  "minecraft:block/stripped_mangrove_log");
        WOOD_TEXTURES.put("mangrove_plank",     "minecraft:block/mangrove_planks");
        WOOD_TEXTURES.put("cherry",             "minecraft:block/cherry_log");
        WOOD_TEXTURES.put("stripped_cherry",    "minecraft:block/stripped_cherry_log");
        WOOD_TEXTURES.put("cherry_plank",       "minecraft:block/cherry_planks");
        WOOD_TEXTURES.put("bamboo",             "minecraft:block/bamboo_block");
        WOOD_TEXTURES.put("stripped_bamboo",    "minecraft:block/stripped_bamboo_block");
        WOOD_TEXTURES.put("bamboo_plank",       "minecraft:block/bamboo_planks");
        WOOD_TEXTURES.put("crimson",            "minecraft:block/crimson_stem");
        WOOD_TEXTURES.put("stripped_crimson",   "minecraft:block/stripped_crimson_stem");
        WOOD_TEXTURES.put("crimson_plank",      "minecraft:block/crimson_planks");
        WOOD_TEXTURES.put("warped",             "minecraft:block/warped_stem");
        WOOD_TEXTURES.put("stripped_warped",    "minecraft:block/stripped_warped_stem");
        WOOD_TEXTURES.put("warped_plank",       "minecraft:block/warped_planks");
    }

    public ModBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, owen233666swindows.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerWindowBlockModels(ModBlocks.OAK_WINDOW.get(),               "oak");
        registerWindowBlockModels(ModBlocks.STRIPPED_OAK_WINDOW.get(),      "stripped_oak");
        registerWindowBlockModels(ModBlocks.OAK_PLANK_WINDOW.get(),         "oak_plank");
        registerWindowBlockModels(ModBlocks.SPRUCE_WINDOW.get(),            "spruce");
        registerWindowBlockModels(ModBlocks.STRIPPED_SPRUCE_WINDOW.get(),   "stripped_spruce");
        registerWindowBlockModels(ModBlocks.SPRUCE_PLANK_WINDOW.get(),      "spruce_plank");
        registerWindowBlockModels(ModBlocks.BIRCH_WINDOW.get(),             "birch");
        registerWindowBlockModels(ModBlocks.STRIPPED_BIRCH_WINDOW.get(),    "stripped_birch");
        registerWindowBlockModels(ModBlocks.BIRCH_PLANK_WINDOW.get(),       "birch_plank");
        registerWindowBlockModels(ModBlocks.JUNGLE_WINDOW.get(),            "jungle");
        registerWindowBlockModels(ModBlocks.STRIPPED_JUNGLE_WINDOW.get(),   "stripped_jungle");
        registerWindowBlockModels(ModBlocks.JUNGLE_PLANK_WINDOW.get(),      "jungle_plank");
        registerWindowBlockModels(ModBlocks.ACACIA_WINDOW.get(),            "acacia");
        registerWindowBlockModels(ModBlocks.STRIPPED_ACACIA_WINDOW.get(),   "stripped_acacia");
        registerWindowBlockModels(ModBlocks.ACACIA_PLANK_WINDOW.get(),      "acacia_plank");
        registerWindowBlockModels(ModBlocks.DARK_OAK_WINDOW.get(),          "dark_oak");
        registerWindowBlockModels(ModBlocks.STRIPPED_DARK_OAK_WINDOW.get(), "stripped_dark_oak");
        registerWindowBlockModels(ModBlocks.DARK_OAK_PLANK_WINDOW.get(),    "dark_oak_plank");
        registerWindowBlockModels(ModBlocks.MANGROVE_WINDOW.get(),          "mangrove");
        registerWindowBlockModels(ModBlocks.STRIPPED_MANGROVE_WINDOW.get(), "stripped_mangrove");
        registerWindowBlockModels(ModBlocks.MANGROVE_PLANK_WINDOW.get(),    "mangrove_plank");
        registerWindowBlockModels(ModBlocks.CHERRY_WINDOW.get(),            "cherry");
        registerWindowBlockModels(ModBlocks.STRIPPED_CHERRY_WINDOW.get(),   "stripped_cherry");
        registerWindowBlockModels(ModBlocks.CHERRY_PLANK_WINDOW.get(),      "cherry_plank");
        registerWindowBlockModels(ModBlocks.BAMBOO_WINDOW.get(),            "bamboo");
        registerWindowBlockModels(ModBlocks.STRIPPED_BAMBOO_WINDOW.get(),   "stripped_bamboo");
        registerWindowBlockModels(ModBlocks.BAMBOO_PLANK_WINDOW.get(),      "bamboo_plank");
        registerWindowBlockModels(ModBlocks.CRIMSON_WINDOW.get(),           "crimson");
        registerWindowBlockModels(ModBlocks.STRIPPED_CRIMSON_WINDOW.get(),  "stripped_crimson");
        registerWindowBlockModels(ModBlocks.CRIMSON_PLANK_WINDOW.get(),     "crimson_plank");
        registerWindowBlockModels(ModBlocks.WARPED_WINDOW.get(),            "warped");
        registerWindowBlockModels(ModBlocks.STRIPPED_WARPED_WINDOW.get(),   "stripped_warped");
        registerWindowBlockModels(ModBlocks.WARPED_PLANK_WINDOW.get(),      "warped_plank");
    }

    private void registerWindowBlockModels(Block windowBlock, String woodType) {
        String texture = WOOD_TEXTURES.get(woodType);
        if (texture == null) {
            throw new IllegalArgumentException("Unknown wood type: " + woodType);
        }
        String basePath = "block/resizable/" + woodType + "/" + woodType;
        registerWindowBottom(basePath, texture);
        registerWindowLeft(basePath, texture);
        registerWindowRight(basePath, texture);
        registerWindowTop(basePath, texture);
        registerWindowCornerBottomLeft(basePath, texture);
        registerWindowCornerBottomRight(basePath, texture);
        registerWindowCornerRightBottom(basePath, texture);
        registerWindowCornerRightTop(basePath, texture);
        registerWindowCornerRoundedBottom(basePath, texture);
        registerWindowCornerRoundedTop(basePath, texture);
        registerWindowCornerTopLeft(basePath, texture);
        registerWindowCornerTopRight(basePath, texture);
    }

    private void registerWindowBottom(String basePath, String texture) {
        withExistingParent(basePath + "_frame_bot", modLoc("block/parent/window/window_frame_bot"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowLeft(String basePath, String texture) {
        withExistingParent(basePath + "_frame_left", modLoc("block/parent/window/window_frame_left"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowRight(String basePath, String texture) {
        withExistingParent(basePath + "_frame_right", modLoc("block/parent/window/window_frame_right"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowTop(String basePath, String texture) {
        withExistingParent(basePath + "_frame_top", modLoc("block/parent/window/window_frame_top"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerBottomLeft(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_botl", modLoc("block/parent/window/window_frame_corner_botl"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerBottomRight(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_botr", modLoc("block/parent/window/window_frame_corner_botr"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerRightBottom(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_right_bot", modLoc("block/parent/window/window_frame_corner_right_bot"))
                .texture("2", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerRightTop(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_right_top", modLoc("block/parent/window/window_frame_corner_right_top"))
                .texture("2", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerRoundedBottom(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_rounded_bot", modLoc("block/parent/window/window_frame_corner_rounded_bot"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerRoundedTop(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_rounded_top", modLoc("block/parent/window/window_frame_corner_rounded_top"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerTopLeft(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_topl", modLoc("block/parent/window/window_frame_corner_topl"))
                .texture("0", texture)
                .texture("particle", texture);
    }

    private void registerWindowCornerTopRight(String basePath, String texture) {
        withExistingParent(basePath + "_frame_corner_topr", modLoc("block/parent/window/window_frame_corner_topr"))
                .texture("0", texture)
                .texture("particle", texture);
    }
}