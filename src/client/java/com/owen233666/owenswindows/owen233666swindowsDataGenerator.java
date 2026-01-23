package com.owen233666.owenswindows;

import com.owen233666.owenswindows.datagen.ModBlockLootTableProvider;
import com.owen233666.owenswindows.datagen.ModBlockModelProvider;
import com.owen233666.owenswindows.datagen.ModRecipeProvider;
import com.owen233666.owenswindows.datagen.ModStandaloneBlockStatesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class owen233666swindowsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider((FabricDataGenerator.Pack.Factory<ModStandaloneBlockStatesProvider>) ModStandaloneBlockStatesProvider::new);
		pack.addProvider(ModBlockModelProvider::new);


	}
}
