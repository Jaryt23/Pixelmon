package pixelmon.battles.attacks.specialAttacks.statusAppliers;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.status.Leech;
import pixelmon.battles.status.StatusBase;
import pixelmon.battles.status.StatusType;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ApplyLeech extends StatusApplierBase {
	@Override
	public void ApplyEffect(Attack attack, double crit, EntityPixelmon user, EntityPixelmon target, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		if (checkChance()) {
			for (StatusBase e : target.status)
				if (e.type == StatusType.Leech) {
					ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), target.getNickname() + " is already seeded!");
					return;
				}
			target.status.add(new Leech());
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), user.getNickname() + " has planted a seed!");
		} else
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), user.getNickname() + " failed!");
	}
}
