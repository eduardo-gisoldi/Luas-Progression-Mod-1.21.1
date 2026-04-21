package gisoldi.progression.util;

import gisoldi.progression.Luasprogression;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {}

    public static class Items {
        public static final TagKey<Item> PROGRESSIVE_ITEMS = createTag("progressive_items");

        private static final TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Luasprogression.MOD_ID, name));
        }
    }
}
