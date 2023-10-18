package de.flo.magica2.core.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.registries.RegistryObject;

public class Foodinit {
    public static final FoodProperties GRAV_APPLE = new FoodProperties.Builder().nutrition(5).saturationMod(0.5f)
            .effect(()-> new MobEffectInstance(MobEffects.LEVITATION,100, 3),0.9f).build();
}
