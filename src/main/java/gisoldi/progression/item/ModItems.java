package gisoldi.progression.item;

import gisoldi.progression.Luasprogression;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Defining new item
    public static final Item PEBBLE = registerItem("pebble", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    //Helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Luasprogression.MOD_ID, name), item);
    }

    //Registering all new items
    public static void registerItems() {
        Luasprogression.LOGGER.info("Registering Items for " + Luasprogression.MOD_ID);

        //Adding to the "ingredients" item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PEBBLE);
            entries.add(STEEL_INGOT);
        });


    }
}