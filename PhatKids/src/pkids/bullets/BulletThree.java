package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;
import jgame.controller.ConstantRotationController;

public class BulletThree extends Bullet {

	public BulletThree() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b3.png"), 3);
		addController(new ConstantRotationController(5));
	}
	

}
