package com.owen233666.owenswindows;

import com.owen233666.owenswindows.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class owen233666swindowsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 将所有窗口方块设置为半透明渲染
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_OAK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_SPRUCE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BIRCH_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_JUNGLE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_ACACIA_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_DARK_OAK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_MANGROVE_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_CHERRY_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BAMBOO_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_CRIMSON_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_PLANK_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_WARPED_WINDOW, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_PLANK_WINDOW, RenderType.cutout());
	}
}