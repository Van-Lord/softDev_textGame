/**
 * 
 */

import java.util.ArrayList;

/**
 * class: Player
 * 
 * course: ITEC 3150 Spring 2015
 * 
 * written: April 1, 2015
 * 
 * @author Alejandro Guzman
 * @version 1.0
 * 
 * 
 *          This is a template for a player. This class extends the character
 *          class.
 * 
 *
 */
public class Player extends Character {

	/**
	 * An arraylist of items so the player can accumulate items throughout the
	 * game.
	 */
	private ArrayList<Item> inventory = new ArrayList<>();

	/**
	 * This constructor follows the super class constructor. It assigns a name
	 * and makes the healthPoints to 100 and randomly assigns a number between 7
	 * and 15 to the attackPoints.
	 * 
	 * @param name
	 */
	public Player(String name) {
		super(name);
	}

	/**
	 * This constructor sets the name, health, and attack points. It also sets
	 * the inventory to this inventory.
	 * 
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Player(String name, int healthPoints, int attackPoints,
			ArrayList<Item> inventory) {
		super(name, healthPoints, attackPoints);
		this.inventory = inventory;
		// TODO Auto-generated constructor stub
	}

	/**
	 * getInventory
	 * 
	 * @return An ArrayList<Item> representing the player inventory.
	 */
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	/**
	 * printInventory
	 */
	public void printInventory() {
		for (Item i : inventory) {
			i.printItem();
		}
	}

	/**
	 * setInventory Set the inventory.
	 * 
	 * @param inventory
	 */
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	/**
	 * addToInventory
	 */
	public void addToInventory(Item item) {
		inventory.add(item);
	}

	/**
	 * toString
	 * 
	 * @return A string representing of this player.
	 */
	@Override
	public String toString() {
		return "Player " + super.toString();
	}

}
