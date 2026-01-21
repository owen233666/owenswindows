package com.owen233666.owenswindows.block;

import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, owen233666swindows.MODID);

    private static RegistryObject<Block> registerWindow(String name){
        return BLOCKS.register(name, () -> new ConnectableWindowBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6F, 1.2F).noOcclusion()));
    };

    public static final RegistryObject<Block> OAK_WINDOW                =       registerWindow("oak_window");
    public static final RegistryObject<Block> STRIPPED_OAK_WINDOW       =       registerWindow("stripped_oak_window");
    public static final RegistryObject<Block> OAK_PLANK_WINDOW          =       registerWindow("oak_plank_window");
    public static final RegistryObject<Block> SPRUCE_WINDOW             =       registerWindow("spruce_window");
    public static final RegistryObject<Block> STRIPPED_SPRUCE_WINDOW    =       registerWindow("stripped_spruce_window");
    public static final RegistryObject<Block> SPRUCE_PLANK_WINDOW       =       registerWindow("spruce_plank_window");
    public static final RegistryObject<Block> BIRCH_WINDOW              =       registerWindow("birch_window");
    public static final RegistryObject<Block> STRIPPED_BIRCH_WINDOW     =       registerWindow("stripped_birch_window");
    public static final RegistryObject<Block> BIRCH_PLANK_WINDOW        =       registerWindow("birch_plank_window");
    public static final RegistryObject<Block> JUNGLE_WINDOW             =       registerWindow("jungle_window");
    public static final RegistryObject<Block> STRIPPED_JUNGLE_WINDOW    =       registerWindow("stripped_jungle_window");
    public static final RegistryObject<Block> JUNGLE_PLANK_WINDOW       =       registerWindow("jungle_plank_window");
    public static final RegistryObject<Block> ACACIA_WINDOW             =       registerWindow("acacia_window");
    public static final RegistryObject<Block> STRIPPED_ACACIA_WINDOW    =       registerWindow("stripped_acacia_window");
    public static final RegistryObject<Block> ACACIA_PLANK_WINDOW       =       registerWindow("acacia_plank_window");
    public static final RegistryObject<Block> DARK_OAK_WINDOW           =       registerWindow("dark_oak_window");
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WINDOW  =       registerWindow("stripped_dark_oak_window");
    public static final RegistryObject<Block> DARK_OAK_PLANK_WINDOW     =       registerWindow("dark_oak_plank_window");
    public static final RegistryObject<Block> MANGROVE_WINDOW           =       registerWindow("mangrove_window");
    public static final RegistryObject<Block> STRIPPED_MANGROVE_WINDOW  =       registerWindow("stripped_mangrove_window");
    public static final RegistryObject<Block> MANGROVE_PLANK_WINDOW     =       registerWindow("mangrove_plank_window");
    public static final RegistryObject<Block> CHERRY_WINDOW             =       registerWindow("cherry_window");
    public static final RegistryObject<Block> STRIPPED_CHERRY_WINDOW    =       registerWindow("stripped_cherry_window");
    public static final RegistryObject<Block> CHERRY_PLANK_WINDOW       =       registerWindow("cherry_plank_window");
    public static final RegistryObject<Block> BAMBOO_WINDOW             =       registerWindow("bamboo_window");
    public static final RegistryObject<Block> STRIPPED_BAMBOO_WINDOW    =       registerWindow("stripped_bamboo_window");
    public static final RegistryObject<Block> BAMBOO_PLANK_WINDOW       =       registerWindow("bamboo_plank_window");
    public static final RegistryObject<Block> CRIMSON_WINDOW            =       registerWindow("crimson_window");
    public static final RegistryObject<Block> STRIPPED_CRIMSON_WINDOW   =       registerWindow("stripped_crimson_window");
    public static final RegistryObject<Block> CRIMSON_PLANK_WINDOW      =       registerWindow("crimson_plank_window");
    public static final RegistryObject<Block> WARPED_WINDOW             =       registerWindow("warped_window");
    public static final RegistryObject<Block> STRIPPED_WARPED_WINDOW    =       registerWindow("stripped_warped_window");
    public static final RegistryObject<Block> WARPED_PLANK_WINDOW       =       registerWindow("warped_plank_window");

}
