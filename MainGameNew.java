import java.util.Scanner;

public class MainGameNew {

	public static GameSaveAndLoad gs = new GameSaveAndLoad();
	public static Scanner in = new Scanner(System.in);
	public static boolean running = true;
	public static String room = "Room_1";
	public static String userInput = "";
	public static Player p;

	public static void main(String[] args) {

		//room = gs.loadGame();

		System.out.println("Enter your name: ");
		String name = in.nextLine();
		p = new Player(name);
		room = "Room_1";

		//p = new Player("John");

		// Game loop
		while (running) {

			// Terminate the program if is exit is entered.
			if (userInput.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the game..");
				System.exit(0);
			} else {
				if(userInput.equalsIgnoreCase("help")) {
					System.out.println("*****HELP*****");
					System.out.println("\'help\': help menu");
					System.out.println("\'stats\': player statistics");
					System.out.println("\'inv\': player inventory");
					System.out.println("\'exit\': exit the program");
					System.out.println("*****HELP*****");
				}
				if (userInput.equalsIgnoreCase("stats")) {
					System.out.println("\n" + p.toString() + "\n");
				}
				if (userInput.equalsIgnoreCase("inv")) {
					System.out.println("\nInventory: ");
					p.printInventory();
					System.out.println();
				}
				switch (room) {

				/**
				 * ROOM 1
				 */
				case "Room_1":
					System.out.println("\n" + Scenarios.SCENARIO_1 + "\n");
					room = "1A";
					break;
				case "1A":
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
				 * ROOM 2
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
				 * ROOM 3
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
				 * ROOM 4
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
				 * ROOM 5
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
				 * ROOM 6
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
					case ("2"):
						System.out
								.println("\nThe door has closed on you. You must continue forward.\n");
						room = "6A";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "6A";
						break;
					}
					break;

				/**
				 * ROOM 7
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
				 * ROOM 7_2
				 */
				case ("Room_7_2"):
					System.out.println("\n" + Scenarios.SCENARIO_7_2 + "\n");
					room = "7_2A";
					break;
				case ("7_2A"):
					switch (userInput = in.nextLine()) {
					case ("1"):
						System.out.println("\n" + Scenarios.CHECK_BOX + "\n");
						room = "7_2B";
						break;
					case ("2"):
						System.out.println("CONTINUING ON TO THE NEXT ROOM..");
						room = "Room_8";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "7_2A";
						break;
					}
					break;
				case ("7_2B"):
					switch (userInput = in.nextLine()) {
					case ("1"):
						// Add items to inventory.
						p.addToInventory(new Item("Color liquids", 10));
						p.addToInventory(new Item("Mask", 5));
						p.addToInventory(new Item("Knife", 13));
						System.out.println("ADDED ITEMS TO YOUR INVENTORY.");
						room = "Room_8";
						break;
					case ("2"):
						System.out.println("CONTINUING ON TO THE NEXT ROOM..");
						room = "Room_8";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "7_2B";
						break;
					}
					break;

				/**
				 * ROOM 8
				 */
				case ("Room_8"):
					System.out.println("\n" + Scenarios.SCENARIO_8 + "\n");
					room = "Room_9";
					break;

				/**
				 * ROOM 9
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
				 * ROOM 10
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
				 * ROOM 11
				 */
				case ("Room_11"):
					System.out.println("\n" + Scenarios.SCENARIO_11 + "\n");
					room = "11A";
					break;
				case ("11A"):
					// Create a monster
					Monster gp = new Monster("Giant Plant");
					// Print the monster and player
					System.out.println("\n****************");
					System.out.println(p.toString());
					System.out.println(gp.toString());
					System.out.println("****************\n");
					// Prompt the user to fight.
					System.out.println("\nPress [1] to fight");
					switch (userInput = in.nextLine()) {
					case ("1"):
						// While either character is still, continue fighting.
						while (gp.isAlive() || p.isAlive()) {
							// Player attacks monster
							p.attack(gp);
							// Check if the monster is alive.
							if (!gp.isAlive()) {
								// Print monster health.
								System.out.println("\nMonster health:"
										+ gp.getHealthPoints());
								// Print defeated message.
								System.out.println("Monster defeated!");
								room = "Room_12";
								break;
							}
							// Monster attacks player.
							gp.attack(p);
							// Check if the player is alive.
							if (!p.isAlive()) {
								// Print player health.
								System.out.println("\nPlayer health: "
										+ p.getHealthPoints());
								// Print defeated message.
								System.out
										.println("Player defeated, restarting from last room.");
								// Set the players health points to 2 times the
								// sum of the the monsters health points and
								// attack points.
								p.setHealthPoints(2 * (gp.getHealthPoints() + gp
										.getAttackPoints()));
								room = "11A";
								break;
							}
							// Print the monster and player.
							System.out.println("\n****************");
							System.out.println("Player " + p.getName()
									+ " has " + p.getHealthPoints()
									+ " health.");
							System.out.println("Monster " + gp.getName()
									+ " has " + gp.getHealthPoints()
									+ " health.");
							System.out.println("****************\n");
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "11A";
						break;
					}
					break;

				/**
				 * ROOM 12
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
				 * ROOM 13
				 */
				case ("Room_13"):
					System.out.println("\n" + Scenarios.SCENARIO_13 + "\n");
					room = "Room_14";
					break;

				/**
				 * ROOM 14
				 */
				case ("Room_14"):
					System.out.println("\n" + Scenarios.SCENARIO_14 + "\n");
					room = "Room_15";
					break;

				/**
				 * ROOM 15
				 */
				case ("Room_15"):
					System.out.println("\n" + Scenarios.SCENARIO_11 + "\n");
					room = "15A";
					break;
				case ("15A"):
					// Create a monster
					Monster al = new Monster("Alien");
					// Print the monster and player
					System.out.println("\n****************");
					System.out.println(p.toString());
					System.out.println(al.toString());
					System.out.println("****************\n");
					// Prompt the user to fight.
					System.out.println("\nPress [1] to fight");
					switch (userInput = in.nextLine()) {
					case ("1"):
						// While either character is still, continue fighting.
						while (al.isAlive() || p.isAlive()) {
							// Player attacks monster
							p.attack(al);
							// Check if the monster is alive.
							if (!al.isAlive()) {
								// Print monster health.
								System.out.println("\nMonster health:"
										+ al.getHealthPoints());
								// Print defeated message.
								System.out.println("Monster defeated!");
								room = "Room_16";
								break;
							}
							// Monster attacks player.
							al.attack(p);
							// Check if the player is alive.
							if (!p.isAlive()) {
								// Print player health.
								System.out.println("\nPlayer health: "
										+ p.getHealthPoints());
								// Print defeated message.
								System.out
										.println("Player defeated, restarting from last room.");
								// Set the players health points to 2 times the
								// sum of the the monsters health points and
								// attack points.
								p.setHealthPoints(2 * (al.getHealthPoints() + al
										.getAttackPoints()));
								room = "15A";
								break;
							}
							// Print the monster and player.
							System.out.println("\n****************");
							System.out.println("Player " + p.getName()
									+ " has " + p.getHealthPoints()
									+ " health.");
							System.out.println("Monster " + al.getName()
									+ " has " + al.getHealthPoints()
									+ " health.");
							System.out.println("****************\n");
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "15A";
						break;
					}
					break;

				/**
				 * ROOM 16
				 */
				case ("Room_16"):
					System.out.println("\n" + Scenarios.SCENARIO_16 + "\n");
					room = "16A";
					break;
				case ("16A"):
					switch (userInput = in.nextLine()) {
					case ("1"):
						room = "Room_17";
						break;
					case ("2"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "16A";
						break;
					case ("3"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "16A";
						break;
					case ("4"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "16A";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "16A";
						break;
					}
					break;

				/**
				 * ROOM 17
				 */
				case ("Room_17"):
					System.out
							.println("\n" + Scenarios.SCENARIO_17_PINK + "\n");
					room = "17A";
					break;

				case ("17A"):
					System.out.println("\n" + Puzzle.ALIEN_NECKLACE + "\n");
					switch (userInput = in.nextLine()) {
					case ("1"):
						room = "17B";
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "17A";
						break;
					}
					break;
				case ("17B"):
					System.out
							.println("\n[1] PINK\n[2] PURPLE\n[3] BLUE\n[4] GREEN");
					switch (userInput = in.nextLine()) {
					case ("1"):
						System.out
								.println("You are already in room 17. Please pick another room");
						room = "17B";
						break;
					case ("2"):
						room = "Room_18";
						break;
					case ("3"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "17B";
						break;
					case ("4"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "17B";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "17B";
						break;
					}
					break;

				/**
				 * ROOM 18
				 */
				case ("Room_18"):
					System.out.println("\n" + Scenarios.SCENARIO_18_PURPLE
							+ "\n");
					room = "18A";
					break;
				case ("18A"):
					// Create a monster
					Monster al2 = new Monster("Mega Alien");
					// Print the monster and player
					System.out.println("\n****************");
					System.out.println(p.toString());
					System.out.println(al2.toString());
					System.out.println("****************\n");
					// Prompt the user to fight.
					System.out.println("\nPress [1] to fight");
					switch (userInput = in.nextLine()) {
					case ("1"):
						// While either character is still, continue fighting.
						while (al2.isAlive() || p.isAlive()) {
							// Player attacks monster
							p.attack(al2);
							// Check if the monster is alive.
							if (!al2.isAlive()) {
								// Print monster health.
								System.out.println("\nMonster health:"
										+ al2.getHealthPoints());
								// Print defeated message.
								System.out.println("Monster defeated!");
								room = "18B";
								break;
							}
							// Monster attacks player.
							al2.attack(p);
							// Check if the player is alive.
							if (!p.isAlive()) {
								// Print player health.
								System.out.println("\nPlayer health: "
										+ p.getHealthPoints());
								// Print defeated message.
								System.out
										.println("Player defeated, restarting from last room.");
								// Set the players health points to 2 times the
								// sum of the the monsters health points and
								// attack points.
								p.setHealthPoints(2 * (al2.getHealthPoints() + al2
										.getAttackPoints()));
								room = "18A";
								break;
							}
							// Print the monster and player.
							System.out.println("\n****************");
							System.out.println("Player " + p.getName()
									+ " has " + p.getHealthPoints()
									+ " health.");
							System.out.println("Monster " + al2.getName()
									+ " has " + al2.getHealthPoints()
									+ " health.");
							System.out.println("****************\n");
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "18A";
						break;
					}
					break;
				case ("18B"):
					System.out
							.println("\n[1] PINK\n[2] PURPLE\n[3] BLUE\n[4] GREEN");
					switch (userInput = in.nextLine()) {
					case ("1"):
						System.out
								.println("You already been in room 17. Please pick another room");
						room = "18B";
						break;
					case ("2"):
						System.out
								.println("You are already in room 18. Please pick another room");
						room = "18B";
						break;
					case ("3"):
						room = "Room_19";
						break;
					case ("4"):
						System.out
								.println("This room is blocked. Please pick another room");
						room = "18B";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "18B";
						break;
					}
					break;

				/**
				 * ROOM 19
				 */
				case ("Room_19"):
					System.out
							.println("\n" + Scenarios.SCENARIO_19_BLUE + "\n");
					room = "19A";
					break;
				case ("19A"):
					System.out.println("\n" + Puzzle.TRIPLERIDDLE1 + "\n");
					switch (userInput = in.nextLine()) {
					case ("2"):
						if (Puzzle.solvingTripleRiddle(userInput)) {
							System.out.println("You solved the puzzle."); // for
																			// testing
							room = "19B";
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "19A";
						break;
					}
					break;
				case ("19B"):
					System.out
							.println("\n[1] PINK\n[2] PURPLE\n[3] BLUE\n[4] GREEN");
					switch (userInput = in.nextLine()) {
					case ("1"):
						System.out
								.println("You already been in room 17. Please pick another room");
						room = "19B";
						break;
					case ("2"):
						System.out
								.println("You already been in room 18. Please pick another room");
						room = "19B";
						break;
					case ("3"):
						System.out
								.println("You are already in room 19. Please pick another room");
						room = "19B";
						break;
					case ("4"):
						room = "Room_20";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "19B";
						break;
					}
					break;

				/**
				 * ROOM 20
				 */
				case ("Room_20"):
					System.out.println("\n" + Scenarios.SCENARIO_20_GREEN
							+ "\n");
					room = "20A";
					break;
				case ("20A"):
					// Create a monster
					Monster al3 = new Monster("Grass Alien");
					// Print the monster and player
					System.out.println("\n****************");
					System.out.println(p.toString());
					System.out.println(al3.toString());
					System.out.println("****************\n");
					// Prompt the user to fight.
					System.out.println("\nPress [1] to fight");
					switch (userInput = in.nextLine()) {
					case ("1"):
						// While either character is still, continue fighting.
						while (al3.isAlive() || p.isAlive()) {
							// Player attacks monster
							p.attack(al3);
							// Check if the monster is alive.
							if (!al3.isAlive()) {
								// Print monster health.
								System.out.println("\nMonster health:"
										+ al3.getHealthPoints());
								// Print defeated message.
								System.out.println("Monster defeated!");
								room = "Room_21";
								break;
							}
							// Monster attacks player.
							al3.attack(p);
							// Check if the player is alive.
							if (!p.isAlive()) {
								// Print player health.
								System.out.println("\nPlayer health: "
										+ p.getHealthPoints());
								// Print defeated message.
								System.out
										.println("Player defeated, restarting from last room.");
								// Set the players health points to 2 times the
								// sum of the the monsters health points and
								// attack points.
								p.setHealthPoints(2 * (al3.getHealthPoints() + al3
										.getAttackPoints()));
								room = "20A";
								break;
							}
							// Print the monster and player.
							System.out.println("\n****************");
							System.out.println("Player " + p.getName()
									+ " has " + p.getHealthPoints()
									+ " health.");
							System.out.println("Monster " + al3.getName()
									+ " has " + al3.getHealthPoints()
									+ " health.");
							System.out.println("****************\n");
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "20A";
						break;
					}
					break;

				/**
				 * ROOM 21
				 */
				case ("Room_21"):
					System.out.println("\n" + Scenarios.SCENARIO_21 + "\n");
					room = "21A";
					break;
				case ("21A"):
					System.out.println("\n" + Scenarios.SCENARIO_2 + "\n");
					room = "21B";
					break;
				case ("21B"):
					switch (userInput = in.nextLine()) {
					case "1":
						System.out
								.println("\nThe left path is blocked right now, please pick another entrance.\n");
						room = "21B";
						break;
					case "2":
						System.out
								.println("\nThe right path is blocked right now, please pick another entrance.\n");
						room = "21B";
						break;
					case "3":
						room = "Room_22";
						break;
					default:
						System.out
								.println("\nI don't understand your request. Please try again.\n");
						room = "21B";
						break;
					}
					break;

				/**
				 * ROOM 22
				 */
				case ("Room_22"):
					System.out.println("\n" + Scenarios.SCENARIO_22 + "\n");
					room = "Room_23";
					break;

				/**
				 * ROOM 23
				 */
				case ("Room_23"):
					System.out.println("\n" + Scenarios.SCENARIO_23 + "\n");
					room = "23A";
					break;
				case ("23A"):
					// Create a monster
					Monster queen = new Monster("Queen Bee");
					// Print the monster and player
					System.out.println("\n****************");
					System.out.println(p.toString());
					System.out.println(queen.toString());
					System.out.println("****************\n");
					// Prompt the user to fight.
					System.out.println("\nPress [1] to fight");
					switch (userInput = in.nextLine()) {
					case ("1"):
						// While either character is still, continue fighting.
						while (queen.isAlive() || p.isAlive()) {
							// Player attacks monster
							p.attack(queen);
							// Check if the monster is alive.
							if (!queen.isAlive()) {
								// Print monster health.
								System.out.println("\nMonster health:"
										+ queen.getHealthPoints());
								// Print defeated message.
								System.out.println("Monster defeated!");
								room = "Room_24";
								break;
							}
							// Monster attacks player.
							queen.attack(p);
							// Check if the player is alive.
							if (!p.isAlive()) {
								// Print player health.
								System.out.println("\nPlayer health: "
										+ p.getHealthPoints());
								// Print defeated message.
								System.out
										.println("Player defeated, restarting from last room.");
								// Set the players health points to 2 times the
								// sum of the the monsters health points and
								// attack points.
								p.setHealthPoints(2 * (queen.getHealthPoints() + queen
										.getAttackPoints()));
								room = "23A";
								break;
							}
							// Print the monster and player.
							System.out.println("\n****************");
							System.out.println("Player " + p.getName()
									+ " has " + p.getHealthPoints()
									+ " health.");
							System.out.println("Monster " + queen.getName()
									+ " has " + queen.getHealthPoints()
									+ " health.");
							System.out.println("****************\n");
						}
						break;
					default:
						System.out.println("Please try again."); // testing
						room = "23A";
						break;
					}
					break;

				/**
				 * ROOM 24
				 */
				case ("Room_24"):
					System.out.println("\n" + Scenarios.SCENARIO_24 + "\n");
					System.out.println("End Game.");
					running = false;
					break;

				} // this brace is the room switch
			} // closes else

		}

	}
}
