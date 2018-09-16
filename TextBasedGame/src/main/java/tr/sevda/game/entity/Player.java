package tr.sevda.game.entity;

import java.util.Scanner;

public class Player extends Entity {
	
	@Override
	public void move(int step) {
		System.out.println("Burada yapýlacak birþey yok.");
		System.out.println("Yürümek için");
		
		Scanner keyboard = new Scanner(System.in);
		keyboard.next();
		
		super.move(step);
	}

	public Player(String name, int health, int position) {
		super(name, health, position);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
