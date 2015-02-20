import java.util.*;
import java.math.*;

/**
	Class that represents a 52 card deck
*/
public class Deck {

	private ArrayList<Card> activeDeck;
	private ArrayList<Card> discardPile;
	private int cardsLeft=52;
	
	/**
		No arg constructor that initialized the cards in activeDeck, sets
		the number of cards left in the activeDeck to 52, and creates a new
		arraylist of Cards called discardPile.
	*/
	public Deck(){
		activeDeck=new ArrayList(Arrays.asList(new Card(2,"D"), new Card(2,"H"), 
		new Card(2,"C"),new Card(2,"S"), new Card(3,"D"), new Card(3,"H"), 
		new Card(3,"C"),new Card(3,"S"), new Card(4,"D"), new Card(4,"H"), 
		new Card(4,"C"),new Card(4,"S"), new Card(5,"D"), new Card(5,"H"), 
		new Card(5,"C"),new Card(5,"S"), new Card(6,"D"), new Card(6,"H"), 
		new Card(6,"C"),new Card(6,"S"), new Card(7,"D"), new Card(7,"H"), 
		new Card(7,"C"),new Card(7,"S"), new Card(8,"D"), new Card(8,"H"), 
		new Card(8,"C"),new Card(8,"S"), new Card(9,"D"), new Card(9,"H"), 
		new Card(9,"C"),new Card(9,"S"), new Card(10,"D"), new Card(10,"H"), 
		new Card(10,"C"),new Card(10,"S"), new Card(11,"D"), new Card(11,"H"), 
		new Card(11,"C"),new Card(11,"S"), new Card(12,"D"), new Card(12,"H"), 
		new Card(12,"C"),new Card(12,"S"), new Card(13,"D"), new Card(13,"H"), 
		new Card(13,"C"),new Card(13,"S"), new Card(14,"D"), new Card(14,"H"), 
		new Card(14,"C"),new Card(14,"S")));
		cardsLeft=52;
		discardPile=new ArrayList<Card>();
	}
	
	/**
		Adds all of the cards in the hand to the discard pile.
		@param hand the hand to be discarded
	*/
	
	public void addToDiscardPile(Hand hand){
		for(Card c:hand)
			discardPile.add(c);
	}
	
	/**
		Returns activeDeck.
	*/
	public ArrayList<Card> getActiveDeck(){
		return activeDeck;
	}
	
	/**
		Returns a Hand of 5 random Cards.
	*/
	public Hand dealCards(){
		Hand hand=new Hand();
		for(int i=0;i<5;i++)
		{
			int randomNum=(int)(Math.random()*(cardsLeft));
			Card drawnCard=this.getActiveDeck().get(randomNum);
			activeDeck.remove(drawnCard);
			hand.add(drawnCard);
			cardsLeft--;
		}
		return hand;
	}
	
	/**
		Adds all of the Cards in discardPile to activeDeck. 
	*/
	public void reShuffle(){
		for(Card c:discardPile)
			activeDeck.add(c);
	}
	
	
	
}