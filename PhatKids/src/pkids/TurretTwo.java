package pkids;

import jgame.ImageCache;

public class TurretTwo extends Turret {

	public TurretTwo() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt2.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
