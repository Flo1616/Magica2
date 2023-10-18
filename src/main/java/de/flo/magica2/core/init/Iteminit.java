package de.flo.magica2.core.init;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.custom.item.ModArmorMaterials;
import de.flo.magica2.core.init.custom.item.ModToolTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Magica2.MODID);

    public static final RegistryObject<Item> MAGICAL_SHARD = ITEMS.register("magical_shard",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGICAL_GEM = ITEMS.register("magical_gem",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAV_APPLE = ITEMS.register("grav_apple",
            ()-> new Item(new Item.Properties().food(Foodinit.GRAV_APPLE)));

    public static final RegistryObject<Item> Magical_Pickaxe = ITEMS.register("magical_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.Magical, 2,3,
                    new Item.Properties()));


    public static final RegistryObject<Item> SWORD_TEST = ITEMS.register("sword_test",
            ()-> new SwordItem(ModToolTiers.Magical, 2,3,
                    new Item.Properties()));




    public static final RegistryObject<Item> GRAVITUM_INGOT = ITEMS.register("gravitum_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GRAVITUM = ITEMS.register("raw_gravitum",
            ()-> new Item(new Item.Properties()));

/*
    public static final RegistryObject<Item> GRAVITUM_BOOTS = ITEMS.register("gravitum_boots",
            ()-> new ArmorItem(ModArmorMaterials.GRAVITUM, ArmorItem.Type.BOOTS, new Item.Properties()));
*/


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
