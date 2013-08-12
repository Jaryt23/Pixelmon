package pixelmon.AI;

import java.util.Comparator;

import net.minecraft.entity.Entity;

public class TargetSorter implements Comparator {
	private Entity theEntity;

	final AITargetNearest parent;

	public TargetSorter(AITargetNearest par1EntityAINearestAttackableTarget, Entity par2Entity) {
		this.parent = par1EntityAINearestAttackableTarget;
		this.theEntity = par2Entity;
	}

	public int func_48469_a(Entity par1Entity, Entity par2Entity) {
		double var3 = this.theEntity.getDistanceSqToEntity(par1Entity);
		double var5 = this.theEntity.getDistanceSqToEntity(par2Entity);
		return var3 < var5 ? -1 : (var3 > var5 ? 1 : 0);
	}

	public int compare(Object par1Obj, Object par2Obj) {
		return this.func_48469_a((Entity) par1Obj, (Entity) par2Obj);
	}
}
