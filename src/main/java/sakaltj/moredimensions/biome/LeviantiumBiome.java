package sakaltj.moredimensions.biome;

import sakaltj.moredimensions.MoreDimensionsMod;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.BiomeBuilder;
import net.minecraft.world.biome.Biome.Category;

public class LeviantiumBiome {
    public static final Biome LEVIANTIUM_BIOME = createLeviantiumBiome();

    private static Biome createLeviantiumBiome() {
        return new BiomeBuilder()
            .precipitation(Biome.Precipitation.NONE)
            .temperature(0.6f)
            .downfall(0.0f)
            .effects(new BiomeEffects.Builder()
                .skyColor(0x8855cc)
                .fogColor(0x444466)
                .grassColor(0xaaffee)
                .waterColor(0x331144)
                .waterFogColor(0x220033)
                .build())
            .category(Category.NONE)
            .build();
    }

    public static void register() {
        Registry.register(Registry.BIOME, new Identifier(MoreDimensionsMod.MOD_ID, "leviantium_biome"), LEVIANTIUM_BIOME);
    }
}
