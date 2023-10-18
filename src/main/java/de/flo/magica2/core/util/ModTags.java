package de.flo.magica2.core.util;

import de.flo.magica2.Magica2;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> MAGICAL_BLOCKS = tag("magical_blocks");
        public static final TagKey<Block> NEEDS_MAGICAL_TOOL = tag("needs_magical_tool");



        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(Magica2.MODID, name));
        }
    }
    public static class Items{



        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(Magica2.MODID, name));
        }

    }
}
