package thedarkcolour.futuremc.compat.jei.blastfurnace;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import thedarkcolour.futuremc.block.BlockFurnaceAdvanced;

public class BlastFurnaceRecipeWrapper implements IRecipeWrapper {
    private final ItemStack input;
    private final ItemStack output;

    public BlastFurnaceRecipeWrapper(BlockFurnaceAdvanced.Recipe recipe) {
        this.input = recipe.input;
        this.output = recipe.output;
    }

    @Override
    public void getIngredients(IIngredients ingredients) {
        ingredients.setInput(VanillaTypes.ITEM, input);
        ingredients.setOutput(VanillaTypes.ITEM, output);
    }
}