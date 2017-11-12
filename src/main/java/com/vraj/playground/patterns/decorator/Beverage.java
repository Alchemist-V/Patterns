/**
 * 
 */
package com.vraj.playground.patterns.decorator;

/**
 * Outline of a beverage.
 * 
 * @author vrajori
 *
 */
public abstract class Beverage {

	String description = "Description not found";

	// exercise pg. 99
	double sizeFactor = 1;

	public String getDescription() {
		return description;
	}

	public double getSizeFactor() {
		return sizeFactor;
	}

	public void setSizeFactor(double sizeFactor) {
		this.sizeFactor = sizeFactor;
	}

	public abstract double cost();
}
