package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt5.png"));
	}

}
