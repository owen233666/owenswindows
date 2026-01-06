package com.owen233666.owenswindows.block;

import com.owen233666.owenswindows.Owen233666sWindows;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    public static final Block OAK_WINDOW                =       registerBlock("oak_window",                 new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_OAK_WINDOW       =       registerBlock("stripped_oak_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block OAK_PLANK_WINDOW          =       registerBlock("oak_plank_window",           new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block SPRUCE_WINDOW             =       registerBlock("spruce_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_SPRUCE_WINDOW    =       registerBlock("stripped_spruce_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block SPRUCE_PLANK_WINDOW       =       registerBlock("spruce_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block BIRCH_WINDOW              =       registerBlock("birch_window",               new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_BIRCH_WINDOW     =       registerBlock("stripped_birch_window",      new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block BIRCH_PLANK_WINDOW        =       registerBlock("birch_plank_window",         new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block JUNGLE_WINDOW             =       registerBlock("jungle_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_JUNGLE_WINDOW    =       registerBlock("stripped_jungle_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block JUNGLE_PLANK_WINDOW       =       registerBlock("jungle_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block ACACIA_WINDOW             =       registerBlock("acacia_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_ACACIA_WINDOW    =       registerBlock("stripped_acacia_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block ACACIA_PLANK_WINDOW       =       registerBlock("acacia_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block DARK_OAK_WINDOW           =       registerBlock("dark_oak_window",            new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_DARK_OAK_WINDOW  =       registerBlock("stripped_dark_oak_window",   new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block DARK_OAK_PLANK_WINDOW     =       registerBlock("dark_oak_plank_window",      new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block MANGROVE_WINDOW           =       registerBlock("mangrove_window",            new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_MANGROVE_WINDOW  =       registerBlock("stripped_mangrove_window",   new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block MANGROVE_PLANK_WINDOW     =       registerBlock("mangrove_plank_window",      new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block CHERRY_WINDOW             =       registerBlock("cherry_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_CHERRY_WINDOW    =       registerBlock("stripped_cherry_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block CHERRY_PLANK_WINDOW       =       registerBlock("cherry_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block BAMBOO_WINDOW             =       registerBlock("bamboo_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_BAMBOO_WINDOW    =       registerBlock("stripped_bamboo_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block BAMBOO_PLANK_WINDOW       =       registerBlock("bamboo_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block CRIMSON_WINDOW            =       registerBlock("crimson_window",             new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_CRIMSON_WINDOW   =       registerBlock("stripped_crimson_window",    new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block CRIMSON_PLANK_WINDOW      =       registerBlock("crimson_plank_window",       new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block WARPED_WINDOW             =       registerBlock("warped_window",              new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block STRIPPED_WARPED_WINDOW    =       registerBlock("stripped_warped_window",     new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    public static final Block WARPED_PLANK_WINDOW       =       registerBlock("warped_plank_window",        new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));


    public static Block registerBlock(String name, Block block){
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Owen233666sWindows.MOD_ID, name), block);
    }

    public static void registerModBlocks(){

    }
}
