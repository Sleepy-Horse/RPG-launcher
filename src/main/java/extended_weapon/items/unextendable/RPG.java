package extended_weapon.items.unextendable;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

public class RPG extends ProjectileWeaponItem {
    public RPG() {
        super(new Item.Properties().durability(3072).tab(CreativeModeTab.TAB_COMBAT).stacksTo(1));
    }

    @Override
    public void releaseUsing(ItemStack itemStack, Level world_type, LivingEntity livingEntity, int p_40670_) {
        if (livingEntity instanceof Player player){
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 3));

        }
    }

    @Override
    public @NotNull Predicate<ItemStack> getAllSupportedProjectiles() {
        return null;
    }

    @Override
    public int getDefaultProjectileRange() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }
}
