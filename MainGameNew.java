import java.util.Scanner;

public class MainGameNew {

	public static GameSaveAndLoad gs = new GameSaveAndLoad();
	public static Scanner in = new Scanner(System.in);
	public static String room = "Room_11";
	public static String userInput = "";
	public static Player p;

	public static void main(String[] args) {

		// room = gs.loadGame();

		// System.out.println("Enter your name: ");
		// String name = in.nextLine();
		// p = new Player(name);
		// room = "Room_1";

		p = new Player("John");

		// Game loop
		while (true) {

			if (userInput.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the game..");
				System.exit(0);
			} else {
				switch (room) {

				/**
				 * 
				 * 
				 * ROOM 1
				 * 
				 * 
				 */
				case "Room_1":
					System.out.println("\n" + Scenarios.SCENARIO_1 + "\n");
					room = "1A";
					break;

				case "1A":

					// Only can go west[1]
					switch (userInput = in.nextLine()) {

					case "1":
						room = "Room_2";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "1A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 2
				 * 
				 * 
				 */
				case "Room_2":
					System.out.println("\n" + Scenarios.SCENARIO_2 + "\n");
					room = "2A";
					// gs.saveGame("2A");
					break;

				case "2A":

					switch (userInput = in.nextLine()) {

					case "1":
						room = "Room_3";

						break;

					case "2":
						System.out
								.println("\nThe right path is blocked right now, please pick another entrance.\n");
						room = "2A";
						break;

					case "3":

						System.out
								.println("\nThe straight path is blocked right now, please pick another entrance.\n");
						room = "2A";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "2A";
						break;

					}

					break;

				/**
				 * 
				 * 
				 * ROOM 3
				 * 
				 * 
				 */
				case ("Room_3"):
					System.out.println("\n" + Scenarios.SCENARIO_3 + "\n");
					room = "3A";
					break;

				case ("3A"):
					System.out.println("\n" + Puzzle.LIGHT_COMBINATION + "\n");

					switch (userInput = in.nextLine()) {

					case ("1"):
						if (Puzzle.solvingLightCombination(userInput)) {
							System.out.println("You solved the puzzle."); // for
																			// testing
							room = "Room_4";
						}
						break;

					default:
						System.out.println("Please try again."); // testing
						room = "3A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 4
				 * 
				 */
				case ("Room_4"):
					System.out.println("\n" + Scenarios.SCENARIO_4 + "\n");
					room = "4A";
					break;

				case ("4A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_5";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "4A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 5
				 * 
				 * 
				 */
				case ("Room_5"):
					System.out.println("\n" + Scenarios.SCENARIO_5 + "\n");
					room = "5A";
					break;
				case ("5A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_6";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "5A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 6
				 * 
				 * 
				 */
				case ("Room_6"):
					System.out.println("\n" + Scenarios.SCENARIO_6 + "\n");
					room = "6A";
					break;
				case ("6A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_7";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "6A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 7
				 * 
				 * 
				 */
				case ("Room_7"):
					System.out.println("\n" + Scenarios.SCENARIO_7 + "\n");
					room = "7A";
					break;

				case ("7A"):
					System.out.println("\n" + Puzzle.RIDDLE + "\n");

					switch (userInput = in.nextLine()) {

					case ("1"):
						if (Puzzle.solvingRiddle(userInput)) {
							System.out.println("You solved the puzzle."); // for
																			// testing
							room = "Room_7_2";
						}
						break;

					default:
						System.out.println("Please try again."); // testing
						room = "7A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 7_2
				 * 
				 * 
				 */

				case ("Room_7_2"):
					System.out.println("\n" + Scenarios.SCENARIO_7_2 + "\n");
					room = "7_2A";
					break;

				case ("7_2A"):
					System.out
							.println("Would you like to check the box?\n[1] CHECK BOX\n[2] CONTINUE");

					switch (userInput = in.nextLine()) {

					case ("1"):
						System.out.println("\n" + Scenarios.CHECK_BOX + "\n");

						/* Here is where the items get added to the inventory */
						room = "Room_8";

						break;

					case ("2"):
						room = "Room_8";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "7_2A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 8
				 * 
				 * 
				 * 
				 */
				case ("Room_8"):
					System.out.println("\n" + Scenarios.SCENARIO_8 + "\n");
					room = "Room_9";
					break;

				/**
				 * 
				 * 
				 * ROOM 9
				 * 
				 * 
				 * 
				 */
				case ("Room_9"):
					System.out.println("\n" + Scenarios.SCENARIO_9 + "\n");
					room = "9A";
					break;

				case ("9A"):
					System.out.println("\n" + Puzzle.MEMORIZATION + "\n");

					switch (userInput = in.nextLine()) {

					case ("3"):
						if (Puzzle.solvingMemorization(userInput)) {
							System.out.println("You solved the puzzle."); // for
																			// testing
							room = "Room_10";
						}
						break;

					default:
						System.out.println("Please try again."); // testing
						room = "9A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 10
				 * 
				 * 
				 * 
				 */
				case ("Room_10"):
					System.out.println("\n" + Scenarios.SCENARIO_10 + "\n");
					room = "10A";
					break;

				case ("10A"):
					System.out.println("\n" + Puzzle.BUTTON_HANDLE + "\n");

					switch (userInput = in.nextLine()) {

					case ("1"):
						if (Puzzle.solvingButtonHandle(userInput)) {
							System.out.println("You solved the puzzle."); // for
																			// testing
							room = "Room_11";
						}
						break;

					default:
						System.out.println("Please try again."); // testing
						room = "10A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 11
				 * 
				 * 
				 * 
				 */
				case ("Room_11"):
					System.out.println("\n" + Scenarios.SCENARIO_11 + "\n");
					room = "11A";
					break;

				case ("11A"):
					Monster giantPlant = new Monster("Giant Plant");

					System.out.println("\nMonster health:"
							+ giantPlant.getHealthPoints());
					System.out.println("Monster attack: "
							+ giantPlant.getAttackPoints());
					System.out.println("Player health: " + p.getHealthPoints());
					System.out.println("Player attack: " + p.getAttackPoints());

					System.out.println("Press [1] to fight");

					switch (userInput = in.nextLine()) {

					case ("1"):

						while (giantPlant.isAlive() || p.isAlive()) {
							p.attack(giantPlant);
							if (!giantPlant.isAlive()) {
								System.out.println("Monster defeated!");
								System.out.println("Monster health:"
										+ giantPlant.getHealthPoints());
								room = "Room_12";
								break;
							}
							giantPlant.attack(p);
							if (!p.isAlive()) {
								System.out
										.println("Player defeated, restarting from last room.");
								System.out.println("Player health: "
										+ p.getHealthPoints());
								p.setHealthPoints(150);
								room = "11A";
								break;
							}

							System.out.println("\nMonster health:"
									+ giantPlant.getHealthPoints());
							System.out.println("Player health: "
									+ p.getHealthPoints());
						}
						break;

					default:
						System.out.println("Please try again."); // testing
						room = "11A";
						break;
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 12
				 * 
				 * 
				 * 
				 */
				case ("Room_12"):
					System.out.println("\n" + Scenarios.SCENARIO_12 + "\n");
					room = "12A";
					break;

				case ("12A"):
					System.out.println("\n" + Scenarios.SCENARIO_2 + "\n");
					room = "12B";
					break;

				case ("12B"):
					switch (userInput = in.nextLine()) {

					case "1":
						System.out
								.println("\nThe left path is blocked right now, please pick another entrance.\n");
						room = "12B";

						break;

					case "2":
						room = "Room_13";
						break;

					case "3":

						System.out
								.println("\nThe straight path is blocked right now, please pick another entrance.\n");
						room = "12B";
						break;

					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "12B";
						break;

					}

					break;

				/**
				 * 
				 * 
				 * ROOM 13
				 * 
				 * 
				 */
				case ("Room_13"):
					System.out.println("\n" + Scenarios.SCENARIO_13 + "\n");
					room = "Room_14";
					break;

				/**
				 * 
				 * 
				 * ROOM 14
				 * 
				 * 
				 */
				case ("Room_14"):
					System.out.println("\n" + Scenarios.SCENARIO_14 + "\n");
					room = "Room_15";
					break;

				} // this brace is the room switch
			} // closes else

		}

	}
}
