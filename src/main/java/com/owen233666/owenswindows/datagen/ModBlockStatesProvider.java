package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.block.ConnectableWindowBlock;
import com.owen233666.owenswindows.block.ModBlocks;
import com.owen233666.owenswindows.owen233666swindows;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.MultiPartBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, owen233666swindows.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerWindowBlockStates(ModBlocks.OAK_WINDOW.get(),               "oak");
        registerWindowBlockStates(ModBlocks.STRIPPED_OAK_WINDOW.get(),      "stripped_oak");
        registerWindowBlockStates(ModBlocks.OAK_PLANK_WINDOW.get(),         "oak_plank");
        registerWindowBlockStates(ModBlocks.SPRUCE_WINDOW.get(),            "spruce");
        registerWindowBlockStates(ModBlocks.STRIPPED_SPRUCE_WINDOW.get(),   "stripped_spruce");
        registerWindowBlockStates(ModBlocks.SPRUCE_PLANK_WINDOW.get(),      "spruce_plank");
        registerWindowBlockStates(ModBlocks.BIRCH_WINDOW.get(),             "birch");
        registerWindowBlockStates(ModBlocks.STRIPPED_BIRCH_WINDOW.get(),    "stripped_birch");
        registerWindowBlockStates(ModBlocks.BIRCH_PLANK_WINDOW.get(),       "birch_plank");
        registerWindowBlockStates(ModBlocks.JUNGLE_WINDOW.get(),            "jungle");
        registerWindowBlockStates(ModBlocks.STRIPPED_JUNGLE_WINDOW.get(),   "stripped_jungle");
        registerWindowBlockStates(ModBlocks.JUNGLE_PLANK_WINDOW.get(),      "jungle_plank");
        registerWindowBlockStates(ModBlocks.ACACIA_WINDOW.get(),            "acacia");
        registerWindowBlockStates(ModBlocks.STRIPPED_ACACIA_WINDOW.get(),   "stripped_acacia");
        registerWindowBlockStates(ModBlocks.ACACIA_PLANK_WINDOW.get(),      "acacia_plank");
        registerWindowBlockStates(ModBlocks.DARK_OAK_WINDOW.get(),          "dark_oak");
        registerWindowBlockStates(ModBlocks.STRIPPED_DARK_OAK_WINDOW.get(), "stripped_dark_oak");
        registerWindowBlockStates(ModBlocks.DARK_OAK_PLANK_WINDOW.get(),    "dark_oak_plank");
        registerWindowBlockStates(ModBlocks.MANGROVE_WINDOW.get(),          "mangrove");
        registerWindowBlockStates(ModBlocks.STRIPPED_MANGROVE_WINDOW.get(), "stripped_mangrove");
        registerWindowBlockStates(ModBlocks.MANGROVE_PLANK_WINDOW.get(),    "mangrove_plank");
        registerWindowBlockStates(ModBlocks.CHERRY_WINDOW.get(),            "cherry");
        registerWindowBlockStates(ModBlocks.STRIPPED_CHERRY_WINDOW.get(),   "stripped_cherry");
        registerWindowBlockStates(ModBlocks.CHERRY_PLANK_WINDOW.get(),      "cherry_plank");
        registerWindowBlockStates(ModBlocks.BAMBOO_WINDOW.get(),            "bamboo");
        registerWindowBlockStates(ModBlocks.STRIPPED_BAMBOO_WINDOW.get(),   "stripped_bamboo");
        registerWindowBlockStates(ModBlocks.BAMBOO_PLANK_WINDOW.get(),      "bamboo_plank");
        registerWindowBlockStates(ModBlocks.CRIMSON_WINDOW.get(),           "crimson");
        registerWindowBlockStates(ModBlocks.STRIPPED_CRIMSON_WINDOW.get(),  "stripped_crimson");
        registerWindowBlockStates(ModBlocks.CRIMSON_PLANK_WINDOW.get(),     "crimson_plank");
        registerWindowBlockStates(ModBlocks.WARPED_WINDOW.get(),            "warped");
        registerWindowBlockStates(ModBlocks.STRIPPED_WARPED_WINDOW.get(),   "stripped_warped");
        registerWindowBlockStates(ModBlocks.WARPED_PLANK_WINDOW.get(),      "warped_plank");
    }

    private void registerWindowBlockStates(ConnectableWindowBlock windowBlock, String woodType){
        MultiPartBlockStateBuilder builder = getMultipartBuilder(windowBlock);

        // --- 非角落方块，朝北 ---
        // 基础玻璃
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_glass_noframe")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH);

        // 顶部边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/"+ woodType + "_frame_top")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 左上角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 右上角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 底部边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_bot")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 左下角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 右下角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 右侧边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_right")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.EAST, false);

        // 右上角（右侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.EAST, false);

        // 右下角（右侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.EAST, false);

        // 左侧边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_left")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.WEST, false);

        // 左上角（左侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.WEST, false);

        // 左下角（左侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.NORTH)
                .condition(ConnectableWindowBlock.WEST, false);

        // --- 非角落方块，朝东 ---
        // 基础玻璃
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_glass_noframe")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST);

        // 顶部边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_top")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 左上角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 右上角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.ABOVE, false);

        // 底部边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_bot")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 左下角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 右下角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 右侧边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_right")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.SOUTH, false);

        // 右上角（右侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.SOUTH, false);

        // 右下角（右侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.SOUTH, false);

        // 左侧边框
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_left")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.NORTH, false);

        // 左上角（左侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.NORTH, false);

        // 左下角（左侧）
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, false)
                .condition(ConnectableWindowBlock.FACING, Direction.EAST)
                .condition(ConnectableWindowBlock.NORTH, false);

        // --- 直角角落方块 ---
        // 西北角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_right_glass_noframe")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 东北角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_right_glass_noframe")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 东南角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_right_glass_noframe")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 西南角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_right_glass_noframe")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.RIGHT)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // --- 圆角角落方块 ---
        // 西北角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_rounded_glass_noframe")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot")))
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 东北角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_rounded_glass_noframe")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot")))
                .rotationY(90)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.NORTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 东南角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_rounded_glass_noframe")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot")))
                .rotationY(180)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.EAST, true)
                .condition(ConnectableWindowBlock.BELOW, false);

        // 西南角
        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/window_frame_corner_rounded_glass_noframe")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.ABOVE, false);

        builder.part()
                .modelFile(models().getExistingFile(modLoc("block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot")))
                .rotationY(270)
                .addModel()
                .condition(ConnectableWindowBlock.IS_CORNER, true)
                .condition(ConnectableWindowBlock.CORNER_TYPE, ConnectableWindowBlock.CornerType.ROUNDED)
                .condition(ConnectableWindowBlock.SOUTH, true)
                .condition(ConnectableWindowBlock.WEST, true)
                .condition(ConnectableWindowBlock.BELOW, false);
    }

    @Override
    public ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath("owenswindows", path);
    }
}
