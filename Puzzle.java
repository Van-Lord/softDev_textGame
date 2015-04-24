package puzzle_classes;

import java.util.Scanner;

/**
 * Class: Puzzle
 * 
 * @author Valentin Meica
 * @version 1.0 Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 *          This class – a pattern class for puzzle
 *
 *          Purpose: – a puzzle for a text game.
 */

// 7 descriptins and 7 methods

public class Puzzle {
	Player user = new Player("John");

	public static final String LIGHT_COMBINATION = "match the color scheme straight on "
			+ "Please separate your answers by comma";

	public static final String ALIEN_NECKLACE = "Your task is to find all 3 pieces of a necklace.";

	public static final String BUTTON_HANDLE = "You have a coice:"
			+ "\n[1] push a button" + "\n[2] pull the handle.";

	public static final String ENTRANCE_CHOICE = "You are facing 4 doors choose an entrance . Beware only one door leads to the next chamber!"
			+ "\n[1] First Door"
			+ "\n[2] Second Door"
			+ "\n[3] Third Door"
			+ "\n[4] Fourth Door";

	public static final String MEMORIZATION = "Remember what was the answers to the questions earlier and write them on the cage) "
			+ "\n[1]Dinornis robustus and Breath (WRONG you end up beingeaten by “Jack”)"
			+ "\n[2]Smoke and Gravity (WRONG you end up being eaten by “Jack”)"
			+ "\n[3]Breath and Smoke (Yay! The cage opens)";;

	public static final String RIDDLE = "Comes face to face with the light. The light shatters and the room begins to close in on the player. "
			+ "\nThe pieces of light surround the player and then move in front of the player. "
			+ "\nA message of light begins to appear and the message turns out to be a riddle. "
			+ "\nI'm light as a feather, yet the strongest man can't hold me for much more than a minute. What am I? "
			+ "\n[1]. Breath (moves on to the next riddle)"
			+ "\n[2]. Gravity (WRONG so you die)"
			+ "\n[3]. Ant (WRONG so you die)" + "\nenter 1,2, or3 for answer";

	public static final String RIDDLE2 = "WISE CHOICE!"
			+ "Second Riddle: I am the black child of a white father, a wingless "
			+ "\nbird, flying even to the clouds of heaven. I give birth to tears "
			+ "\nof mourning in pupils that meet me, even though there is no "
			+ "\ncause for grief, and at once on my birth I am dissolved into air. What am I?"
			+ "\n[1]. Ghost (WRONG you die)"
			+ "\n[2]. Smoke (Right! Continue on)"
			+ "\n[3]. Dinornis robustus (WRONG you die)"
			+ "\nenter 1,2, or3 for answer";

	public static final String TRIPLERIDDLE = "The alien informs the player that he is not there to eat him "
			+ "\nbut will whenever the player gets a wrong answer.  "
			+ "\nWhat lives in winter, dies in summer, and grows with its root upward? "
			+ "\n[1]	Ice (WRONG) "
			+ "\n[2]	An icicle (RIGHT) "
			+ "\n[3]	A snowman (WRONG)";

	public static final String TRIPLERIDDLE2 = "What three letters mean 'stiff water'? "
			+ "\n[1]	Ice (RIGHT)"
			+ "\n[2]	Frozen (WRONG)"
			+ "\n[3]	I.C.E (WRONG)";

	public static final String TRIPLERIDDLE3 = "What runs but never gets tired?"
			+ "\n[1]	The roadrunner (WRONG)"
			+ "\n[2]	An intergalactic space devil (WRONG)"
			+ "\n[3]	Water (RIGHT)";

