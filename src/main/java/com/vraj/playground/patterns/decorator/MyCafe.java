/**
 * 
 */
package com.vraj.playground.patterns.decorator;

/**
 * My coffee shop.
 * 
 * @author vrajori
 *
 */
public class MyCafe {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage = new HotChoclate(beverage);
		System.out.println(
				"you coffee: " + beverage.getDescription() + ", is ready. You owe " + beverage.cost() + " dollars!");
	}
}
