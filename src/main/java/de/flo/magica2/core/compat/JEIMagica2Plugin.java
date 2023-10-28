package de.flo.magica2.core.compat;

import de.flo.magica2.Magica2;
import de.flo.magica2.core.recipe.MagicalInfuserRecipe;
import de.flo.magica2.core.screen.MagicalInfuserScreen;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIMagica2Plugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Magica2.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MagicalInfuserCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<MagicalInfuserRecipe> magicalInfuserRecipes = recipeManager.getAllRecipesFor(MagicalInfuserRecipe.Type.INSTANCE);
        registration.addRecipes(MagicalInfuserCategory.MAGICAL_INFUSER_TYPE, magicalInfuserRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MagicalInfuserScreen.class,
                79, 28, 20, 30, MagicalInfuserCategory.MAGICAL_INFUSER_TYPE);
    }
}
