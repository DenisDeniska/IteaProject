package Sprites;

public class SpriteInfo {
	public String name;
	public String path;
	public SpriteCoords walk;
	public SpriteCoords attack;
	public SpriteCoords death;

	SpriteInfo(String name, String path, SpriteCoords walk, SpriteCoords attack, SpriteCoords death){
		this.name = name;
		this.path = path;
		this.walk = walk;
		this.attack = attack;
		this.death = death;
	}
}
