package thatNewWay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GameSaveAndLoad {

	public static Properties prop = new Properties();

	public void saveGame(String point) {
		try {

			prop.setProperty("Save_Point", point);
			prop.store(new FileOutputStream("config.prop"), null);

		} catch (IOException e) {
		}
	}

	public String loadGame() {
		String line = "";
		try {

			prop.load(new FileInputStream("config.prop"));
			line = prop.getProperty("Save_Point");

		} catch (IOException e) {
			try {

				prop.setProperty("Save_Point", "0");
				prop.store(new FileOutputStream("config.prop"), null);

				try {
					prop.load(new FileInputStream("config.prop"));
					line = prop.getProperty("Save_Point");
				} catch (IOException exe) {

				}
			} catch (IOException ex) {
			}
		}
		return line;
	}

}
