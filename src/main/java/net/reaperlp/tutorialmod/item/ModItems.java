package net.reaperlp.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reaperlp.tutorialmod.TutorialMod;

public class ModItems
{
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = Items.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_BLACK_OPAL = Items.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}

