package net.elemental.gasweed.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("MoItems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BONG.get());
        }
    };
}

