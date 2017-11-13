/**
 * 
 */
package com.vraj.playground.patterns.decorator.rwexample;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Decorater to convert input stream to lower case.
 * 
 * @author vrajori
 *
 */
public class LowerCaseInputStreamReader extends FilterInputStream {

	protected LowerCaseInputStreamReader(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.InputStream#read()
	 */
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

}
