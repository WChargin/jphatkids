package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretTwo extends Turret {

	public TurretTwo() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt2.png"));
	}

}
