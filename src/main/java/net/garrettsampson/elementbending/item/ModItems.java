package net.garrettsampson.elementbending.item;

import net.garrettsampson.elementbending.elementbending;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, elementbending.MOD_ID);
    public static final RegistryObject<Item> pure_nature  = ITEMS.register("pure_nature",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Element_Bending)));
    public static final RegistryObject<Item> nature  = ITEMS.register("nature",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Element_Bending)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
