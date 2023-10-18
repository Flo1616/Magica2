package de.flo.magica2.core.event;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Magica2.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvent {

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event){
            if(KeyBinding.ACTIVATE_SLOW_GRAV.consumeClick())
            {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Pressed O"));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = Magica2.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvent{

        @SubscribeEvent
        public static void OnKeyRegister(RegisterKeyMappingsEvent event){
            event.register(KeyBinding.ACTIVATE_SLOW_GRAV);
        }
    }
}
