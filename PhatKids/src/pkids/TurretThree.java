package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretThree extends Turret {

	public TurretThree() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt3.png"));
	}

}
