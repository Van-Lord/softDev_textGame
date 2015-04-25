import java.util.Scanner;

/**
 * Class: Puzzle
 * 
 * @author Valentin Meica
 * @version 1.0 Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 *          This class � a pattern class for puzzle
 *
 *          Purpose: � a puzzle for a text game.
 */

// 7 descriptins and 7 methods

public class Puzzle {
	// Player user = new Player("John");

	public static final String LIGHT_COMBINATION = "\nMatch the color scheme "
			+ "\nstraight on.\nPlease separate your answers by comma."
			+ "\n[1] BLUE, BLUE, AQUA, GREEN, PURPLE, GREEN"
			+ "\n[2] BLUE, AQUA, BLUE, GREEN, PURPLE, PURPLE";

	public static final String ALIEN_NECKLACE = "Your task is to find all 3 "
			+ "\npieces of a necklace.\n[1] CONTINUE ON";

	public static final String BUTTON_HANDLE = "You have a choice:"
			+ "\n[1] PULL HANDLE\n[2] PUSH BUTTON";

	public static final String ENTRANCE_CHOICE = "You are facing four doors, "
			+ "\nchoose an entrance. Beware only one door leads to the next chamber!"
			+ "\n[1] DOOR ONE\n[2] DOOR TWO\n[3] DOOR THREE\n[4] DOOR FOUR";

	public static final String MEMORIZATION = "Remember what was the answers to "
			+ "\nthe questions earlier and write them on the cage"
			+ "\n[1] DINORNIS ROBUSTUS AND BREATH" // WRONG you end up being
													// eaten by Jack
			+ "\n[2] SMOKE AND GRAVITY" // WRONG you end up being eaten by Jack
			+ "\n[3] BREATH AND SMOKE"; // Yay! The cage opens

	public static final String RIDDLE = "Comes face to face with the light. The "
			+ "\nlight shatters and the room begins to close in on you. The pieces "
			+ "\nof light surround you and then move in front of you. A message of "
			+ "\nlight begins to appear and the message turns out to be a riddle. "
			+ "\nI\'m light as a feather, yet the strongest man can't hold me for "
			+ "\nmuch more than a minute. What am I?" + "\n[1] BREATH" // Moves
																		// on to
																		// the
																		// next
																		// riddle
			+ "\n[2] GRAVITY" // WRONG so you die
			+ "\n[3] ANT"; // WRONG so you die

	public static final String RIDDLE2 = "Wise choice! Second Riddle: I am the "
			+ "\nblack child of a white father, a wingless bird, flying even to the "
			+ "\nclouds of heaven. I give birth to tears of mourning in pupils that "
			+ "\nmeet me, even though there is no cause for grief, and at once on "
			+ "\nmy birth I am dissolved into air. What am I?" + "\n[1] GHOST" // WRONG
																				// you
																				// die
			+ "\n[2] SMOKE" // Right! Continue on
			+ "\n[3] DINORNIS ROBUSTUS"; // WRONG you die

	public static final String TRIPLERIDDLE1 = "The alien informs you that he is "
			+ "\nnot there to eat him but will whenever the player gets a wrong "
			+ "\nanswer. What lives in winter, dies in summer, and grows with its "
			+ "\nroot upward?" + "\n[1] ICE" // WRONG
			+ "\n[2] AN ICICLE" // RIGHT
			+ "\n[3] A SNOWMAN"; // WRONG

	public static final String TRIPLERIDDLE2 = "What three letters mean 'stiff water'?"
			+ "\n[1] ICE" // RIGHT
			+ "\n[2] FROZEN" // WRONG
			+ "\n[3] I.C.E "; // WRONG

	public static final String TRIPLERIDDLE3 = "What runs but never gets tired?"
			+ "\n[1] THE ROADRUNNER" // WRONG
			+ "\n[2] AN INTERGALACTIC SPACE DEVIL" // WRONG
			+ "\n[3] WATER"; // RIGHT

	/**
	 * Method: solvingPuzzle if the user enters the right combination of colors,
	 * otherwise try again
	 * 
	 * @return boolean
	 **/
	public static boolean solvingLightCombination(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("1")) {
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
	public static boolean solvingButtonHandle(String userInput) {
		boolean solved = false;
		if (userInput.equalsIgnoreCase("1")) { // go to the room
			solved = true;
			System.out.println("Proceed to the next room.");
		} else if (userInput.equalsIgnoreCase("2")) {

			// go to the other room
			System.out.println("Nothing happens try something else.");
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
			System.out.println("Failed try again.");
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
	public static boolean solvingMemorization(String userInput) {
		boolean solved = false;
		if (userInput.equalsIgnoreCase("3")) {
			System.out.println("That is correct, the cage opens!");
			solved = true;
		} else {
			System.out.println("Jack grabs you and eats you.");
			// user.setHealthpoints(0);
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
	public static boolean solvingRiddle(String userInput) {
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

				// user.setHealthpoints(0);
				solved = false;
			}

		} else if (userInput.equalsIgnoreCase("2")
				|| userInput.equalsIgnoreCase("3")) {

			System.out.println("Wrong Prepare to die!");

			// user.setHealthpoints(0);
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
	public static boolean solvingTripleRiddle(String userInput) {
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

					// user.setHealthpoints(0);
					solved = false;
				}
			} else if (userInput.equalsIgnoreCase("2")
					|| userInput.equalsIgnoreCase("3")) {

				System.out.println("Wrong Prepare to die!");

				// user.setHealthpoints(0);
				solved = false;
			}

		} else if (userInput.equalsIgnoreCase("1")
				|| userInput.equalsIgnoreCase("3")) {

			System.out.println("Wrong Prepare to die!");

			// user.setHealthpoints(0);
			solved = false;
		}

		return solved;
	}

}
