package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;
import jgame.controller.ConstantRotationController;

public class BulletTwo extends Bullet {

	public BulletTwo() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b2.png"), 2);
		addController(new ConstantRotationController(3));
	}
	

}
