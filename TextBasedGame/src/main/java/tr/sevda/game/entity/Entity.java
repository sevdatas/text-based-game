package tr.sevda.game.entity;

public abstract class Entity implements Moveble {

	public String name;
	public int health;
	public int position;

	public Entity(String name, int health, int position) {
		this.name = name;
		this.health = health;
		this.position = position;
	}

	public void move(int step) {
		position += step;
		System.out.println(name.concat(" moved"));
	}

}
