package net.elemental.gasweed.block;

import net.elemental.gasweed.GasWeed;
import net.elemental.gasweed.item.ModCreativeModeTab;
import net.elemental.gasweed.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = // Registers new Block(s) in game
            DeferredRegister.create(ForgeRegistries.BLOCKS, GasWeed.MOD_ID);

    public static final RegistryObject<Block> CHEESE = registerBlock("cheese_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE)), ModCreativeModeTab.MOD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        // Generic(s) - Method returns type method of T, item extension from Block
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                              CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }





    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


}
