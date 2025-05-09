package io.github.you_xia_xue.testmod.item;

import io.github.you_xia_xue.testmod.testMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, testMod.MOD_ID);
    //这是一个注册物品的方法（名字要不一样）
    public static final RegistryObject<Item> Excalibur = ITEMS.register("excalibur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Feng_Xiao_Jin_Item = ITEMS.register("feng_xiao_jin_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
