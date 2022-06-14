package extended_weapon.scripts;

import extended_weapon.items.extandable.AbstractRocketEntity;
import extended_weapon.items.extandable.SimpleRocketEntity;
import extended_weapon.items.unextendable.RPG;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class StartupCommon {
    public static RPG rpg;
    public static EntityType<SimpleRocketEntity> simpleRocketEntityType;

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        ItemRegistration(rpg, "RPG", itemRegisterEvent);
//        ItemRegistration()
    }

    @SubscribeEvent
    public static void onEntityTypeRegistration(RegistryEvent.Register<EntityType<?>> entityTypeRegisterEvent) {
//        simpleRocketEntityType = EntityType.Builder<SimpleRocketEntity>of<SimpleRocketEntity::new, MobCategory.MISC);
    }

    private static void ItemRegistration(Item item, String S, final RegistryEvent.Register<Item> itemRegisterEvent){
        item = new RPG();
        item.setRegistryName(S);
        itemRegisterEvent.getRegistry().register(item);
    }
}
