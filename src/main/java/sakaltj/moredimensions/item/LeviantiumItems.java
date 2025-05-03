package sakaltj.moredimensions.item;

import sakaltj.moredimensions.MoreDimensionsMod;
import sakaltj.moredimensions.registry.LeviantiumRegiPack;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LeviantiumItems {
    public static final Item FLOATING_DUST = new Item(new Item.Settings());
    public static final Item LEVIAN_STONE_ITEM = new BlockItem(LeviantiumRegiPack.LEVIAN_STONE, new Item.Settings());
    public static final Item LEVIAN_GRASS_ITEM = new BlockItem(LeviantiumRegiPack.LEVIAN_GRASS, new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MoreDimensionsMod.MOD_ID, "floating_dust"), FLOATING_DUST);
        Registry.register(Registry.ITEM, new Identifier(MoreDimensionsMod.MOD_ID, "levian_stone"), LEVIAN_STONE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MoreDimensionsMod.MOD_ID, "levian_grass"), LEVIAN_GRASS_ITEM);
    }
}
