package de.flo.magica2.core.init.custom.item;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.Iteminit;
import de.flo.magica2.core.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Magical = TierSortingRegistry.registerTier(
            new ForgeTier(4,1500,5f,4, 25,
                    ModTags.Blocks.NEEDS_MAGICAL_TOOL, () -> Ingredient.of(Iteminit.MAGICAL_SHARD.get())),
            new ResourceLocation(Magica2.MODID, "magical_shard"), List.of(Tiers.DIAMOND), List.of());
}
