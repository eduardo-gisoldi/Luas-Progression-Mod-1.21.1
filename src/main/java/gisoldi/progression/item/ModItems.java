package gisoldi.progression.item;

import gisoldi.progression.Luasprogression;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    //Early game new items
    public static final Item PEBBLE = registerItem("pebble", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.pebble.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WOODEN_HATCHET = registerItem("wooden_hatchet", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.wooden_hatchet.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WOODEN_PICK = registerItem("wooden_pick", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.wooden_pick.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WOODEN_TROWEL = registerItem("wooden_trowel", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.wooden_trowel.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.raw_copper_nugget.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_nugget.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_pickaxe.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_AXE = registerItem("copper_axe", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_axe.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_shovel.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_HOE = registerItem("copper_hoe", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_hoe.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_sword.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_helmet.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_chestplate.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_leggings.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.copper_boots.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.raw_iron_nugget.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.raw_gold_nugget.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    //Mid game new items
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.steel_ingot.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.rose_gold_ingot.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    //Late game new items
    public static final Item WITHERING_DUST = registerItem("withering_dust", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.luasprogression.withering_dust.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });


    //Helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Luasprogression.MOD_ID, name), item);
    }

    //Registering all new items
    public static void registerItems() {
        Luasprogression.LOGGER.info("Registering Items for " + Luasprogression.MOD_ID);

        //New Ingredients
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PEBBLE);
            entries.add(RAW_COPPER_NUGGET);
            entries.add(COPPER_NUGGET);
            entries.add(RAW_IRON_NUGGET);
            entries.add(RAW_GOLD_NUGGET);
            entries.add(STEEL_INGOT);
            entries.add(ROSE_GOLD_INGOT);
            entries.add(WITHERING_DUST);
        });

        //New Tools
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(WOODEN_HATCHET);
            entries.add(WOODEN_PICK);
            entries.add(WOODEN_TROWEL);
            entries.add(COPPER_PICKAXE);
            entries.add(COPPER_AXE);
            entries.add(COPPER_SHOVEL);
            entries.add(COPPER_HOE);
            entries.add(COPPER_SWORD);
            entries.add(COPPER_HELMET);
            entries.add(COPPER_CHESTPLATE);
            entries.add(COPPER_LEGGINGS);
            entries.add(COPPER_BOOTS);
        });
    }
}