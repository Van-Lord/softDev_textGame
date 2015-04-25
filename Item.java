/**
 * Class: Item
 * 
 * @author Valentin Meica
 * @version 1.0 Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 *          This class – holds information about items for a text game
 *
 *          Purpose: – creates an object of item with the specific attributes
 */
public class Item {

	protected String description;
	protected int effect;

	/**
	 * constructor
	 * 
	 * @param description
	 * @param effect
	 **/
	public Item(String description, int effect) {
		this.description = description;
		this.effect = effect;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * get the effect of the item
	 * 
	 */
	public int getEffect() {
		return effect;
	}

	/**
	 * @param effect
	 *            the effect of the item
	 */
	public void setEffect(int effect) {
		this.effect = effect;
	}

	/**
	 * printItem
	 */
	public void printItem() {
		System.out.println("Item " + description + " has " + effect + " effect.");
	}

}