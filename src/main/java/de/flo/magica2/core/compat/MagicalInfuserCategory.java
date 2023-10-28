package de.flo.magica2.core.compat;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.init.Blockinit;
import de.flo.magica2.core.recipe.MagicalInfuserRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class MagicalInfuserCategory implements IRecipeCategory<MagicalInfuserRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(Magica2.MODID, "magical_infusing");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Magica2.MODID,
            "textures/gui/magical_infuser_gui.png");

    public static final RecipeType<MagicalInfuserRecipe> MAGICAL_INFUSER_TYPE =
            new RecipeType<>(UID, MagicalInfuserRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MagicalInfuserCategory(IGuiHelper helper){
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 83);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK,
                new ItemStack(Blockinit.MAGICAL_INFUSER.get()));
    }


    @Override
    public RecipeType<MagicalInfuserRecipe> getRecipeType() {
        return MAGICAL_INFUSER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.magica2.magical_infuser");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MagicalInfuserRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
