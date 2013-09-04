package pkids;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {

	class IndexedTurretRecipe implements TurretRecipe {
	
		private final int index;
	
		public IndexedTurretRecipe(int index) {
			super();
			this.index = index;
		}
	
		@Override
		public Turret createTurret() {
			switch (index) {
			case 0:
				return new TurretOne();
			case 1:
				return new TurretTwo();
			default:
				return null;
			}
		}
	
	}

	public MenuArea() {
		// TODO Auto-generated constructor stub
		setSize(500, 100);
		this.setBackgroundColor(Color.RED);

		BufferedImage bg = ImageCache.forClass(PhatKids.class)
				.get("menubg.png");
		
		// set enemies
		
		
		
		
		
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		for (int i = 0; i < 5; i++) {
			setTile(i);
		}

	}

	private void setTile(int i) {
		// TODO Auto-generated method stub
		List<Image> images = ImageCache.forClass(PhatKids.class).getSequential("mi", 1, 5, ".png");
//		String[] menuIcons = {"miOne.png", "miTwo.png", "miThree.png", "miFour.png", "miFive.png"};
		Tile tile = new Tile(new IndexedTurretRecipe(i), images.get(i), images.get(4-i));
		tile.setAnchorTopLeft();
		tile.setLocation(i * 98 + 7, 5);
		add(tile);


	}

}
