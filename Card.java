package com.seanmyles.war;

public class Card {

	private int value;
	// needs to be int so the numbers will beat out instead of trying to alphabetize
	private String name;
	
	// the numbers of the cards
		public int getValue() {
			return value;
	}
		public void setValue(int value) {
			this.value = value;
	}
	
	// the names of the suits for each card
		public String getName() {
			return name;
	}
		public void setName(String name) {
			this.name = name;
	}

	
	public void describe() {

		System.out.print("\tThe " + name + ",");
		System.out.print("and has a value of " + value + ".");
		System.out.println();
	}
	
}
