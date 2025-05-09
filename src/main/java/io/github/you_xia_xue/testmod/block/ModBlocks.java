package io.github.you_xia_xue.testmod.block;

import io.github.you_xia_xue.testmod.item.Moditems;
import io.github.you_xia_xue.testmod.testMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, testMod.MOD_ID);
    //具体注册方块的方法
    public static final RegistryObject<Block> Feng_Xiao_jin_Block = registerBlock("feng_xiao_jin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)/*这里是复制属性，可以覆盖其中不同的*/.sound(SoundType.AMETHYST)));

    //以下是辅助注册方块用，具体没看懂
    private static  <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return  toReturn;
    }
    //注册方块相关联的物品方法
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block) {
        return Moditems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void  register(IEventBus eventBus){
        BLOCKS.register((eventBus));
    }
}
