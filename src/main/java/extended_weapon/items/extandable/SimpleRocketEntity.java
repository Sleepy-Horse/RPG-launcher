package extended_weapon.items.extandable; // just for more powered rocket like x5 or x10

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;

public class SimpleRocketEntity extends AbstractRocketEntity{
    private final Float explosivePower;
    public SimpleRocketEntity(EntityType<? extends AbstractArrow> p_36721_, Level p_36722_, Float explosivePower) {
        super(p_36721_, p_36722_);
        this.explosivePower = explosivePower;
    }


    @Override
    protected void explosiveFunc(){
        AbstractExplosion explosion = new AbstractExplosion(this.explosivePower, this.level, this.getX(), this.getY(), this.getZ(), (LivingEntity) this.getOwner());
        explosion.explode();
    }
}
