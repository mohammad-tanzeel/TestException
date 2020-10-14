package com.test;

//add imports for io, util.Scanner and util.ArrayList
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Demonstrate filing reading and writing by reading from one file and writing
 * to another file
 * 
 * @author Scott Gray <sgray@ccsnh.edu>
 */
public class FileIO {
	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException reasons why
	 */
	public static void main(String[] args) {
		ArrayList<Integer> buffer = new ArrayList<>();
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		String path = "src" + File.separator + "fileio" + File.separator;
		System.out.println("Path to file: " + path);
		try {
			File dataFile = new File(path + "data.txt");
			if (!dataFile.exists()) {
				throw new FileNotFoundException();
			}
			System.out.println("Reading file...");
			Scanner input = new Scanner(dataFile);
			while (input.hasNext()) {
				try {
					Integer line = input.nextInt();
					buffer.add(line);
					System.out.println(line);
				} catch (InputMismatchException ex) {
					System.out.println("Handled InputMismatchException while reading the file....");
					input.next();
				}
			}
			input.close();
			FileWriter fw = new FileWriter(path + "new_data.txt", true);
			PrintWriter output = new PrintWriter(fw);
			System.out.println("Writing...");
			for (int index = 0; index < buffer.size(); index++) {
				Integer line = buffer.get(index);
				output.println(line);
				System.out.println(line);
			}
			output.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("fnfe: " + fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println("ioe: " + ioe.getMessage());
		} catch (IllegalStateException nse) {
			System.out.println("IllegalStateException - if this scanner is closed ");
		} catch (InputMismatchException ime) {
			System.out.println(
					"InputMismatchException - if the next token does not match the Integer regular expression, or is out of range ");
		} catch (NoSuchElementException nse) {
			// TODO: handle exception
			System.out.println("nse: if input is exhausted " + nse.getMessage());
		} finally {
			System.out.println(" In finaly");
		}
	}
}