package com.owen233666.owenswindows.creativetab;

import com.owen233666.owenswindows.item.ModItems;
import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModcreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, owen233666swindows.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("trace_the_light_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.owenwwindows")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.STRIPPED_OAK_WINDOW.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.OAK_WINDOW.get());
                output.accept(ModItems.STRIPPED_OAK_WINDOW.get());
                output.accept(ModItems.OAK_PLANK_WINDOW.get());
                output.accept(ModItems.SPRUCE_WINDOW.get());
                output.accept(ModItems.STRIPPED_SPRUCE_WINDOW.get());
                output.accept(ModItems.SPRUCE_PLANK_WINDOW.get());
                output.accept(ModItems.BIRCH_WINDOW.get());
                output.accept(ModItems.STRIPPED_BIRCH_WINDOW.get());
                output.accept(ModItems.BIRCH_PLANK_WINDOW.get());
                output.accept(ModItems.JUNGLE_WINDOW.get());
                output.accept(ModItems.STRIPPED_JUNGLE_WINDOW.get());
                output.accept(ModItems.JUNGLE_PLANK_WINDOW.get());
                output.accept(ModItems.ACACIA_WINDOW.get());
                output.accept(ModItems.STRIPPED_ACACIA_WINDOW.get());
                output.accept(ModItems.ACACIA_PLANK_WINDOW.get());
                output.accept(ModItems.DARK_OAK_WINDOW.get());
                output.accept(ModItems.STRIPPED_DARK_OAK_WINDOW.get());
                output.accept(ModItems.DARK_OAK_PLANK_WINDOW.get());
                output.accept(ModItems.MANGROVE_WINDOW.get());
                output.accept(ModItems.STRIPPED_MANGROVE_WINDOW.get());
                output.accept(ModItems.MANGROVE_PLANK_WINDOW.get());
                output.accept(ModItems.CHERRY_WINDOW.get());
                output.accept(ModItems.STRIPPED_CHERRY_WINDOW.get());
                output.accept(ModItems.CHERRY_PLANK_WINDOW.get());
                output.accept(ModItems.BAMBOO_WINDOW.get());
                output.accept(ModItems.STRIPPED_BAMBOO_WINDOW.get());
                output.accept(ModItems.BAMBOO_PLANK_WINDOW.get());
                output.accept(ModItems.CRIMSON_WINDOW.get());
                output.accept(ModItems.STRIPPED_CRIMSON_WINDOW.get());
                output.accept(ModItems.CRIMSON_PLANK_WINDOW.get());
                output.accept(ModItems.WARPED_WINDOW.get());
                output.accept(ModItems.STRIPPED_WARPED_WINDOW.get());
                output.accept(ModItems.WARPED_PLANK_WINDOW.get());
            }).build());

}
