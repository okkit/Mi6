package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	public static String write2File(String filename, String text) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
			bw.newLine(); // move to a new line
			bw.write(text); // add new text at the end
		} catch (IOException e) {
			return e.getMessage();
		}
		return null;
	}
}
