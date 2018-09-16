package tr.sevda.game.logic;

import tr.sevda.game.entity.Entity;
import tr.sevda.game.environment.Environment;

public class Logic {

	private Environment environment;

	public Logic(Environment environment) {
		this.environment = environment;
	}

	public void run() {
		while (environment.player.health > 0) {
			this.loop();
		}
	}

	public void loop() {
		moveEverybody();
		checkEncounter();
	}

	public void moveEverybody() {
		environment.player.move(1);
		for (Entity entity : environment.entities) {
			entity.move(-1);
		}
	}

	public boolean checkEncounter() {
		for (Entity entity : environment.entities) {
			if (entity.position == environment.player.position) {
				System.out.println("Encounter!");
				return true;
			}
		}
		return false;
	}
}
