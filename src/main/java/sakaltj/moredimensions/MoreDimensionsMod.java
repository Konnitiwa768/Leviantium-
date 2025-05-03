package sakaltj.moredimensions;

import sakaltj.moredimensions.item.LeviantiumItems;
import sakaltj.moredimensions.biome.LeviantiumBiome;
import sakaltj.moredimensions.dimensions.LeviantiumDimension;
import sakaltj.moredimensions.registry.LeviantiumRegiPack;

import net.fabricmc.api.ModInitializer;

public class MoreDimensionsMod implements ModInitializer {
    public static final String MOD_ID = "moredimensions";

    @Override
    public void onInitialize() {
        LeviantiumItems.register();
        LeviantiumBiome.register();
        LeviantiumDimension.register();
        LeviantiumRegiPack.registerBlocks();
    }
}
