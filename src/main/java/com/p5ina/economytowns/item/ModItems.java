package com.p5ina.economytowns.item;

import com.p5ina.economytowns.EconomyAndTownsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COIN = registerItem("coin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EconomyAndTownsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EconomyAndTownsMod.LOGGER.info("Registering Mod Items for " + EconomyAndTownsMod.MOD_ID);
    }
}
