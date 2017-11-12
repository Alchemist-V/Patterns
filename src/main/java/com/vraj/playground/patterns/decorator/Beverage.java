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

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
