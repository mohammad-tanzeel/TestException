package com.test;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Class that throws exceptions
 * 
 * @author Scott Gray <sgray@ccsnh.edu>
 */
public class ReallyBadClass {
	/**
	 * FileNotFoundException is a child of IOException
	 * 
	 * @param msg
	 * @throws FileNotFoundException
	 *             with msg as message
	 */
	public void throwFNFE(String msg) throws FileNotFoundException {
		FileNotFoundException fnfe = new FileNotFoundException(msg);
		// throw fnfe;
	}

	/**
	*
	*/
	public void throwEOFE(String msg) throws EOFException {
		// throw new EOFException(msg);
	}

	/**
	*
	*/
	public void throwInputMi(String msg) throws InputMismatchException {
		// throw new EOFException(msg);
	}
	
	
	
	/**
	 * Generic IOException
	 * 
	 * @param msg
	 * @throws IOException
	 *             with msg as message
	 */
	public void throwIOE(String msg) throws IOException {
		// throw new IOException(msg);
	}

	/**
	 * Throws the runtime exception IndexOutOfBounds
	 * 
	 * @param msg
	 * @throws IndexOutOfBoundsException
	 *             with msg as message
	 */
	public void throwIOOB(String msg) throws IndexOutOfBoundsException {
		// throw new IndexOutOfBoundsException(msg);
	}

	/**
	 * Returns empty string
	 * 
	 * @return
	 */
	public String nullString() {
		return new String();
	}
}