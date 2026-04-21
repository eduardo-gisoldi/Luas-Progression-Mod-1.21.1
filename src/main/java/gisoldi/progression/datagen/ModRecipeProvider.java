package gisoldi.progression.datagen;

import gisoldi.progression.Luasprogression;
import gisoldi.progression.block.ModBlocks;
import gisoldi.progression.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> IRON_NUGGET_SMELTABLES = List.of(ModItems.PEBBLE, Blocks.IRON_ORE);
        List<ItemConvertible> IRON_SMELTABLES = List.of(Blocks.DEEPSLATE_IRON_ORE);

        //Reversible 9x Recipes
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEBBLE,
                RecipeCategory.BUILDING_BLOCKS, Blocks.COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);

        //Smelting Iron Recipes
        offerSmelting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,
                0.15f, 150, "iron");
        offerBlasting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,
                0.15f, 50, "iron");
        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.25f, 250, "iron");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.25f, 120, "iron");

        //Shaped Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.IRON_AXE)
                .pattern(" SS")
                .pattern(" IS")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.STICK)
                .criterion("has_steel_ingot", conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "iron_axe_from_steel_ingot"));

        //Shapeless Recipes
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_AXE)
                .input(ModItems.PEBBLE)
                .input(Items.STICK, 2)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_PICKAXE)
                .input(ModItems.PEBBLE, 2)
                .input(Items.STICK)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_SHOVEL)
                .input(ModItems.PEBBLE)
                .input(Items.STICK)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
}