	/**
	 * Method: solvingPuzzle if the user enters the right combination of colors,
	 * otherwise try again
	 * 
	 * @return boolean
	 **/
	public static boolean solvingLightCombination(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("blue, aqua, green, purple")) {
			System.out.println("The door opens. Well Done!");
			solved = true;
		} else {
			System.out.println("Wrong combination please try again.");
			solved = false;
		}
		return solved;
	}

	/**
	 * Method: solvingPuzzle checks what choice the user makes and provides an
	 * output
	 * 
	 * @return boolean
	 **/
	public boolean solvingButtonHandle(String userInput) {
		boolean solved = false;
		if (userInput.equalsIgnoreCase("1")) { // go to the room
			solved = true;
			System.out.println("procede to the room");
		} else if (userInput.equalsIgnoreCase("2")) {

			// go to the other room
			System.out.println("procede to the other room");
			solved = true;
		}
		return solved;

	}

	/**
	 * Method: solvingPuzzle if the user enters the right door puzzle solved
	 * otherwise try again
	 * 
	 * @return boolean
	 **/
	public boolean solvingEntranceChoice(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("1")) {
			System.out.println("Puzzle solved!");
			solved = true;
		} else {
			System.out.println("failed try again");
			solved = false;
		}
		return solved;

	}

	/**
	 * Method: solvingPuzzle if the user enters the right combination that was
	 * the answers to the riddle puzzle
	 * 
	 * @return boolean
	 **/
	public boolean solvingMemorization(String userInput) {
		boolean solved = false;
		if (userInput.equalsIgnoreCase("1")) {
			System.out.println("That is correct; the cage opens!");
			solved = true;
		} else {
			System.out.println("Jack grabs you and eats you.");
			user.setHealthpoints(0);
			solved = false;
		}
		return solved;

	}

	/**
	 * Method: solvingPuzzle if the user enters the wrong answer he is being
	 * eaten by monster.
	 * 
	 * @return boolean
	 **/
	public boolean solvingRiddle(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("1")) // 1 is for breath
		{
			System.out.println(RIDDLE2);

			Scanner input = new Scanner(System.in);
			userInput = input.next();
			if (userInput.equalsIgnoreCase("2")) {
				System.out.println("Well done! Puzzle solved.");
				solved = true;
			} else if (userInput.equalsIgnoreCase("1")
					|| userInput.equalsIgnoreCase("3")) {

				System.out.println("Wrong Prepare to die!");

				user.setHealthpoints(0);
				solved = false;
			}

		} else if (userInput.equalsIgnoreCase("2")
				|| userInput.equalsIgnoreCase("3")) {

			System.out.println("Wrong Prepare to die!");

			user.setHealthpoints(0);
			solved = false;
		}
		return solved;
	}

	/**
	 * Method: solvingPuzzle if the user enters the wrong answer he is being
	 * eaten by monster.
	 * 
	 * @return boolean
	 **/
	public boolean solvingTripleRiddle(String userInput) {
		boolean solved = false;
		Scanner input = new Scanner(System.in);

		if (userInput.equalsIgnoreCase("2")) {
			// second riddle
			System.out.println(TRIPLERIDDLE2);

			userInput = input.next();

			if (userInput.equalsIgnoreCase("1")) {
				// third riddle
				System.out.println(TRIPLERIDDLE3);
				userInput = input.next();

				if (userInput.equalsIgnoreCase("3")) {
					System.out.println("Well done! Puzzle solved.");
					solved = true;
				} else if (userInput.equalsIgnoreCase("1")
						|| userInput.equalsIgnoreCase("2")) {

					System.out.println("Wrong Prepare to die!");

					user.setHealthpoints(0);
					solved = false;
				}
			} else if (userInput.equalsIgnoreCase("2")
					|| userInput.equalsIgnoreCase("3")) {

				System.out.println("Wrong Prepare to die!");

				user.setHealthpoints(0);
				solved = false;
			}

		} else if (userInput.equalsIgnoreCase("1")
				|| userInput.equalsIgnoreCase("3")) {

			System.out.println("Wrong Prepare to die!");

			user.setHealthpoints(0);
			solved = false;
		}

		return solved;
	}

	/**
	 * @return the user
	 */
	public Player getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Player user) {
		this.user = user;
	}

	/**
	 * @return the lightCombination
	 */
	public static String getLightCombination() {
		return LIGHT_COMBINATION;
	}

	/**
	 * @return the alienNecklace
	 */
	public static String getAlienNecklace() {
		return ALIEN_NECKLACE;
	}

	/**
	 * @return the buttonHandle
	 */
	public static String getButtonHandle() {
		return BUTTON_HANDLE;
	}

	/**
	 * @return the entranceChoice
	 */
	public static String getEntranceChoice() {
		return ENTRANCE_CHOICE;
	}

	/**
	 * @return the memorization
	 */
	public static String getMemorization() {
		return MEMORIZATION;
	}

	/**
	 * @return the riddle
	 */
	public static String getRiddle() {
		return RIDDLE;
	}

	/**
	 * @return the riddle2
	 */
	public static String getRiddle2() {
		return RIDDLE2;
	}

	/**
	 * @return the tripleriddle
	 */
	public static String getTripleriddle() {
		return TRIPLERIDDLE;
	}

	/**
	 * @return the tripleriddle2
	 */
	public static String getTripleriddle2() {
		return TRIPLERIDDLE2;
	}

	/**
	 * @return the tripleriddle3
	 */
	public static String getTripleriddle3() {
		return TRIPLERIDDLE3;
	}

	
	
	
}
