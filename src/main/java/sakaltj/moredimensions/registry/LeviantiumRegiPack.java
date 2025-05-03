package sakaltj.moredimensions.registry;

import sakaltj.moredimensions.MoreDimensionsMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LeviantiumRegiPack {
    public static final Block LEVIAN_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f));
    public static final Block LEVIAN_GRASS = new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MoreDimensionsMod.MOD_ID, "levian_stone"), LEVIAN_STONE);
        Registry.register(Registry.BLOCK, new Identifier(MoreDimensionsMod.MOD_ID, "levian_grass"), LEVIAN_GRASS);
    }
}
