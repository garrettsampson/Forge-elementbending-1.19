package net.garrettsampson.elementbending.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Element_Bending = new CreativeModeTab("Element_Bending") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.pure_nature.get());
        }
    };
}
