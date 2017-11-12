/**
 * 
 */
package com.vraj.playground.patterns.decorator;

/**
 * Base drink => Espresso
 * 
 * @author vrajori
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
