package de.flo.magica2.core.recipe;

import de.flo.magica2.Magica2;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Magica2.MODID);

    public static final RegistryObject<RecipeSerializer<EnhancerRecipe>> ENHANCER_SERIALIZER =
            SERIALIZERS.register("enhancing", () -> EnhancerRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
