package net.kirito5391.firstmod.datagen;

import net.kirito5391.firstmod.FirstMod;
import net.kirito5391.firstmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FirstMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithitem(ModBlocks.ALEXANDRITE_BLOCK);
        blockWithitem(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        blockWithitem(ModBlocks.ALEXANDRITE_ORE);
        blockWithitem(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);

        blockWithitem(ModBlocks.MAGIC_BLOCK);
    }

    private void blockWithitem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
