package com.owen233666.owenswindows.item;

import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, owen233666swindows.MODID);
    //window item窗户物品
    public static final RegistryObject<Item> OAK_WINDOW                  =   ITEMS.register("oak_window",                () -> new BlockItem(ModBlocks.OAK_WINDOW.get(),                 new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_WINDOW         =   ITEMS.register("stripped_oak_window",       () -> new BlockItem(ModBlocks.STRIPPED_OAK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> OAK_PLANK_WINDOW            =   ITEMS.register("oak_plank_window",          () -> new BlockItem(ModBlocks.OAK_PLANK_WINDOW.get(),           new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WINDOW               =   ITEMS.register("spruce_window",             () -> new BlockItem(ModBlocks.SPRUCE_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_WINDOW      =   ITEMS.register("stripped_spruce_window",    () -> new BlockItem(ModBlocks.STRIPPED_SPRUCE_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_PLANK_WINDOW         =   ITEMS.register("spruce_plank_window",       () -> new BlockItem(ModBlocks.SPRUCE_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WINDOW                =   ITEMS.register("birch_window",              () -> new BlockItem(ModBlocks.BIRCH_WINDOW.get(),               new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_WINDOW       =   ITEMS.register("stripped_birch_window",     () -> new BlockItem(ModBlocks.STRIPPED_BIRCH_WINDOW.get(),      new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PLANK_WINDOW          =   ITEMS.register("birch_plank_window",        () -> new BlockItem(ModBlocks.BIRCH_PLANK_WINDOW.get(),         new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WINDOW               =   ITEMS.register("jungle_window",             () -> new BlockItem(ModBlocks.JUNGLE_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_WINDOW      =   ITEMS.register("stripped_jungle_window",    () -> new BlockItem(ModBlocks.STRIPPED_JUNGLE_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PLANK_WINDOW         =   ITEMS.register("jungle_plank_window",       () -> new BlockItem(ModBlocks.JUNGLE_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WINDOW               =   ITEMS.register("acacia_window",             () -> new BlockItem(ModBlocks.ACACIA_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_WINDOW      =   ITEMS.register("stripped_acacia_window",    () -> new BlockItem(ModBlocks.STRIPPED_ACACIA_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PLANK_WINDOW         =   ITEMS.register("acacia_plank_window",       () -> new BlockItem(ModBlocks.ACACIA_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WINDOW             =   ITEMS.register("dark_oak_window",           () -> new BlockItem(ModBlocks.DARK_OAK_WINDOW.get(),            new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_WINDOW    =   ITEMS.register("stripped_dark_oak_window",  () -> new BlockItem(ModBlocks.STRIPPED_DARK_OAK_WINDOW.get(),   new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_PLANK_WINDOW       =   ITEMS.register("dark_oak_plank_window",     () -> new BlockItem(ModBlocks.DARK_OAK_PLANK_WINDOW.get(),      new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WINDOW             =   ITEMS.register("mangrove_window",           () -> new BlockItem(ModBlocks.MANGROVE_WINDOW.get(),            new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_WINDOW    =   ITEMS.register("stripped_mangrove_window",  () -> new BlockItem(ModBlocks.STRIPPED_MANGROVE_WINDOW.get(),   new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PLANK_WINDOW       =   ITEMS.register("mangrove_plank_window",     () -> new BlockItem(ModBlocks.MANGROVE_PLANK_WINDOW.get(),      new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WINDOW               =   ITEMS.register("cherry_window",             () -> new BlockItem(ModBlocks.CHERRY_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHERRY_WINDOW      =   ITEMS.register("stripped_cherry_window",    () -> new BlockItem(ModBlocks.STRIPPED_CHERRY_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_PLANK_WINDOW         =   ITEMS.register("cherry_plank_window",       () -> new BlockItem(ModBlocks.CHERRY_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WINDOW               =   ITEMS.register("bamboo_window",             () -> new BlockItem(ModBlocks.BAMBOO_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_WINDOW      =   ITEMS.register("stripped_bamboo_window",    () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_PLANK_WINDOW         =   ITEMS.register("bamboo_plank_window",       () -> new BlockItem(ModBlocks.BAMBOO_PLANK_WINDOW.get(),        new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WINDOW              =   ITEMS.register("crimson_window",            () -> new BlockItem(ModBlocks.CRIMSON_WINDOW.get(),             new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_WINDOW     =   ITEMS.register("stripped_crimson_window",   () -> new BlockItem(ModBlocks.STRIPPED_CRIMSON_WINDOW.get(),    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PLANK_WINDOW        =   ITEMS.register("crimson_plank_window",      () -> new BlockItem(ModBlocks.CRIMSON_PLANK_WINDOW.get(),       new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WINDOW               =   ITEMS.register("warped_window",             () -> new BlockItem(ModBlocks.WARPED_WINDOW.get(),              new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WARPED_WINDOW      =   ITEMS.register("stripped_warped_window",    () -> new BlockItem(ModBlocks.STRIPPED_WARPED_WINDOW.get(),     new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PLANK_WINDOW         =   ITEMS.register("warped_plank_window",       () -> new BlockItem(ModBlocks.WARPED_PLANK_WINDOW.get(),        new Item.Properties()));

}
