package de.flo.magica2.core.init.custom.item;

import de.flo.magica2.ManaSystem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LevitationWandItem extends Item {

    public LevitationWandItem(Properties pProperties) {
        super(pProperties);

    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide){
            pPlayer.sendSystemMessage(Component.literal("Clicked"));
            if (ManaSystem.Mana >= 2)
            {
                pPlayer.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 2));
                ManaSystem.removeMana(2);
            } else {
                pPlayer.sendSystemMessage(Component.literal("Not enough Mana"));
            }
            pPlayer.sendSystemMessage(Component.literal("Current Mana: " + ManaSystem.Mana));
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.magica2.levitation_wand.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}
