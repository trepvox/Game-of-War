package com.seanmyles.war;

import java.util.ArrayList;
import java.util.List;

public class Player {
 
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	

	//players hand
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
//		this.score = score;
	}
	
	//setting players score
	public void setScore() {
//		this.score= score;
	}

	public int getScore() {
		return score;
	}

	//to add to the players score
	public void incrementScore() {
		this.score++;
	}
	//removes card from hand and shows it
	public Card flip() {
		return hand.remove(0);
	}
	
	
	//
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void deal(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void describe() {
		System.out.println(name);
		System.out.println(hand);
	}
}



