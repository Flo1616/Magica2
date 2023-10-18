package de.flo.magica2.core.init;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.custom.block.EnhancerBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Blockinit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Magica2.MODID);

    public static final RegistryObject<Block> MAGICAL_ORE = registerBlock("magical_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> DEEPSLATE_MAGICAL_ORE = registerBlock("deepslate_magical_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,10)));


    public static final RegistryObject<Block> MAGICAL_BLOCK = registerBlock("magical_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));





    public static final RegistryObject<Block> GRAVITUM_ORE = registerBlock("gravitum_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> DEEPSLATE_GRAVITUM_ORE = registerBlock("deepslate_gravitum_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,10)));

    public static final RegistryObject<Block> GRAVITUM_BLOCK = registerBlock("gravitum_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));



    public static final RegistryObject<Block> ENHANCER = registerBlock("enhancer",
            ()-> new EnhancerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));




    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return Iteminit.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);

    }
}
