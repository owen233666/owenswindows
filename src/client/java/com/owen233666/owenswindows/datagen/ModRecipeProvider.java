package com.owen233666.owenswindows.datagen;

import com.owen233666.owenswindows.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.OAK_LOG)
                .unlockedBy("has_oak_log", has(Items.OAK_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_OAK_LOG)
                .unlockedBy("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.SPRUCE_LOG)
                .unlockedBy("has_spruce_log", has(Items.SPRUCE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_SPRUCE_LOG)
                .unlockedBy("has_strippped_spruce_log", has(Items.STRIPPED_SPRUCE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.BIRCH_LOG)
                .unlockedBy("has_birch_log", has(Items.BIRCH_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_BIRCH_LOG)
                .unlockedBy("has_stripped_birch_log", has(Items.STRIPPED_BIRCH_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.BIRCH_PLANKS)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.JUNGLE_LOG)
                .unlockedBy("has_jungle_log", has(Items.JUNGLE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_JUNGLE_LOG)
                .unlockedBy("has_stripped_jungle_log", has(Items.STRIPPED_JUNGLE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.JUNGLE_PLANKS)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.ACACIA_LOG)
                .unlockedBy("has_acacia_log", has(Items.ACACIA_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_ACACIA_LOG)
                .unlockedBy("has_stripped_acacia_log", has(Items.STRIPPED_ACACIA_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.ACACIA_PLANKS)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.DARK_OAK_LOG)
                .unlockedBy("has_dark_oak_log", has(Items.DARK_OAK_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_DARK_OAK_LOG)
                .unlockedBy("has_stripped_dark_oak_log", has(Items.STRIPPED_DARK_OAK_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.DARK_OAK_PLANKS)
                .unlockedBy("has_dark_oak_planks", has(Items.DARK_OAK_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.MANGROVE_LOG)
                .unlockedBy("has_mangrove_log", has(Items.MANGROVE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_MANGROVE_LOG)
                .unlockedBy("has_stripped_mangrove_log", has(Items.STRIPPED_MANGROVE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.MANGROVE_PLANKS)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.CHERRY_LOG)
                .unlockedBy("has_cherry_log", has(Items.CHERRY_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_CHERRY_LOG)
                .unlockedBy("has_stripped_cherry_log", has(Items.STRIPPED_CHERRY_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.CHERRY_PLANKS)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.BAMBOO_BLOCK)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BAMBOO_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_BAMBOO_BLOCK)
                .unlockedBy("has_stripped_bamboo_block", has(Items.STRIPPED_BAMBOO_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.BAMBOO_PLANKS)
                .unlockedBy("has_bamboo_planks", has(Items.BAMBOO_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.CRIMSON_STEM)
                .unlockedBy("has_crimson_stem", has(Items.CRIMSON_STEM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_CRIMSON_STEM)
                .unlockedBy("has_stripped_crimson_stem", has(Items.STRIPPED_CRIMSON_STEM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.CRIMSON_PLANKS)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.WARPED_STEM)
                .unlockedBy("has_warped_stem", has(Items.WARPED_STEM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WARPED_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.STRIPPED_WARPED_STEM)
                .unlockedBy("has_stripped_warped_stem", has(Items.STRIPPED_WARPED_STEM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_PLANK_WINDOW, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.WARPED_PLANKS)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS)).save(recipeOutput);

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.OAK_WINDOW), Ingredient.of(ModBlocks.STRIPPED_OAK_WINDOW), Ingredient.of(ModBlocks.OAK_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.OAK_WINDOW, ModBlocks.STRIPPED_OAK_WINDOW, ModBlocks.OAK_PLANK_WINDOW}),
                "oak",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.SPRUCE_WINDOW), Ingredient.of(ModBlocks.STRIPPED_SPRUCE_WINDOW), Ingredient.of(ModBlocks.SPRUCE_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.SPRUCE_WINDOW, ModBlocks.STRIPPED_SPRUCE_WINDOW, ModBlocks.SPRUCE_PLANK_WINDOW}),
                "spruce",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.BIRCH_WINDOW), Ingredient.of(ModBlocks.STRIPPED_BIRCH_WINDOW), Ingredient.of(ModBlocks.BIRCH_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.BIRCH_WINDOW, ModBlocks.STRIPPED_BIRCH_WINDOW, ModBlocks.BIRCH_PLANK_WINDOW}),
                "birch",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.JUNGLE_WINDOW), Ingredient.of(ModBlocks.STRIPPED_JUNGLE_WINDOW), Ingredient.of(ModBlocks.JUNGLE_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.JUNGLE_WINDOW, ModBlocks.STRIPPED_JUNGLE_WINDOW, ModBlocks.JUNGLE_PLANK_WINDOW}),
                "jungle",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.ACACIA_WINDOW), Ingredient.of(ModBlocks.STRIPPED_ACACIA_WINDOW), Ingredient.of(ModBlocks.ACACIA_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.ACACIA_WINDOW, ModBlocks.STRIPPED_ACACIA_WINDOW, ModBlocks.ACACIA_PLANK_WINDOW}),
                "acacia",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.DARK_OAK_WINDOW), Ingredient.of(ModBlocks.STRIPPED_DARK_OAK_WINDOW), Ingredient.of(ModBlocks.DARK_OAK_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.DARK_OAK_WINDOW, ModBlocks.STRIPPED_DARK_OAK_WINDOW, ModBlocks.DARK_OAK_PLANK_WINDOW}),
                "dark_oak",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.MANGROVE_WINDOW), Ingredient.of(ModBlocks.STRIPPED_MANGROVE_WINDOW), Ingredient.of(ModBlocks.MANGROVE_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.MANGROVE_WINDOW, ModBlocks.STRIPPED_MANGROVE_WINDOW, ModBlocks.MANGROVE_PLANK_WINDOW}),
                "mangrove",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.CHERRY_WINDOW), Ingredient.of(ModBlocks.STRIPPED_CHERRY_WINDOW), Ingredient.of(ModBlocks.CHERRY_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.CHERRY_WINDOW, ModBlocks.STRIPPED_CHERRY_WINDOW, ModBlocks.CHERRY_PLANK_WINDOW}),
                "cherry",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.BAMBOO_WINDOW), Ingredient.of(ModBlocks.STRIPPED_BAMBOO_WINDOW), Ingredient.of(ModBlocks.BAMBOO_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.BAMBOO_WINDOW, ModBlocks.STRIPPED_BAMBOO_WINDOW, ModBlocks.BAMBOO_PLANK_WINDOW}),
                "bamboo",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.CRIMSON_WINDOW), Ingredient.of(ModBlocks.STRIPPED_CRIMSON_WINDOW), Ingredient.of(ModBlocks.CRIMSON_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.CRIMSON_WINDOW, ModBlocks.STRIPPED_CRIMSON_WINDOW, ModBlocks.CRIMSON_PLANK_WINDOW}),
                "crimson",
                recipeOutput
        );

        createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
                List.of(new Ingredient[]{Ingredient.of(ModBlocks.WARPED_WINDOW), Ingredient.of(ModBlocks.STRIPPED_WARPED_WINDOW), Ingredient.of(ModBlocks.WARPED_PLANK_WINDOW)}),
                List.of(new ItemLike[]{ModBlocks.WARPED_WINDOW, ModBlocks.STRIPPED_WARPED_WINDOW, ModBlocks.WARPED_PLANK_WINDOW}),
                "warped",
                recipeOutput
        );
    }

    private static void createMultipleIngredientsAndMultipleResultsStoneCuttingRecipe(
            List<Ingredient> ingredients,
            List<ItemLike> results,
            String woodType,
            Consumer<FinishedRecipe> recipeOutput) {

        String[] suffixes = {"log", "stripped", "plank"};

        for (int i = 0; i < ingredients.size(); i++) {
            for (int j = 0; j < results.size(); j++) {
                if (ingredientMatchesItem(ingredients.get(i), results.get(j))) {
                    continue; // 跳过自己转自己
                }

                ItemLike inputItem = getFirstItemFromIngredient(ingredients.get(i));
                if (inputItem == null) continue;

                // 为每个配方生成唯一的名称
                String recipeName = woodType + "_" + suffixes[j] + "_window_from_" + woodType + "_" + suffixes[i] + "_window_stonecutting";

                SingleItemRecipeBuilder.stonecutting(ingredients.get(i), RecipeCategory.BUILDING_BLOCKS, results.get(j))
                        .unlockedBy("has_" + getAItemName(inputItem), has(inputItem))
                        .save(recipeOutput, recipeName); // 使用.save()并指定名称
            }
        }
    }

    private static boolean ingredientMatchesItem(Ingredient ingredient, ItemLike item) {
        ItemStack testStack = new ItemStack(item.asItem());
        return ingredient.test(testStack);
    }

    private static ItemLike getFirstItemFromIngredient(Ingredient ingredient) {
        var items = ingredient.getItems();
        if (items.length > 0) {
            return items[0].getItem();
        }
        return null;
    }

    private static String getAItemName(ItemLike item) {
        if (item == null) return "unknown";
        return item.asItem().getDescriptionId()
                .replace("block.owenswindows.", "")
                .replace(".", "_")
                .toLowerCase();
    }
}
