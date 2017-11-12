package com.vraj.playground.patterns.decorator;

public class Mint extends ToppingDecorator {

	Beverage beverage;

	public Mint(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", mint";
	}

	@Override
	public double cost() {
		return 0.50 + beverage.cost();
	}

}
