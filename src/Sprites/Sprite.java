package Sprites;

import java.util.ArrayList;

import javafx.animation.Animation;

public class Sprite {
	static ArrayList<SpriteInfo> spr;

	public static void initSprites(){
		spr = new ArrayList<SpriteInfo>();
		spr.add(new SpriteInfo(
				"orc","images/Orc.png",
				new SpriteCoords(7, 7, -12, 130, 110, 100,Animation.INDEFINITE),
				new SpriteCoords(7, 7, 0, 330, 110, 100,Animation.INDEFINITE),
				new SpriteCoords(7,7,0,1050,113,100,1)
				));
		spr.add(new SpriteInfo(
				"centaur","images/Centaur.png",
				new SpriteCoords(7, 7, -12, 130, 110, 100,Animation.INDEFINITE),
				new SpriteCoords(6, 6, 20, 450, 180, 170,Animation.INDEFINITE),
				new SpriteCoords(6, 6, 0,1450,185,150,1)
				));
	}
	
	public static SpriteInfo getSprite(String name){
		System.out.println("Looking for - " + name);
		for (SpriteInfo s : spr){
			System.out.println(s.name);
			if (s.name.equals(name)){
				System.out.println(s.path);
				return s;
			}
		}
		return null;
	}
}
