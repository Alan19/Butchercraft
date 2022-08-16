package com.lance5057.butchercraft;

import com.lance5057.butchercraft.workstations.blockentities.MeatHookBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ButchercraftBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, Butchercraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<MeatHookBlockEntity>> MEAT_HOOK = BLOCK_ENTITIES.register(
            "meat_hook",
            () -> BlockEntityType.Builder.of(MeatHookBlockEntity::new).build(null));

    public static void register(IEventBus modBus) {
        BLOCK_ENTITIES.register(modBus);
    }


}
