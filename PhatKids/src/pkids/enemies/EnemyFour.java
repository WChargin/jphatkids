package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyFour extends Enemy {
public EnemyFour() {
	// TODO Auto-generated constructor stub
	super(ImageCache.forClass(PhatKids.class).get("enemies/enemy4.png"), 35);
}
	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 6;
	}

}
