package extended_weapon.items.extandable;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;
public abstract class AbstractRocketEntity extends AbstractArrow {
    protected AbstractRocketEntity(EntityType<? extends AbstractArrow> p_36721_, Level p_36722_) {
        super(p_36721_, p_36722_);
        this.setNoGravity(true);
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }

    @Override
    protected void onHitBlock(@NotNull BlockHitResult p_36755_) {
        this.explosiveFunc();
        this.discard();
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult p_36757_) {
        this.explosiveFunc();
        this.discard();
    }

    protected void explosiveFunc(){}
}
