package sakaltj.leviantium;

import net.fabricmc.api.ModInitializer;
import sakaltj.leviantium.registry.ModBlocks;
import sakaltj.leviantium.registry.ModItems;
import sakaltj.leviantium.registry.ModBiomes;
import sakaltj.leviantium.registry.ModDimensions;

public class LeviantiumMod implements ModInitializer {
    public static final String MOD_ID = "leviantium";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModBiomes.register();
        ModDimensions.register();
    }
}
