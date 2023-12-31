package de.flo.magica2.core.init;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.custom.item.*;
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



    public static final RegistryObject<Item> GRAVITUM_HELMET = ITEMS.register("gravitum_helmet",
            ()-> new ArmorItem(ModArmorMaterials.GRAVITUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GRAVITUM_CHESTPLATE = ITEMS.register("gravitum_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.GRAVITUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GRAVITUM_LEGGINGS = ITEMS.register("gravitum_leggings",
            ()-> new ArmorItem(ModArmorMaterials.GRAVITUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GRAVITUM_BOOTS = ITEMS.register("gravitum_boots",
            ()-> new ModArmorItem(ModArmorMaterials.GRAVITUM, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static final RegistryObject<Item> MANA_BOTTLE = ITEMS.register("mana_bottle",
            ()-> new ManaBottleItem(new Item.Properties()
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> LEVITATION_WAND = ITEMS.register("levitation_wand",
            ()-> new LevitationWandItem(new Item.Properties()
                    .stacksTo(1)
            ));




    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
