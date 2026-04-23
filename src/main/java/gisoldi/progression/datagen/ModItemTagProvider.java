package gisoldi.progression.datagen;

import gisoldi.progression.item.ModItems;
import gisoldi.progression.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.PROGRESSIVE_ITEMS)
        .add(ModItems.PEBBLE)
        .add(Items.STICK)
        .add(ModItems.WOODEN_HATCHET)
        .add(ModItems.WOODEN_PICK)
        .add(ModItems.WOODEN_TROWEL)
        .add(ModItems.RAW_COPPER_NUGGET)
        .add(ModItems.COPPER_NUGGET)
        .add(Items.RAW_COPPER)
        .add(Items.COPPER_INGOT)
        .add(ModItems.RAW_IRON_NUGGET)
        .add(Items.RAW_IRON)
        .add(Items.IRON_INGOT)
        .add(Items.COAL)
        .add(ModItems.STEEL_INGOT)
        .add(ModItems.RAW_GOLD_NUGGET)
        .add(Items.RAW_GOLD)
        .add(Items.GOLD_INGOT)
        .add(Items.QUARTZ)
        .add(ModItems.ROSE_GOLD_INGOT)
        .add(Items.DIAMOND)
        .add(Items.WITHER_ROSE)
        .add(Items.NETHERITE_INGOT);
    }
}