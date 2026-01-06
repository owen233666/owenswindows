package com.owen233666.owenswindows.creativetab;

import com.owen233666.owenswindows.Owen233666sWindows;
import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.minecraft.world.item.CreativeModeTab.Row.TOP;

public class ModCreativetab {
    public static final CreativeModeTab ITEM_GROUP = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(Owen233666sWindows.MOD_ID, "itemtab"),
            CreativeModeTab.builder(TOP, 0).title(Component.translatable("creativetab.items"))
                    .icon(() -> {
                        return new ItemStack(BuiltInRegistries.BLOCK.get(new ResourceLocation(Owen233666sWindows.MOD_ID, "hot_cocoa")));
                    })
                    .displayItems((displayContext, output) -> {
                        output.accept(ModItems.OAK_WINDOW);
                        output.accept(ModItems.STRIPPED_OAK_WINDOW);
                        output.accept(ModItems.OAK_PLANK_WINDOW);
                        output.accept(ModItems.SPRUCE_WINDOW);
                        output.accept(ModItems.STRIPPED_SPRUCE_WINDOW);
                        output.accept(ModItems.SPRUCE_PLANK_WINDOW);
                        output.accept(ModItems.BIRCH_WINDOW);
                        output.accept(ModItems.STRIPPED_BIRCH_WINDOW);
                        output.accept(ModItems.BIRCH_PLANK_WINDOW);
                        output.accept(ModItems.JUNGLE_WINDOW);
                        output.accept(ModItems.STRIPPED_JUNGLE_WINDOW);
                        output.accept(ModItems.JUNGLE_PLANK_WINDOW);
                        output.accept(ModItems.ACACIA_WINDOW);
                        output.accept(ModItems.STRIPPED_ACACIA_WINDOW);
                        output.accept(ModItems.ACACIA_PLANK_WINDOW);
                        output.accept(ModItems.DARK_OAK_WINDOW);
                        output.accept(ModItems.STRIPPED_DARK_OAK_WINDOW);
                        output.accept(ModItems.DARK_OAK_PLANK_WINDOW);
                        output.accept(ModItems.MANGROVE_WINDOW);
                        output.accept(ModItems.STRIPPED_MANGROVE_WINDOW);
                        output.accept(ModItems.MANGROVE_PLANK_WINDOW);
                        output.accept(ModItems.CHERRY_WINDOW);
                        output.accept(ModItems.STRIPPED_CHERRY_WINDOW);
                        output.accept(ModItems.CHERRY_PLANK_WINDOW);
                        output.accept(ModItems.BAMBOO_WINDOW);
                        output.accept(ModItems.STRIPPED_BAMBOO_WINDOW);
                        output.accept(ModItems.BAMBOO_PLANK_WINDOW);
                        output.accept(ModItems.CRIMSON_WINDOW);
                        output.accept(ModItems.STRIPPED_CRIMSON_WINDOW);
                        output.accept(ModItems.CRIMSON_PLANK_WINDOW);
                        output.accept(ModItems.WARPED_WINDOW);
                        output.accept(ModItems.STRIPPED_WARPED_WINDOW);
                        output.accept(ModItems.WARPED_PLANK_WINDOW);
                    }).build()
    );

    public static void registerItemGroup(){

    }
}
