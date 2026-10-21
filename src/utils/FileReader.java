/**
 * @author ValentinaTikko
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Eine Hilfsklasse zum Lesen aus einer Datei
 */
public class FileReader {

	public static ArrayList<String> read(String fileName) {
		File myObj = new File(fileName);
		ArrayList<String> result = new ArrayList<String>();

		try (Scanner myReader = new Scanner(myObj)) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				result.add(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
