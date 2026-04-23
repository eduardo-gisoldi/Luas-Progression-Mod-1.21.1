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
        //Smeltables
        List<ItemConvertible> COPPER_NUGGET_SMELTABLES = List.of(ModItems.RAW_COPPER_NUGGET,
                Blocks.COPPER_ORE, ModItems.COPPER_PICKAXE, ModItems.COPPER_AXE,
                ModItems.COPPER_SHOVEL, ModItems.COPPER_HOE, ModItems.COPPER_SWORD,
                ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS
        );
        List<ItemConvertible> IRON_NUGGET_SMELTABLES = List.of(ModItems.RAW_IRON_NUGGET, Blocks.IRON_ORE);
        List<ItemConvertible> GOLD_NUGGET_SMELTABLES = List.of(ModItems.RAW_GOLD_NUGGET, Blocks.GOLD_ORE);

        List<ItemConvertible> IRON_SMELTABLES = List.of(Blocks.DEEPSLATE_IRON_ORE);

        //Smelting Recipes
        offerSmelting(exporter, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET,
                0.10f, 90, "copper");
        offerBlasting(exporter, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET,
                0.20f, 40, "copper");
        offerSmelting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,
                0.15f, 150, "iron");
        offerBlasting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET,
                0.25f, 50, "iron");
        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.25f, 250, "iron");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.35f, 120, "iron");
        offerSmelting(exporter, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET,
                0.25f, 150, "gold");
        offerBlasting(exporter, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET,
                0.35f, 50, "gold");

        //Reversible 9xItem Recipes
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEBBLE,
                RecipeCategory.BUILDING_BLOCKS, Blocks.COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_COPPER_NUGGET,
                RecipeCategory.BUILDING_BLOCKS, Items.RAW_COPPER);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET,
                RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_IRON_NUGGET,
                RecipeCategory.BUILDING_BLOCKS, Items.RAW_IRON);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_GOLD_NUGGET,
                RecipeCategory.BUILDING_BLOCKS, Items.RAW_GOLD);

        //Shaped Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PICKAXE)
                .pattern("CCC")
                .pattern(" I ")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_AXE)
                .pattern(" CC")
                .pattern(" IC")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SHOVEL)
                .pattern(" C ")
                .pattern(" I ")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HOE)
                .pattern(" CC")
                .pattern(" I ")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_hoe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" I ")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.STICK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .input('C', Items.COPPER_INGOT)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .pattern("   ")
                .input('C', Items.COPPER_INGOT)
                .criterion("has_copper_ingot", conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "copper_boots"));




        //Shapeless Recipes
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_HATCHET)
                .input(ModItems.PEBBLE)
                .input(Items.STICK, 2)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_PICK)
                .input(ModItems.PEBBLE, 2)
                .input(Items.STICK)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_TROWEL)
                .input(ModItems.PEBBLE)
                .input(Items.STICK)
                .criterion("has_pebble", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT, 2)
                .input(Items.IRON_INGOT, 4)
                .input(Items.COAL, 4)
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_coal", conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "steel_ingot_from_iron_ingot_and_coal"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 2)
                .input(Items.GOLD_INGOT, 4)
                .input(Items.QUARTZ, 4)
                .criterion("has_gold_ingot", conditionsFromItem(Items.GOLD_INGOT))
                .criterion("has_quartz", conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "rose_gold_ingot_from_gold_ingot_and_quartz"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERING_DUST)
                .input(Items.WITHER_ROSE)
                .criterion("has_wither_rose", conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_INGOT)
                .input(ModItems.WITHERING_DUST)
                .input(Items.NETHERITE_SCRAP, 4)
                .input(ModItems.STEEL_INGOT, 4)
                .criterion("has_gold_ingot", conditionsFromItem(ModItems.PEBBLE))
                .criterion("has_quartz", conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(Luasprogression.MOD_ID, "netherite_ingot_from_withering_dust"));

    }
}