package com.test;

import java.io.*;

/**
 *
 * @author Scott Gray <sgray@ccsnh.edu>
 */
public class BadClass {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// Exception Hierarchy
		// Errors vs. Exceptions
		// Unchecked/runtime exceptions vs. Checked exceptions
		// What can cause an exception? Examples we've seen in class are
		// Integer.parseInt
		// throwing a NumberFormatException, opening a file resulting in a
		// FileNotFoundException,
		// going past the end of an array's memory and getting an
		// ArrayIndexOutOfBoundsException
		// and memory not allocated for an object (aka is null) and getting a
		// NullPointerException.
		// int temp = Integer.parseInt("B0B");
		// int[] three = new int[]{1, 2, 3};
		// int item = three[3];
		// ReallyBadClass rbc = new ReallyBadClass();
		// String item = rbc.nullString();
		// System.out.println("Line: " + item.toLowerCase() );
		// two choices - catch or throw (introduce ReallyBadClass)
		// try-catch examples
		/*
		 * int temp = 0; try { temp = Integer.parseInt("B0B"); } catch
		 * (NumberFormatException ex) { System.out.println("Caught exception: " +
		 * ex.getMessage()); temp = 10; } System.out.println("temp is: " + temp);
		 */
		/*
		 * String temp = null; try { System.out.println("" + temp.toString()); } catch
		 * (NullPointerException npe) { System.out.println("Temp string was null."); }
		 */
		ReallyBadClass rbc = new ReallyBadClass();
		try {
			rbc.throwIOOB("line 65 in main");
			rbc.throwEOFE("line 66 in main");
			rbc.throwFNFE("line 67 in main");
			System.out.println("Hi!");
		} catch (FileNotFoundException fnfe) {
			System.out.println("fnfe: " + fnfe.getMessage());
			fnfe.printStackTrace();
		} catch (IndexOutOfBoundsException | IOException ioAndOBE) {
			System.out.println("ioAndOBE: " + ioAndOBE.getMessage());
			ioAndOBE.printStackTrace();
		} finally {
			System.out.println("In finally");
		}
		// Common exception methods
		// catch specific to generic
		// multi-catch statement
		// finally (always run) clean up resources, close files
	}
}