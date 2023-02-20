package net.elemental.gasweed.item;

import net.elemental.gasweed.GasWeed;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registers New Item
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GasWeed.MOD_ID);

    public static final RegistryObject<Item> GASWEED = ITEMS.register("gasweed",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    // "new Item.Properties().tab(CreativeModeTab.TAB_MISC))" Registers Item Properties
    // .tab() builder pattern(s) takes args for any properties on the item


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
