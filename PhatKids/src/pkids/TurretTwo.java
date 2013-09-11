package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretTwo extends Turret {

	public TurretTwo() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt2.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		
		return new BulletTwo();
	}

	@Override
	public Image getBulletImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBulletDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
