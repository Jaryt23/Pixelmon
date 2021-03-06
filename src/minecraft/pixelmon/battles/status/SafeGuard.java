package pixelmon.battles.status;

import java.util.ArrayList;

import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class SafeGuard extends StatusBase {

	int effectTurns = 5;

	public SafeGuard() {
		super(StatusType.SafeGuard, false, false, true);
	}

	@Override
	public boolean stopsStatusChange() {
		return true;
	}

	@Override
	public void turnTick(EntityPixelmon user, EntityPixelmon target) throws Exception {
		if (effectTurns == 0) {
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), user.getNickname() + "'s Safeguard wears off!");
			user.status.remove(this);
		}
		effectTurns--;
	}
}
