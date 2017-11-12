package com.vraj.playground.patterns.decorator;

public class HotChoclate extends ToppingDecorator {

	Beverage beverage;

	public HotChoclate(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", hot choclate";
	}

	@Override
	public double cost() {
		return (0.20 + beverage.cost()) * beverage.getSizeFactor();
	}

}
