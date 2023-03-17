package net.elemental.gasweed.item;

import net.elemental.gasweed.GasWeed;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registers New Item
    public static final DeferredRegister<Item> ITEMS = // Registers Item in game "GasWeed" is ModID
            DeferredRegister.create(ForgeRegistries.ITEMS, GasWeed.MOD_ID);

    public static final RegistryObject<Item> GASWEED = ITEMS.register("gasweed",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).food(
                    new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(
                            MobEffects.POISON, 200, 0), 0.5F).build())));


    // "new Item.Properties().tab(CreativeModeTab.TAB_MISC))" Registers Item Properties
    // .tab() builder pattern(s) takes args for any properties on the item
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));

    // .food and mob effects need to be BEFORE .build :)

    public static final RegistryObject<Item> BONG = ITEMS.register("bong",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
