package com.seanmyles.war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>(); 
		
	public Deck() {
		//numbers
		String[] value = new String[14];
		
				value[0] = null;
				value[1] = "Two";
				value[2] = "Three";
				value[3] = "Four";
				value[4] = "Four";
				value[5] = "Six";
				value[6] = "Seven";
				value[7] = "Eight";
				value[8] = "Nine";
				value[9] = "Ten";
				value[10] = "Jack";
				value[11] = "Queen";
				value[12] = "King";
				value[13] = "Ace";
		//suits		
		String[] names = new String[4];
				
				names[0] = " of Spades";
				names[1] = " of Diamonds";
				names[2] = " of Hearts";
				names[3] = " of Clubs";
		
		for (int i = 1; i <= 13; i++) {
			for (int j = 0; j <= 3; j++) {
				
				Card newCard = new Card();
				newCard.setName(value[i] + names[j]);
				newCard.setValue(i);
				cards.add(newCard);
			}
			
		}
		
		//how to shuffle the deck
		Collections.shuffle(cards);	
	}

		//draws the card from the deck
	public Card draw() {
		return cards.remove(0);
	}
		

		

	
	
	

	
		
		
			
	
}
