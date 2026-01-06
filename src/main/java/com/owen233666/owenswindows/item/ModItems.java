package com.owen233666.owenswindows.item;

import com.owen233666.owenswindows.Owen233666sWindows;
import com.owen233666.owenswindows.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModItems {

    public static final Item OAK_WINDOW                 =   registerBlockItem("oak_window",                 ModBlocks.OAK_WINDOW);
    public static final Item STRIPPED_OAK_WINDOW        =   registerBlockItem("stripped_oak_window",        ModBlocks.STRIPPED_OAK_WINDOW);
    public static final Item OAK_PLANK_WINDOW           =   registerBlockItem("oak_plank_window",           ModBlocks.OAK_PLANK_WINDOW);
    public static final Item SPRUCE_WINDOW              =   registerBlockItem("spruce_window",              ModBlocks.SPRUCE_WINDOW);
    public static final Item STRIPPED_SPRUCE_WINDOW     =   registerBlockItem("stripped_spruce_window",     ModBlocks.STRIPPED_SPRUCE_WINDOW);
    public static final Item SPRUCE_PLANK_WINDOW        =   registerBlockItem("spruce_plank_window",        ModBlocks.SPRUCE_PLANK_WINDOW);
    public static final Item BIRCH_WINDOW               =   registerBlockItem("birch_window",               ModBlocks.BIRCH_WINDOW);
    public static final Item STRIPPED_BIRCH_WINDOW      =   registerBlockItem("stripped_birch_window",      ModBlocks.STRIPPED_BIRCH_WINDOW);
    public static final Item BIRCH_PLANK_WINDOW         =   registerBlockItem("birch_plank_window",         ModBlocks.BIRCH_PLANK_WINDOW);
    public static final Item JUNGLE_WINDOW              =   registerBlockItem("jungle_window",              ModBlocks.JUNGLE_WINDOW);
    public static final Item STRIPPED_JUNGLE_WINDOW     =   registerBlockItem("stripped_jungle_window",     ModBlocks.STRIPPED_JUNGLE_WINDOW);
    public static final Item JUNGLE_PLANK_WINDOW        =   registerBlockItem("jungle_plank_window",        ModBlocks.JUNGLE_PLANK_WINDOW);
    public static final Item ACACIA_WINDOW              =   registerBlockItem("acacia_window",              ModBlocks.ACACIA_WINDOW);
    public static final Item STRIPPED_ACACIA_WINDOW     =   registerBlockItem("stripped_acacia_window",     ModBlocks.STRIPPED_ACACIA_WINDOW);
    public static final Item ACACIA_PLANK_WINDOW        =   registerBlockItem("acacia_plank_window",        ModBlocks.ACACIA_PLANK_WINDOW);
    public static final Item DARK_OAK_WINDOW            =   registerBlockItem("dark_oak_window",            ModBlocks.DARK_OAK_WINDOW);
    public static final Item STRIPPED_DARK_OAK_WINDOW   =   registerBlockItem("stripped_dark_oak_window",   ModBlocks.STRIPPED_DARK_OAK_WINDOW);
    public static final Item DARK_OAK_PLANK_WINDOW      =   registerBlockItem("dark_oak_plank_window",      ModBlocks.DARK_OAK_PLANK_WINDOW);
    public static final Item MANGROVE_WINDOW            =   registerBlockItem("mangrove_window",            ModBlocks.MANGROVE_WINDOW);
    public static final Item STRIPPED_MANGROVE_WINDOW   =   registerBlockItem("stripped_mangrove_window",   ModBlocks.STRIPPED_MANGROVE_WINDOW);
    public static final Item MANGROVE_PLANK_WINDOW      =   registerBlockItem("mangrove_plank_window",      ModBlocks.MANGROVE_PLANK_WINDOW);
    public static final Item CHERRY_WINDOW              =   registerBlockItem("cherry_window",              ModBlocks.CHERRY_WINDOW);
    public static final Item STRIPPED_CHERRY_WINDOW     =   registerBlockItem("stripped_cherry_window",     ModBlocks.STRIPPED_CHERRY_WINDOW);
    public static final Item CHERRY_PLANK_WINDOW        =   registerBlockItem("cherry_plank_window",        ModBlocks.CHERRY_PLANK_WINDOW);
    public static final Item BAMBOO_WINDOW              =   registerBlockItem("bamboo_window",              ModBlocks.BAMBOO_WINDOW);
    public static final Item STRIPPED_BAMBOO_WINDOW     =   registerBlockItem("stripped_bamboo_window",     ModBlocks.STRIPPED_BAMBOO_WINDOW);
    public static final Item BAMBOO_PLANK_WINDOW        =   registerBlockItem("bamboo_plank_window",        ModBlocks.BAMBOO_PLANK_WINDOW);
    public static final Item CRIMSON_WINDOW             =   registerBlockItem("crimson_window",             ModBlocks.CRIMSON_WINDOW);
    public static final Item STRIPPED_CRIMSON_WINDOW    =   registerBlockItem("stripped_crimson_window",    ModBlocks.STRIPPED_CRIMSON_WINDOW);
    public static final Item CRIMSON_PLANK_WINDOW       =   registerBlockItem("crimson_plank_window",       ModBlocks.CRIMSON_PLANK_WINDOW);
    public static final Item WARPED_WINDOW              =   registerBlockItem("warped_window",              ModBlocks.WARPED_WINDOW);
    public static final Item STRIPPED_WARPED_WINDOW     =   registerBlockItem("stripped_warped_window",     ModBlocks.STRIPPED_WARPED_WINDOW);
    public static final Item WARPED_PLANK_WINDOW        =   registerBlockItem("warped_plank_window",        ModBlocks.WARPED_PLANK_WINDOW);

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Owen233666sWindows.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModItems(){

    }
}
