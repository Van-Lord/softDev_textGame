import java.util.Scanner;

public class MainGameNew {

	public static GameSaveAndLoad gs = new GameSaveAndLoad();
	public static Scanner in = new Scanner(System.in);
	public static String room = "1";
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

				case "1":
					System.out.println(Senarios.SENARIO_1);
					room = "1A";
					break;

				case "1A":

					switch (userInput = in.next()) {

					case "1":
						room = "2";
						break;

					default:
						System.out
								.println("\nI don't understand your request.");
						room = "1A";
						break;
					}

					break;

				case "2":
					System.out.println(Senarios.SENARIO_2);
					room = "2A";
					// gs.saveGame("1A");
					break;

				case "2A":

					switch (userInput = in.next()) {

					case "1":
						System.out.println(Senarios.SENARIO_3);
						break;

					case "2":
						System.out
								.println("\nThe right path is blocked right now, please pick another entrance.");
						room = "2A";
						break;

					case "3":

						System.out
								.println("\nThe straight path is blocked right now, please pick another entrance.");
						room = "2A";
						break;

					default:
						System.out
								.println("\nI don't understand your request.");
						room = "2";
						break;

					}

				}
			}

		}

	}

}
