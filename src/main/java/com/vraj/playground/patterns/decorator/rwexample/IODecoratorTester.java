/**
 * 
 */
package com.vraj.playground.patterns.decorator.rwexample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author vrajori
 *
 */
public class IODecoratorTester {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int c1, c2;
		// with decorator
		try (InputStream lsr = new LowerCaseInputStreamReader(
				new BufferedInputStream(new FileInputStream("/Users/vrajori/Desktop/junkyard/test.log")))) {

			while ((c1 = lsr.read()) > 0) {
				System.out.print((char) c1);
			}
		}

		// without decorator
		try (InputStream lsr2 = new BufferedInputStream(
				new FileInputStream("/Users/vrajori/Desktop/junkyard/test.log"))) {
			while ((c2 = lsr2.read()) > 0) {
				System.out.print((char) c2);
			}
		}

	}

}
