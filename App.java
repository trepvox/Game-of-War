package com.seanmyles.war;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
//			for (Card card: deck.cards) {
//				card.describe();
//			}	
	//	System.out.println(hand);		
				
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		dealCards(player1, player2, deck);
		
		
		
			 
		//both players flip a card  and display
		for (int p = 0; p < 26; p++) {
			Card p1Card = player1.flip();
			int p1Value = p1Card.getValue();
			System.out.println("Player 1's card is ");  
			p1Card.describe();
			Card p2Card = player2.flip();
			int p2Value = p2Card.getValue();
			System.out.println("Player 2's card is ");
			p2Card.describe();
			System.out.println();
		
		
		//Scoring system reading	
		if(p1Value > p2Value) {
			player1.incrementScore();
			System.out.println("Player 1 wins the round!");
			System.out.println("\t-------------------------------");
		}
		else if (p2Value > p1Value) {
			player2.incrementScore();
			System.out.println("Player 2 wins the round!");
			System.out.println("\t-------------------------------");
		}
		else {
			System.out.println("It's a tie!");
			System.out.println("\t-------------------------------");
		}	System.out.println();
	}	
		
		//compares final score for winner
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins with a score of " + player1.getScore() + " to " + player2.getScore() + ".");
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins with a score of " + player2.getScore() + " to " + player1.getScore() + ".");
		}
		else {
			System.out.println("It's a tie! with a score of " + player1.getScore() + " to " + player2.getScore() + "." );
		} 
		System.out.println("Now shake hands like good sports."); 
	}

	
	
	//how to deal cards
	private static void dealCards(Player player1, Player player2, Deck deck) {
		for (int i = 0; i < 26; i++) {
			player1.deal(deck);
			player2.deal(deck);
		}
	}

}
