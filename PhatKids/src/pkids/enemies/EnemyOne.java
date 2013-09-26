package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyOne extends Enemy {

	public EnemyOne() {
		
		//ImageCache.forClass(PhatKids.class   This code gets the cache for a particular class; the cache is an instance of ImageCache
		super(ImageCache.forClass(PhatKids.class).get("enemies/enemy1.png"),15);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 4.5;
	}

}
