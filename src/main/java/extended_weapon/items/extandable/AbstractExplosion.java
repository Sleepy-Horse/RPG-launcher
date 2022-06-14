package extended_weapon.items.extandable;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class AbstractExplosion extends PrimedTnt {

    private final Float powerOfExplosion;

    public AbstractExplosion(EntityType<? extends PrimedTnt> p_32076_, Level p_32077_, Float powerOfExplosion) {
        super(p_32076_, p_32077_);
        this.powerOfExplosion = powerOfExplosion;
    }

    public AbstractExplosion(Float powerOfExplosion, Level p_32079_, double p_32080_, double p_32081_, double p_32082_, @Nullable LivingEntity p_32083_) {
        super(p_32079_, p_32080_, p_32081_, p_32082_, p_32083_);
        this.powerOfExplosion = powerOfExplosion;
    }


    @Override
    public void explode(){
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), this.powerOfExplosion, Explosion.BlockInteraction.BREAK);
    }
}
