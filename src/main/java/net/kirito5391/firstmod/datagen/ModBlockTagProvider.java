package net.kirito5391.firstmod.datagen;

import net.kirito5391.firstmod.FirstMod;
import net.kirito5391.firstmod.block.ModBlocks;
import net.kirito5391.firstmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.MAGIC_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_STAIRS.get())
                .add(ModBlocks.ALEXANDRITE_SLAB.get())
                .add(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get())
                .add(ModBlocks.ALEXANDRITE_BUTTON.get())
                .add(ModBlocks.ALEXANDRITE_FENCE.get())
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE.get())
                .add(ModBlocks.ALEXANDRITE_WALL.get())
                .add(ModBlocks.ALEXANDRITE_DOOR.get())
                .add(ModBlocks.ALEXANDRITE_TRAPDOOR.get())
                .add(ModBlocks.ALEXANDRITE_LAMP.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

        tag(BlockTags.FENCES).add(ModBlocks.ALEXANDRITE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.ALEXANDRITE_WALL.get());

        tag(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ALEXANDRITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL);
    }
}
