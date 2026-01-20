package com.owen233666.owenswindows.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ModBlockModelProvider extends FabricModelProvider {
    private static final Map<String, String> WOOD_TEXTURES = new HashMap<>();

    // 为每个窗户组件创建模型模板
    private static final Map<String, ModelTemplate> MODEL_TEMPLATES = new HashMap<>();

    // 定义纹理插槽常量（确保一致性）
    private static final TextureSlot TEXTURE_SLOT_0 = TextureSlot.create("0");
    private static final TextureSlot TEXTURE_SLOT_2 = TextureSlot.create("2");
    private static final TextureSlot TEXTURE_SLOT_PARTICLE = TextureSlot.PARTICLE;

    static {
        // 纹理映射保持不变
        WOOD_TEXTURES.put("oak", "minecraft:block/oak_log");
        WOOD_TEXTURES.put("stripped_oak", "minecraft:block/stripped_oak_log");
        WOOD_TEXTURES.put("oak_plank", "minecraft:block/oak_planks");
        WOOD_TEXTURES.put("spruce", "minecraft:block/spruce_log");
        WOOD_TEXTURES.put("stripped_spruce", "minecraft:block/stripped_spruce_log");
        WOOD_TEXTURES.put("spruce_plank", "minecraft:block/spruce_planks");
        WOOD_TEXTURES.put("birch", "minecraft:block/birch_log");
        WOOD_TEXTURES.put("stripped_birch", "minecraft:block/stripped_birch_log");
        WOOD_TEXTURES.put("birch_plank", "minecraft:block/birch_planks");
        WOOD_TEXTURES.put("jungle", "minecraft:block/jungle_log");
        WOOD_TEXTURES.put("stripped_jungle", "minecraft:block/stripped_jungle_log");
        WOOD_TEXTURES.put("jungle_plank", "minecraft:block/jungle_planks");
        WOOD_TEXTURES.put("acacia", "minecraft:block/acacia_log");
        WOOD_TEXTURES.put("stripped_acacia", "minecraft:block/stripped_acacia_log");
        WOOD_TEXTURES.put("acacia_plank", "minecraft:block/acacia_planks");
        WOOD_TEXTURES.put("dark_oak", "minecraft:block/dark_oak_log");
        WOOD_TEXTURES.put("stripped_dark_oak", "minecraft:block/stripped_dark_oak_log");
        WOOD_TEXTURES.put("dark_oak_plank", "minecraft:block/dark_oak_planks");
        WOOD_TEXTURES.put("mangrove", "minecraft:block/mangrove_log");
        WOOD_TEXTURES.put("stripped_mangrove", "minecraft:block/stripped_mangrove_log");
        WOOD_TEXTURES.put("mangrove_plank", "minecraft:block/mangrove_planks");
        WOOD_TEXTURES.put("cherry", "minecraft:block/cherry_log");
        WOOD_TEXTURES.put("stripped_cherry", "minecraft:block/stripped_cherry_log");
        WOOD_TEXTURES.put("cherry_plank", "minecraft:block/cherry_planks");
        WOOD_TEXTURES.put("bamboo", "minecraft:block/bamboo_block");
        WOOD_TEXTURES.put("stripped_bamboo", "minecraft:block/stripped_bamboo_block");
        WOOD_TEXTURES.put("bamboo_plank", "minecraft:block/bamboo_planks");
        WOOD_TEXTURES.put("crimson", "minecraft:block/crimson_stem");
        WOOD_TEXTURES.put("stripped_crimson", "minecraft:block/stripped_crimson_stem");
        WOOD_TEXTURES.put("crimson_plank", "minecraft:block/crimson_planks");
        WOOD_TEXTURES.put("warped", "minecraft:block/warped_stem");
        WOOD_TEXTURES.put("stripped_warped", "minecraft:block/stripped_warped_stem");
        WOOD_TEXTURES.put("warped_plank", "minecraft:block/warped_planks");

        // 创建所有窗户组件的模型模板
        createWindowModelTemplates();
    }

    private static void createWindowModelTemplates() {
        // 为每个窗户组件类型创建对应的模型模板
        // 根据你的需求，为每个父模型创建模板
        createTemplate("window_frame_bot", TEXTURE_SLOT_0);
        createTemplate("window_frame_left", TEXTURE_SLOT_0);
        createTemplate("window_frame_right", TEXTURE_SLOT_0);
        createTemplate("window_frame_top", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_botl", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_botr", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_right_bot", TEXTURE_SLOT_2);
        createTemplate("window_frame_corner_right_top", TEXTURE_SLOT_2);
        createTemplate("window_frame_corner_rounded_bot", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_rounded_top", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_topl", TEXTURE_SLOT_0);
        createTemplate("window_frame_corner_topr", TEXTURE_SLOT_0);
    }

    private static void createTemplate(String parentModelName, TextureSlot slot) {
        // 使用预定义的纹理插槽常量
        ModelTemplate template = new ModelTemplate(
                Optional.of(new ResourceLocation("owenswindows", "block/parent/window/" + parentModelName)),
                Optional.empty(),
                slot, TEXTURE_SLOT_PARTICLE // 同时包含主要纹理和粒子纹理
        );
        MODEL_TEMPLATES.put(parentModelName, template);
    }

    public ModBlockModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        // 生成所有窗户的模型文件
        registerWindowBlockModels(blockModelGenerators, "oak");
        registerWindowBlockModels(blockModelGenerators, "stripped_oak");
        registerWindowBlockModels(blockModelGenerators, "oak_plank");
        registerWindowBlockModels(blockModelGenerators, "spruce");
        registerWindowBlockModels(blockModelGenerators, "stripped_spruce");
        registerWindowBlockModels(blockModelGenerators, "spruce_plank");
        registerWindowBlockModels(blockModelGenerators, "birch");
        registerWindowBlockModels(blockModelGenerators, "stripped_birch");
        registerWindowBlockModels(blockModelGenerators, "birch_plank");
        registerWindowBlockModels(blockModelGenerators, "jungle");
        registerWindowBlockModels(blockModelGenerators, "stripped_jungle");
        registerWindowBlockModels(blockModelGenerators, "jungle_plank");
        registerWindowBlockModels(blockModelGenerators, "acacia");
        registerWindowBlockModels(blockModelGenerators, "stripped_acacia");
        registerWindowBlockModels(blockModelGenerators, "acacia_plank");
        registerWindowBlockModels(blockModelGenerators, "dark_oak");
        registerWindowBlockModels(blockModelGenerators, "stripped_dark_oak");
        registerWindowBlockModels(blockModelGenerators, "dark_oak_plank");
        registerWindowBlockModels(blockModelGenerators, "mangrove");
        registerWindowBlockModels(blockModelGenerators, "stripped_mangrove");
        registerWindowBlockModels(blockModelGenerators, "mangrove_plank");
        registerWindowBlockModels(blockModelGenerators, "cherry");
        registerWindowBlockModels(blockModelGenerators, "stripped_cherry");
        registerWindowBlockModels(blockModelGenerators, "cherry_plank");
        registerWindowBlockModels(blockModelGenerators, "bamboo");
        registerWindowBlockModels(blockModelGenerators, "stripped_bamboo");
        registerWindowBlockModels(blockModelGenerators, "bamboo_plank");
        registerWindowBlockModels(blockModelGenerators, "crimson");
        registerWindowBlockModels(blockModelGenerators, "stripped_crimson");
        registerWindowBlockModels(blockModelGenerators, "crimson_plank");
        registerWindowBlockModels(blockModelGenerators, "warped");
        registerWindowBlockModels(blockModelGenerators, "stripped_warped");
        registerWindowBlockModels(blockModelGenerators, "warped_plank");
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        // 这里可以生成物品模型，如果需要的话
    }

    private void registerWindowBlockModels(BlockModelGenerators blockModelGenerators, String woodType) {
        String texture = WOOD_TEXTURES.get(woodType);
        if (texture == null) {
            throw new IllegalArgumentException("Unknown wood type: " + woodType);
        }

        String basePath = "block/resizable/" + woodType + "/" + woodType;
        ResourceLocation textureLocation = new ResourceLocation(texture);

        // 注册所有模型文件
        registerWindowModel(blockModelGenerators, basePath + "_frame_bot", "window_frame_bot", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_left", "window_frame_left", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_right", "window_frame_right", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_top", "window_frame_top", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_botl", "window_frame_corner_botl", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_botr", "window_frame_corner_botr", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_right_bot", "window_frame_corner_right_bot", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_right_top", "window_frame_corner_right_top", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_rounded_bot", "window_frame_corner_rounded_bot", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_rounded_top", "window_frame_corner_rounded_top", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_topl", "window_frame_corner_topl", textureLocation);
        registerWindowModel(blockModelGenerators, basePath + "_frame_corner_topr", "window_frame_corner_topr", textureLocation);
    }

    private void registerWindowModel(BlockModelGenerators blockModelGenerators, String modelName, String templateName, ResourceLocation texture) {
        ModelTemplate template = MODEL_TEMPLATES.get(templateName);
        if (template == null) {
            throw new IllegalArgumentException("Unknown model template: " + templateName);
        }

        // 创建纹理映射 - 使用预定义的纹理插槽常量
        TextureMapping textureMapping = createTextureMapping(templateName, texture);

        // 注册模型
        template.create(
                new ResourceLocation("owenswindows", modelName),
                textureMapping,
                blockModelGenerators.modelOutput
        );
    }

    private TextureMapping createTextureMapping(String templateName, ResourceLocation texture) {
        TextureMapping mapping = new TextureMapping();

        // 根据模板名称设置不同的纹理插槽 - 使用预定义的常量
        if (templateName.equals("window_frame_corner_right_bot") || templateName.equals("window_frame_corner_right_top")) {
            mapping.put(TEXTURE_SLOT_2, texture);
        } else {
            mapping.put(TEXTURE_SLOT_0, texture);
        }

        // 添加粒子纹理 - 使用预定义的常量
        mapping.put(TEXTURE_SLOT_PARTICLE, texture);

        return mapping;
    }

}