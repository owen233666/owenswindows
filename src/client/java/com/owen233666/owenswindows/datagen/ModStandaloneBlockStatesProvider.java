package com.owen233666.owenswindows.datagen;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModStandaloneBlockStatesProvider implements DataProvider {
    private final PackOutput packOutput;

    // 定义所有木材类型
    private static final List<String> WOOD_TYPES = ImmutableList.of(
            "oak", "stripped_oak", "oak_plank",
            "spruce", "stripped_spruce", "spruce_plank",
            "birch", "stripped_birch", "birch_plank",
            "jungle", "stripped_jungle", "jungle_plank",
            "acacia", "stripped_acacia", "acacia_plank",
            "dark_oak", "stripped_dark_oak", "dark_oak_plank",
            "mangrove", "stripped_mangrove", "mangrove_plank",
            "cherry", "stripped_cherry", "cherry_plank",
            "bamboo", "stripped_bamboo", "bamboo_plank",
            "crimson", "stripped_crimson", "crimson_plank",
            "warped", "stripped_warped", "warped_plank"
    );

    public ModStandaloneBlockStatesProvider(PackOutput packOutput) {
        this.packOutput = packOutput;
    }

    @Override
    public @NotNull CompletableFuture<?> run(CachedOutput cachedOutput) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        // 为每种木材类型生成方块状态文件
        for (String woodType : WOOD_TYPES) {
            futures.add(generateWindowBlockState(cachedOutput, woodType));
        }

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    @Override
    public @NotNull String getName() {
        return "Window Block States";
    }

    private CompletableFuture<?> generateWindowBlockState(CachedOutput cachedOutput, String woodType) {
        JsonObject root = new JsonObject();
        JsonArray multipart = new JsonArray();

        // --- 非角落方块，朝北 ---
        addPart(multipart, "owenswindows:block/window_frame_glass_noframe", null,
                createWhen("false", "north"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_top", null,
                createWhen("false", "north", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl", null,
                createWhen("false", "north", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr", null,
                createWhen("false", "north", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_bot", null,
                createWhen("false", "north", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl", null,
                createWhen("false", "north", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr", null,
                createWhen("false", "north", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_right", null,
                createWhen("false", "north", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr", null,
                createWhen("false", "north", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr", null,
                createWhen("false", "north", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_left", null,
                createWhen("false", "north", null, null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl", null,
                createWhen("false", "north", null, null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl", null,
                createWhen("false", "north", null, null, "false", null));

        // --- 非角落方块，朝东 (带90度旋转) ---
        addPart(multipart, "owenswindows:block/window_frame_glass_noframe", 90,
                createWhen("false", "east"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_top", 90,
                createWhen("false", "east", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl", 90,
                createWhen("false", "east", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr", 90,
                createWhen("false", "east", "false", null, null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_bot", 90,
                createWhen("false", "east", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl", 90,
                createWhen("false", "east", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr", 90,
                createWhen("false", "east", null, "false", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_right", 90,
                createWhen("false", "east", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topr", 90,
                createWhen("false", "east", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botr", 90,
                createWhen("false", "east", null, null, null, "false"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_left", 90,
                createWhen("false", "east", null, null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_topl", 90,
                createWhen("false", "east", null, null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_botl", 90,
                createWhen("false", "east", null, null, "false", null));

        // --- 直角角落方块 ---
        // 西北角
        addPart(multipart, "owenswindows:block/window_frame_corner_right_glass_noframe", null,
                createCornerWhen("true", "right", "true", "true", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top", null,
                createCornerWhen("true", "right", "true", "true", "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot", null,
                createCornerWhen("true", "right", "true", "true", null, "false"));

        // 东北角 (90度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_right_glass_noframe", 90,
                createCornerWhen("true", "right", "true", null, null, "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top", 90,
                createCornerWhen("true", "right", "true", null, "false", "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot", 90,
                createCornerWhen("true", "right", "true", null, null, "true", null, "false"));

        // 东南角 (180度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_right_glass_noframe", 180,
                createCornerWhen("true", "right", null, null, "true", "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top", 180,
                createCornerWhen("true", "right", null, null, "true", "true", "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot", 180,
                createCornerWhen("true", "right", null, null, "true", "true", null, "false"));

        // 西南角 (270度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_right_glass_noframe", 270,
                createCornerWhen("true", "right", null, "true", "true", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_top", 270,
                createCornerWhen("true", "right", null, "true", "true", null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_right_bot", 270,
                createCornerWhen("true", "right", null, "true", "true", null, null, "false"));

        // --- 圆角角落方块 ---
        // 西北角
        addPart(multipart, "owenswindows:block/window_frame_corner_rounded_glass_noframe", null,
                createCornerWhen("true", "rounded", "true", "true", null, null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top", null,
                createCornerWhen("true", "rounded", "true", "true", "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot", null,
                createCornerWhen("true", "rounded", "true", "true", null, "false"));

        // 东北角 (90度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_rounded_glass_noframe", 90,
                createCornerWhen("true", "rounded", "true", null, null, "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top", 90,
                createCornerWhen("true", "rounded", "true", null, "false", "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot", 90,
                createCornerWhen("true", "rounded", "true", null, null, "true", null, "false"));

        // 东南角 (180度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_rounded_glass_noframe", 180,
                createCornerWhen("true", "rounded", null, null, "true", "true"));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top", 180,
                createCornerWhen("true", "rounded", null, null, "true", "true", "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot", 180,
                createCornerWhen("true", "rounded", null, null, "true", "true", null, "false"));

        // 西南角 (270度旋转)
        addPart(multipart, "owenswindows:block/window_frame_corner_rounded_glass_noframe", 270,
                createCornerWhen("true", "rounded", null, "true", "true", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_top", 270,
                createCornerWhen("true", "rounded", null, "true", "true", null, "false", null));
        addPart(multipart, "owenswindows:block/resizable/" + woodType + "/" + woodType + "_frame_corner_rounded_bot", 270,
                createCornerWhen("true", "rounded", null, "true", "true", null, null, "false"));

        root.add("multipart", multipart);

        // 保存文件到正确路径
        String fileName = woodType + "_window.json";
        ResourceLocation location = new ResourceLocation("owenswindows", fileName);
        return DataProvider.saveStable(cachedOutput, root,
                this.packOutput.getOutputFolder(PackOutput.Target.RESOURCE_PACK)
                        .resolve("owenswindows/blockstates/" + fileName));
    }

    private void addPart(JsonArray multipart, String modelPath, Integer rotationY, JsonObject when) {
        JsonObject part = new JsonObject();

        JsonObject apply = new JsonObject();
        apply.addProperty("model", modelPath);
        if (rotationY != null) {
            apply.addProperty("y", rotationY);
        }

        part.add("apply", apply);
        part.add("when", when);

        multipart.add(part);
    }

    private JsonObject createWhen(String isCorner, String facing, String above, String below, String west, String east) {
        JsonObject when = new JsonObject();
        when.addProperty("is_corner", isCorner);
        when.addProperty("facing", facing);

        if (above != null) when.addProperty("above", above);
        if (below != null) when.addProperty("below", below);
        if (west != null) when.addProperty("west", west);
        if (east != null) when.addProperty("east", east);

        return when;
    }

    private JsonObject createWhen(String isCorner, String facing) {
        return createWhen(isCorner, facing, null, null, null, null);
    }

    private JsonObject createCornerWhen(String isCorner, String cornerType, String north, String west, String above, String below) {
        JsonObject when = new JsonObject();
        when.addProperty("is_corner", isCorner);
        when.addProperty("corner_type", cornerType);

        if (north != null) when.addProperty("north", north);
        if (west != null) when.addProperty("west", west);
        if (above != null) when.addProperty("above", above);
        if (below != null) when.addProperty("below", below);

        return when;
    }

    private JsonObject createCornerWhen(String isCorner, String cornerType, String north, String west, String above, String below, String south, String east) {
        JsonObject when = createCornerWhen(isCorner, cornerType, north, west, above, below);

        if (south != null) when.addProperty("south", south);
        if (east != null) when.addProperty("east", east);

        return when;
    }
}