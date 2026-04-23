package gisoldi.progression.item;

import gisoldi.progression.Luasprogression;
import gisoldi.progression.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class handles the registration of custom item groups (creative tabs) for the Luas Progression mod.
 * Item groups organize items and blocks in the creative inventory for better navigation.
 */
public class ModItemGroups {
    // Registers a custom item group called "Luas Progression Items" in the creative inventory
    public static final ItemGroup LUAS_PROGRESSION_ITEMS = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(Luasprogression.MOD_ID, "luas_progression_items"),
            FabricItemGroup.builder()
                    // Sets the icon for the item group tab using a Pebble item stack
                    .icon(() -> new ItemStack(ModItems.PEBBLE))
                    // Sets the display name for the item group, using a translatable text key
                    .displayName(Text.translatable("itemgroup.luasprogression.luas_progression_items"))
                    // Defines the entries (items and blocks) that appear in this item group
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PEBBLE);
                        entries.add(Items.STICK);
                        entries.add(ModItems.WOODEN_HATCHET);
                        entries.add(ModItems.WOODEN_PICK);
                        entries.add(ModItems.WOODEN_TROWEL);
                        entries.add(ModItems.RAW_COPPER_NUGGET);
                        entries.add(Items.RAW_COPPER);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(Items.COPPER_INGOT);
                        entries.add(ModItems.RAW_IRON_NUGGET);
                        entries.add(Items.RAW_IRON);
                        entries.add(Items.IRON_INGOT);
                        entries.add(Items.COAL);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.RAW_GOLD_NUGGET);
                        entries.add(Items.RAW_GOLD);
                        entries.add(Items.GOLD_INGOT);
                        entries.add(Items.QUARTZ);
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(Items.DIAMOND);
                        entries.add(Items.WITHER_ROSE);
                        entries.add(ModItems.WITHERING_DUST);
                        entries.add(Items.NETHERITE_INGOT);
                    })
            .build());

    /**
     * This method is called to register the item groups.
     * Currently, it only logs a message, but can be expanded for additional setup if needed.
     */
    public static void registerItemGroups() {
        Luasprogression.LOGGER.info("Registering Item Groups for " + Luasprogression.MOD_ID);
    }
}
