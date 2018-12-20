import java.util.ArrayList;

// Hand object, representing the hand of a player.

public class Hand 
{

	private ArrayList<Card> deck = new ArrayList<Card>();
	private boolean bust;

	public Hand() 
	{
		this.bust = false;
	}

	public ArrayList<Card> getHand() 
	{
		return this.deck;
	}

	// Utility method exploited in the Dealer class. Aces start at value of 1. If
	// the dealer gets Blackjack, this method upgrades the ace's value to 11, giving
	// the dealer an overall hand value of 21.
	public boolean blackjack() 
	{
		if (this.deck.size() == 2) 
		{
			if ((this.deck.get(0) instanceof Ace || this.deck.get(1) instanceof Ace) && getHandValue() == 11) 
				return true;
			else 
				return false;	
		} 
		else 
		{
			return false;
		}
	}

	public void addCard(Card c) 
	{
		deck.add(c);
	}

	// Permits the player to see the cards in their hand.
	public String seeHand() 
	{
		String handContent = deck.get(0).getName();

		for (int i = 1; i < deck.size(); i++) 
		{
			handContent = handContent + ", " + deck.get(i).getName();
		}

		return handContent;
	}

	// Returns a number value of the cards in a player's hand.
	public int getHandValue() 
	{
		int handValue = 0;

		for (int i = 0; i < deck.size(); i++) 
		{
			handValue = handValue + deck.get(i).getValue();
		}

		return handValue;
	}

	public boolean getBust() 
	{
		return this.bust;
	}

	// Changes the status of whether a player has busted.
	public void changeBustStatus() 
	{
		this.bust = true;
	}

	// Utility method used in the "ace change" function.
	public boolean hasAces() 
	{
		return seeHand().contains("Ace");
	}

}
