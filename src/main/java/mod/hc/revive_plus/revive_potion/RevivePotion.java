package mod.hc.revive_plus.revive_potion;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class RevivePotion implements ModInitializer {
    public static final Item POTION_OF_REVIVE = new Item(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("hc_revive_plus", "potion_of_revive"), POTION_OF_REVIVE);
    }
}
