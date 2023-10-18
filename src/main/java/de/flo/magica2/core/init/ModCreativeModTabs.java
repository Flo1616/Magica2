package de.flo.magica2.core.init;

import de.flo.magica2.Magica2;
import net.minecraft.client.gui.Gui;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Magica2.MODID);
    public static final RegistryObject<CreativeModeTab> Magic_TAB = CREATIVE_MODE_TABS.register("magic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Iteminit.MAGICAL_SHARD.get()))
                    .title(Component.translatable("itemGroup.magic_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Iteminit.MAGICAL_SHARD.get());
                        pOutput.accept(Iteminit.MAGICAL_GEM.get());
                        pOutput.accept(Blockinit.MAGICAL_BLOCK.get());
                        pOutput.accept(Blockinit.MAGICAL_ORE.get());
                        pOutput.accept(Blockinit.DEEPSLATE_MAGICAL_ORE.get());
                        pOutput.accept(Iteminit.GRAV_APPLE.get());
                        pOutput.accept(Iteminit.Magical_Pickaxe.get());
                        pOutput.accept(Iteminit.GRAVITUM_INGOT.get());
                        pOutput.accept(Iteminit.RAW_GRAVITUM.get());
                        pOutput.accept(Iteminit.SWORD_TEST.get());
                        //pOutput.accept(Iteminit.GRAVITUM_BOOTS.get());
                        pOutput.accept(Blockinit.GRAVITUM_ORE.get());
                        pOutput.accept(Blockinit.DEEPSLATE_GRAVITUM_ORE.get());
                        pOutput.accept(Blockinit.GRAVITUM_BLOCK.get());
                        pOutput.accept(Blockinit.ENHANCER.get());
                        pOutput.accept(Blockinit.TEST_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}