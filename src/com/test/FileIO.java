package com.test;

//add imports for io, util.Scanner and util.ArrayList
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Demonstrate filing reading and writing by reading from one file and writing
 * to another file
 * 
 * @author Scott Gray <sgray@ccsnh.edu>
 */
public class FileIO {
	/**
	 * @param args
	 *            the command line arguments
	 * @throws java.io.IOException
	 *             reasons why
	 */
	public static void main(String[] args) {
		// set up an array list to use as storage
		ArrayList<Integer> buffer = new ArrayList<>();
		// check our current working directory
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		// create a path String to the start of the file locations (discuss seperators)
		String path = "src" + File.separator + "fileio" + File.separator;
		System.out.println("Path to file: " + path);
		// open -> read -> close
		// open the data.txt file
		try {
			ReallyBadClass rbc =  new ReallyBadClass();

		File dataFile = new File(path + "data.txt");
		// check if it exists
		dataFile.exists();
			System.out.println("Reading file...");
			
			Scanner input = new Scanner(dataFile);
			while (input.hasNext()) {
				Integer line = input.nextInt();
				buffer.add(line);
				System.out.println(line);
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
//		} else {
//			System.out.println("File not found for: " + path + "data.txt");
//			System.exit(0);
//		}
		} catch (FileNotFoundException fnfe) {
			System.out.println("fnfe: " + fnfe.getMessage());
//			fnfe.printStackTrace();
			// TODO: handle exception
		} catch (IOException ioe) {
			System.out.println("ioe: " + ioe.getMessage());
//			ioe.printStackTrace();
			// TODO: handle exception
		} catch (IllegalStateException nse) {
			// TODO: handle exception
			System.out.println("IllegalStateException - if this scanner is closed ");
//			nse.printStackTrace();
		} catch (InputMismatchException ime) {
			// TODO: handle exception
//			throw new 
			System.out.println("InputMismatchException - if the next token does not match the Integer regular expression, or is out of range " );
//			ime.printStackTrace();
		}		
		catch (NoSuchElementException nse) {
			// TODO: handle exception
			System.out.println("nse: if input is exhausted " + nse.getMessage());
//			nse.printStackTrace();
		} finally {
			System.out.println(" In finaly");
		}
	}
}