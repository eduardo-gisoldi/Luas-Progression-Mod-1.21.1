package gisoldi.progression.block;

import gisoldi.progression.Luasprogression;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

/**
 * This class handles the registration of custom blocks for the Luas Progression mod.
 * It registers blocks and their corresponding block items, and adds them to item groups.
 */
public class ModBlocks {
    // Registers the Steel Block with metal properties: high strength, requires tool to break, and metal sounds
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().
                    sounds(BlockSoundGroup.METAL)));

    /**
     * Registers a block with the given name and block instance.
     * Also registers the corresponding BlockItem automatically.
     * @param name The registry name for the block
     * @param block The block instance to register
     * @return The registered block
     */
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Luasprogression.MOD_ID, name), block);
    }

    /**
     * Registers a BlockItem for the given block, allowing it to be held in inventories.
     * @param name The registry name for the block item
     * @param block The block to create the item for
     */
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Luasprogression.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    /**
     * Registers all blocks and performs additional setup, such as adding blocks to item groups.
     * Currently adds the Steel Block to the Building Blocks item group.
     */
    public static void registerBlocks() {
        Luasprogression.LOGGER.info("Registering Blocks for " + Luasprogression.MOD_ID);

        // Adds the Steel Block to the Building Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.STEEL_BLOCK);
        });
    }
}
