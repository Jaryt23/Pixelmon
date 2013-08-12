package pixelmon.battles.attacks.specialAttacks.statusAppliers;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.status.StatusType;
import pixelmon.battles.status.TrickRoom;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ApplyTrickRoom extends StatusApplierBase {

	@Override
	public void ApplyEffect(Attack attack, double crit, EntityPixelmon user, EntityPixelmon target, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		for (int i = 0; i < user.battleController.battleStatusList.size(); i++) {
			if (user.battleController.battleStatusList.get(i).type == StatusType.TrickRoom) {
				user.battleController.battleStatusList.remove(i);
				ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), "The room returns to normal....  Or is it!!!???");
				return;
			}
		}
		user.battleController.battleStatusList.add(new TrickRoom());
	}
}
