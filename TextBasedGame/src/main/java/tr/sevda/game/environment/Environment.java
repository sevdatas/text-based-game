package tr.sevda.game.environment;

import java.util.ArrayList;
import java.util.List;

import tr.sevda.game.entity.Dog;
import tr.sevda.game.entity.Dragon;
import tr.sevda.game.entity.Entity;
import tr.sevda.game.entity.Giant;
import tr.sevda.game.entity.Player;

public class Environment {

	public List<Entity> entities = new ArrayList<Entity>();
	public Player player;
	public int length;

	public Environment(int length, Player player) {
		this.length = length;
		this.player = player;
		this.generateEntities();
	}

	private void generateEntities() {
		Dog dog = new Dog("BigWolf", 10, 10);
		Giant giant = new Giant("Hodor", 40, 50);
		Dragon dragon = new Dragon("Poncik", 90, 99);

		this.entities.add(dog);
		this.entities.add(giant);
		this.entities.add(dragon);
	}

}
