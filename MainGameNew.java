import java.util.Scanner;

public class MainGameNew {

	public static GameSaveAndLoad gs = new GameSaveAndLoad();
	public static Scanner in = new Scanner(System.in);
	public static String room = "Room_1";
	public static String userInput = "";

	public static void main(String[] args) {

		// room = gs.loadGame();

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
					System.out.println("\n" + Scenarios.SENARIO_1 + "\n");
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
								.println("\nI don't understand your request.\n");
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
					System.out.println("\n" + Scenarios.SENARIO_2 + "\n");
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
						room = "Room_2";
						break;

					case "3":

						System.out
								.println("\nThe straight path is blocked right now, please pick another entrance.\n");
						room = "Room_2";
						break;

					default:
						System.out
								.println("\nI don't understand your request.\n");
						room = "Room_2";
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
					System.out.println("\n" + Scenarios.SENARIO_3 + "\n");
					System.out.println("\n" + Puzzle.LIGHT_COMBINATION + "\n");

					userInput = in.nextLine();
					if (Puzzle.solvingLightCombination(userInput)) {
						System.out.println("SOLVEDDD"); // for testing
						room = "Room_4";
					} else {
						System.out.println("NNNOoo"); // testing
						room = "2A";
					}

					break;

				/**
				 * 
				 * 
				 * ROOM 4
				 * 
				 */
				case ("Room_4"):
					System.out.println("\n" + Scenarios.SENARIO_4 + "\n");

				case ("4A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_5";
						break;

					default:
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
					System.out.println(Scenarios.SENARIO_5);
					break;
				case ("5A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_6";
						break;

					default:
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
					System.out.println(Scenarios.SENARIO_6);
					break;
				case ("6A"):
					switch (userInput = in.nextLine()) {

					case ("1"):
						room = "Room_7";
						break;

					default:
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
					System.out.println("\n" + Scenarios.SENARIO_7 + "\n");
					System.out.println("\n" + Puzzle.RIDDLE + "\n");

					userInput = in.nextLine();
					/*
					 * if (Puzzle.solvingRiddle()) {
					 * System.out.println("SOLVEDDD"); // for testing room =
					 * "Room_4"; } else { System.out.println("NNNOoo"); //
					 * testing room = "2A"; }
					 */

					break;

				} // this brace is the room switch
			} // else

		}

	}
}
