package com.owen233666.owenswindows.item;

import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, owen233666swindows.MODID);
    //window item窗户物品
    public static final DeferredHolder<Item, BlockItem> OAK_WINDOW                  =   ITEMS.register("oak_window",                () -> new BlockItem(ModBlocks.OAK_WINDOW.get(),                 new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_OAK_WINDOW         =   ITEMS.register("stripped_oak_window",       () -> new BlockItem(ModBlocks.STRIPPED_OAK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> OAK_PLANK_WINDOW            =   ITEMS.register("oak_plank_window",          () -> new BlockItem(ModBlocks.OAK_PLANK_WINDOW.get(),           new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> SPRUCE_WINDOW               =   ITEMS.register("spruce_window",             () -> new BlockItem(ModBlocks.SPRUCE_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_SPRUCE_WINDOW      =   ITEMS.register("stripped_spruce_window",    () -> new BlockItem(ModBlocks.STRIPPED_SPRUCE_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> SPRUCE_PLANK_WINDOW         =   ITEMS.register("spruce_plank_window",       () -> new BlockItem(ModBlocks.SPRUCE_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> BIRCH_WINDOW                =   ITEMS.register("birch_window",              () -> new BlockItem(ModBlocks.BIRCH_WINDOW.get(),               new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_BIRCH_WINDOW       =   ITEMS.register("stripped_birch_window",     () -> new BlockItem(ModBlocks.STRIPPED_BIRCH_WINDOW.get(),      new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> BIRCH_PLANK_WINDOW          =   ITEMS.register("birch_plank_window",        () -> new BlockItem(ModBlocks.BIRCH_PLANK_WINDOW.get(),         new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> JUNGLE_WINDOW               =   ITEMS.register("jungle_window",             () -> new BlockItem(ModBlocks.JUNGLE_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_JUNGLE_WINDOW      =   ITEMS.register("stripped_jungle_window",    () -> new BlockItem(ModBlocks.STRIPPED_JUNGLE_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> JUNGLE_PLANK_WINDOW         =   ITEMS.register("jungle_plank_window",       () -> new BlockItem(ModBlocks.JUNGLE_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> ACACIA_WINDOW               =   ITEMS.register("acacia_window",             () -> new BlockItem(ModBlocks.ACACIA_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_ACACIA_WINDOW      =   ITEMS.register("stripped_acacia_window",    () -> new BlockItem(ModBlocks.STRIPPED_ACACIA_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> ACACIA_PLANK_WINDOW         =   ITEMS.register("acacia_plank_window",       () -> new BlockItem(ModBlocks.ACACIA_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> DARK_OAK_WINDOW             =   ITEMS.register("dark_oak_window",           () -> new BlockItem(ModBlocks.DARK_OAK_WINDOW.get(),            new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_DARK_OAK_WINDOW    =   ITEMS.register("stripped_dark_oak_window",  () -> new BlockItem(ModBlocks.STRIPPED_DARK_OAK_WINDOW.get(),   new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> DARK_OAK_PLANK_WINDOW       =   ITEMS.register("dark_oak_plank_window",     () -> new BlockItem(ModBlocks.DARK_OAK_PLANK_WINDOW.get(),      new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> MANGROVE_WINDOW             =   ITEMS.register("mangrove_window",           () -> new BlockItem(ModBlocks.MANGROVE_WINDOW.get(),            new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_MANGROVE_WINDOW    =   ITEMS.register("stripped_mangrove_window",  () -> new BlockItem(ModBlocks.STRIPPED_MANGROVE_WINDOW.get(),   new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> MANGROVE_PLANK_WINDOW       =   ITEMS.register("mangrove_plank_window",     () -> new BlockItem(ModBlocks.MANGROVE_PLANK_WINDOW.get(),      new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> CHERRY_WINDOW               =   ITEMS.register("cherry_window",             () -> new BlockItem(ModBlocks.CHERRY_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_CHERRY_WINDOW      =   ITEMS.register("stripped_cherry_window",    () -> new BlockItem(ModBlocks.STRIPPED_CHERRY_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> CHERRY_PLANK_WINDOW         =   ITEMS.register("cherry_plank_window",       () -> new BlockItem(ModBlocks.CHERRY_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> BAMBOO_WINDOW               =   ITEMS.register("bamboo_window",             () -> new BlockItem(ModBlocks.BAMBOO_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_BAMBOO_WINDOW      =   ITEMS.register("stripped_bamboo_window",    () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> BAMBOO_PLANK_WINDOW         =   ITEMS.register("bamboo_plank_window",       () -> new BlockItem(ModBlocks.BAMBOO_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> CRIMSON_WINDOW              =   ITEMS.register("crimson_window",            () -> new BlockItem(ModBlocks.CRIMSON_WINDOW.get(),             new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_CRIMSON_WINDOW     =   ITEMS.register("stripped_crimson_window",   () -> new BlockItem(ModBlocks.STRIPPED_CRIMSON_WINDOW.get(),    new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> CRIMSON_PLANK_WINDOW        =   ITEMS.register("crimson_plank_window",      () -> new BlockItem(ModBlocks.CRIMSON_PLANK_WINDOW.get(),       new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> WARPED_WINDOW               =   ITEMS.register("warped_window",             () -> new BlockItem(ModBlocks.WARPED_WINDOW.get(),              new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> STRIPPED_WARPED_WINDOW      =   ITEMS.register("stripped_warped_window",    () -> new BlockItem(ModBlocks.STRIPPED_WARPED_WINDOW.get(),     new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> WARPED_PLANK_WINDOW         =   ITEMS.register("warped_plank_window",       () -> new BlockItem(ModBlocks.WARPED_PLANK_WINDOW.get(),        new Item.Properties()));

}
