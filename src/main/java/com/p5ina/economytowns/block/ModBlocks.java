package com.p5ina.economytowns.block;

import com.p5ina.economytowns.EconomyAndTownsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block COIN_STACK = registerBlock(
            "coin_stack",
            new CoinStack(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .breakByTool(FabricToolTags.PICKAXES)),
            new FabricItemSettings()
                    .group(ItemGroup.BUILDING_BLOCKS));

    private static Block registerBlock(String name, Block block, FabricItemSettings blockItemSettings) {
        registerBlockItem(name, block, blockItemSettings);
        return Registry.register(Registry.BLOCK, new Identifier(EconomyAndTownsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, FabricItemSettings blockItemSettings) {
        return Registry.register(Registry.ITEM, new Identifier(EconomyAndTownsMod.MOD_ID, name),
                new BlockItem(block, blockItemSettings));
    }

    public static void registerModBlocks() {
        EconomyAndTownsMod.LOGGER.info("Registering Mod Blocks for " + EconomyAndTownsMod.MOD_ID);
    }
}
