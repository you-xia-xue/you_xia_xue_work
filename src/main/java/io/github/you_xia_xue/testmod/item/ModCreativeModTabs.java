package io.github.you_xia_xue.testmod.item;

import io.github.you_xia_xue.testmod.testMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, testMod.MOD_ID);
//这是一个创造模式标签
    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.Excalibur.get()))
                    .title(Component.translatable("creativetab.test_tab"))//给标签加一个翻译键
                    .displayItems((pParameters,pOutput) -> {//教程在前面加了个p，应该是避免混淆
                        pOutput.accept(Moditems.Excalibur.get());
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
