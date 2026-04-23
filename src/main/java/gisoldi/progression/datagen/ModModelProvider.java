package gisoldi.progression.datagen;

import gisoldi.progression.block.ModBlocks;
import gisoldi.progression.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEBBLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_HATCHET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_PICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_TROWEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IRON_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GOLD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERING_DUST, Models.GENERATED);
    }
}