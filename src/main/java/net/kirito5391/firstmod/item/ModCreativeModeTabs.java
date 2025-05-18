package net.kirito5391.firstmod.item;

import net.kirito5391.firstmod.FirstMod;
import net.kirito5391.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.kiritosfirstmod.alexandrite_items"))
                    .displayItems((pParameters, Output) -> {
                        Output.accept(ModItems.ALEXANDRITE.get());
                        Output.accept(ModItems.RAW_ALEXANDRITE.get());

                        Output.accept(ModItems.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.kiritosfirstmod.alexandrite_blocks"))
                    .displayItems((pParameters, Output) -> {
                       Output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                       Output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        Output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        Output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
