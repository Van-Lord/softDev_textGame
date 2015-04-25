/**
 * 
 */

import java.util.Random;

/**
 * class: Character
 * 
 * course: ITEC 3150 Spring 2015
 * 
 * written: April 1, 2015
 * 
 * @author Alejandro Guzman
 * @version 1.0
 * 
 * 
 *          This is a template for a general character. It contains attributes
 *          name, health, attack and getters and setters for the attributes. It
 *          contains the isAlive, attack, and toString method.
 * 
 *
 */
public abstract class Character {

	/**
	 * A string to hold the name of the character.
	 */
	protected String name;

	/**
	 * An integer to keep track of the health.
	 */
	protected int healthPoints;

	/**
	 * An integer to keep track of the characters attack points.
	 */
	protected int attackPoints;

	/**
	 * This constructor assigns a passed name to name, sets the health points to
	 * a default value of 100 and sets the attack points to a random value
	 * between 7 and 15.
	 * 
	 * @param name
	 */
	public Character(String name) {
		this.name = name;
		healthPoints = 100; // set default health to 100
		Random r = new Random();
		int rand = r.nextInt((29 - 17) + 1) + 17; // random number for monster
													// and player
		attackPoints = rand; // sets the attack to a pseudo-random number
								// between 7 and 15
	}

	/**
	 * This constructor assigns the name, health, and attack.
	 * 
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Character(String name, int healthPoints, int attackPoints) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
	}

	/**
	 * isAlive Tests if the health is equal to or below 0.
	 * 
	 * @return A boolean indicating if the character is alive.
	 */
	public boolean isAlive() {
		boolean isAlive = true;
		if (healthPoints <= 0) {
			isAlive = false;
		}
		return isAlive;
	}

	/**
	 * attack Take the attackPoints from the character and an item in inventory
	 * and deduct the total amount from the opponent.
	 * 
	 * @param c
	 *            character being attacked
	 * @param i
	 *            item being used
	 */
	public void attack(Character c, Item i) {
		int damage = attackPoints + i.getEffect();
		c.healthPoints = c.healthPoints - damage;
	}

	/**
	 * attack Deduct the attackPoints of this character from the opponent.
	 * 
	 * @param c
	 *            character being attacked
	 */
	public void attack(Character c) {
		int damage = attackPoints;
		c.healthPoints = c.healthPoints - damage;
	}

	/**
	 * toString
	 * 
	 * @return A string representing of this character.
	 */
	@Override
	public String toString() {
		return name + " has " + healthPoints + " health and " + attackPoints
				+ " attack.";
	}

	/**
	 * getHealthPoints
	 * 
	 * @return healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * setHealthPoints Set the healthPoints.
	 * 
	 * @param healthPoints
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	/**
	 * getAttackPoints
	 * 
	 * @return the attackPoints
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * setAttackPoints Set the attackPoints.
	 * 
	 * @param attackPoints
	 */
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
