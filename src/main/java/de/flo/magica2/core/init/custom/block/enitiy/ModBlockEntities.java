package de.flo.magica2.core.init.custom.block.enitiy;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.Blockinit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Magica2.MODID);

    public static final RegistryObject<BlockEntityType<EnhancerBlockEntity>> ENHANCER_BE =
            BLOCK_ENTITIES.register("enhancer_be", () -> BlockEntityType.Builder.of(EnhancerBlockEntity::new,
                    Blockinit.ENHANCER.get()).build(null));

    public static final RegistryObject<BlockEntityType<MagicalInfuserBlockEntity>> MAGICAL_INFUSER_BE =
            BLOCK_ENTITIES.register("magical_infuser_be", () -> BlockEntityType.Builder.of(MagicalInfuserBlockEntity::new,
                    Blockinit.MAGICAL_INFUSER.get()).build(null));



    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
