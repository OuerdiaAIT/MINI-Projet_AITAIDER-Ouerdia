package model;

import java.util.ArrayList;

public class Universe {

	private static ArrayList<Character> characters = new ArrayList<Character>();
	private static ArrayList<Character> monsters = new ArrayList<Character>();

	public static ArrayList<Character> getCharacters() {
		return characters;
	}
	
	public static ArrayList<Character> getMonsters() {
		return monsters;
	}

	public static void creation() {
		Character harry = new Character();
		harry.setName("Harry");
		harry.setHpMax(100);
		harry.setAttack(20);
		harry.setDodgePercent(40);
		characters.add(harry);

		Character ron = new Character();
		ron.setName("Ron");
		ron.setHpMax(80);
		ron.setAttack(15);
		ron.setDodgePercent(60);
		characters.add(ron);
		
		Character hermione = new Character();
		hermione.setName("Hermione");
		hermione.setHpMax(120);
		hermione.setAttack(20);
		hermione.setDodgePercent(50);
		characters.add(hermione);
		
		

	}
	
	public static void generateEnemies(String difficulty) {
		monsters.clear();
		
		if (difficulty.equals("easy")) {
			Character enemy = new Character();
	
			enemy.setName("Fred");
			enemy.setHpMax(50);
			enemy.setAttack(10);
			monsters.add(enemy);
			enemy.setDodgePercent(40);

			enemy = new Character();
			enemy.setName("Draco");
			enemy.setHpMax(60);
			enemy.setAttack(5);
			monsters.add(enemy);
			enemy.setDodgePercent(40);
			
			enemy = new Character();
			enemy.setName("Gilderoy");
			enemy.setHpMax(60);
			enemy.setAttack(15);
			monsters.add(enemy);
			enemy.setDodgePercent(40);			
			
				
	
		}
		if (difficulty.equals("medium")) {
			
			Character enemy = new Character();
			enemy.setName("Minerva");
			enemy.setHpMax(60);
			enemy.setAttack(20);
			monsters.add(enemy);
			enemy.setDodgePercent(40);

			enemy = new Character();
			enemy.setName("Rogue");
			enemy.setHpMax(60);
			enemy.setAttack(20);
			monsters.add(enemy);
			enemy.setDodgePercent(40);
			
			enemy = new Character();
			enemy.setName("Quirrell");
			enemy.setHpMax(70);
			enemy.setAttack(25);
			monsters.add(enemy);
			enemy.setDodgePercent(40);

		}
		if (difficulty.equals("hard")) {
			Character enemy = new Character();
			enemy.setName("Dumbledore");
			enemy.setHpMax(80);
			enemy.setAttack(20);
			monsters.add(enemy);
			enemy.setDodgePercent(40);

			enemy = new Character();
			enemy = new Character();
			enemy.setName("Slughorn");
			enemy.setHpMax(70);
			enemy.setAttack(20);
			monsters.add(enemy);
			enemy.setDodgePercent(40);

			enemy = new Character();
			enemy.setName("Voldemort");
			enemy.setHpMax(80);
			enemy.setAttack(30);
			monsters.add(enemy);
			enemy.setDodgePercent(45);
		}
	}
}
