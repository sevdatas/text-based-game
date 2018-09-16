package tr.sevda.game.app;

import tr.sevda.game.entity.Player;
import tr.sevda.game.environment.Environment;
import tr.sevda.game.logic.Logic;

public class App {

	public static void main(String[] args) {
		Player player = new Player("Mustafa", 119, 0);
		Environment environment = new Environment(100, player);
		Logic logic = new Logic(environment);
		logic.run();
	}
}
