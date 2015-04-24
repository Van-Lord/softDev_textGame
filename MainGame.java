package thatNewWay;

import java.util.Scanner;

import puzzle_classes.LightCombination;

public class MainGame {

	public static GameSaveAndLoad gs = new GameSaveAndLoad();
	public static Scanner in = new Scanner(System.in);
	public static String question;
	public static String userInput = "";



	public static void main(String[] args) {

		question = gs.loadGame();

		// Game loop
		while (true) {

			if (userInput.equalsIgnoreCase("exit")) {
				System.exit(0);
			} else {
				switch (question) {

				case "0":
					System.out.println(Scenarios.INTRO);
					question = "1";

					break;

				case "1":

					switch (userInput = in.next()) {
					case "1":
						question = "2";
						break;

					default:
						System.out
								.println("\nI don't understand your request.");
						question = "0";
						break;
					}

					break;

				case "2":
					System.out.println(Scenarios.ROOM2);
					question = "2A";
					// gs.saveGame("1A");
					break;

				case "2A":

					switch (userInput = in.next()) {

					case "1":
						System.out
								.println(Scenarios.ROOM3);
						
						LightCombination.solvingPuzzle(userInput = in.next());
						question="1A";
						break;

					case "2":
						System.out.println("\nThe right path is blocked right now, please pick another entrance.");
						question = "2A";
						break;

					case "3":

						System.out.println("\nThe Straight path is blocked right now, please pick another entrance.");
						question = "2A";
						break;

					default:
						System.out
								.println("\nI don't understand your request.");
						question = "1A";
						break;

					}

				}
			}

		}

	}

}
