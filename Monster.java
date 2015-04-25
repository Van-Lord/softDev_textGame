/**
 * 
 */


/**
 * class: Monster
 * 
 * course: ITEC 3150 Spring 2015
 * 
 * written: April 1, 2015
 * 
 * @author Alejandro Guzman
 * @version 1.0
 * 
 * 
 *          This is a template for a monster. This class extends the character
 *          class.
 * 
 *
 */
public class Monster extends Character {

	/**
	 * This constructor follows the super class constructor. It assigns a name
	 * and makes the healthPoints to 100 and randomly assigns a number between 7
	 * and 15 to the attackPoints.
	 * 
	 * @param name
	 */
	public Monster(String name) {
		super(name);
	}

	/**
	 * This constructor follows the super class constructor. It assigns a name,
	 * health, and attack.
	 * 
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Monster(String name, int healthPoints, int attackPoints) {
		super(name, healthPoints, attackPoints);
	}

	/**
	 * toString
	 * 
	 * @return A string representing of this monster.
	 */
	@Override
	public String toString() {
		return "Monster " + super.toString();
	}

}
