import java.util.ArrayList;

// Object representing a 52 card deck.

public class Deck 
{

	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() 
	{
		Ace spadeAce = new Ace("Ace of spades", 11);
		Ace clubAce = new Ace("Ace of clubs", 11);
		Ace diamondAce = new Ace("Ace of diamonds", 11);
		Ace heartAce = new Ace("Ace of hearts", 11);
		deck.add(spadeAce);
		deck.add(clubAce);
		deck.add(diamondAce);
		deck.add(heartAce);

		Card spadeTwo = new Card("2 spade", 2);
		Card clubTwo = new Card("2 club", 2);
		Card diamondTwo = new Card("2 diamond", 2);
		Card heartTwo = new Card("2 heart", 2);
		deck.add(spadeTwo);
		deck.add(clubTwo);
		deck.add(diamondTwo);
		deck.add(heartTwo);

		Card spadeThree = new Card("3 spade", 3);
		Card clubThree = new Card("3 club", 3);
		Card diamondThree = new Card("3 diamond", 3);
		Card heartThree = new Card("3 heart", 3);
		deck.add(spadeThree);
		deck.add(clubThree);
		deck.add(diamondThree);
		deck.add(heartThree);

		Card spadeFour = new Card("4 spade", 4);
		Card clubFour = new Card("4 club", 4);
		Card diamondFour = new Card("4 diamond", 4);
		Card heartFour = new Card("4 heart", 4);
		deck.add(spadeFour);
		deck.add(clubFour);
		deck.add(diamondFour);
		deck.add(heartFour);

		Card spadeFive = new Card("5 spade", 5);
		Card clubFive = new Card("5 club", 5);
		Card diamondFive = new Card("5 diamond", 5);
		Card heartFive = new Card("5 heart", 5);
		deck.add(spadeFive);
		deck.add(clubFive);
		deck.add(diamondFive);
		deck.add(heartFive);

		Card spadeSix = new Card("6 spade", 6);
		Card clubSix = new Card("6 club", 6);
		Card diamondSix = new Card("6 diamond", 6);
		Card heartSix = new Card("6 heart", 6);
		deck.add(spadeSix);
		deck.add(clubSix);
		deck.add(diamondSix);
		deck.add(heartSix);

		Card spadeSeven = new Card("7 spade", 7);
		Card clubSeven = new Card("7 club", 7);
		Card diamondSeven = new Card("7 diamond", 7);
		Card heartSeven = new Card("7 heart", 7);
		deck.add(spadeSeven);
		deck.add(clubSeven);
		deck.add(diamondSeven);
		deck.add(heartSeven);

		Card spadeEight = new Card("8 spade", 8);
		Card clubEight = new Card("8 club", 8);
		Card diamondEight = new Card("8 diamond", 8);
		Card heartEight = new Card("8 heart", 8);
		deck.add(spadeEight);
		deck.add(clubEight);
		deck.add(diamondEight);
		deck.add(heartEight);

		Card spadeNine = new Card("9 spade", 9);
		Card clubNine = new Card("9 club", 9);
		Card diamondNine = new Card("9 diamond", 9);
		Card heartNine = new Card("9 heart", 9);
		deck.add(spadeNine);
		deck.add(clubNine);
		deck.add(diamondNine);
		deck.add(heartNine);

		Card spadeTen = new Card("10 spade", 10);
		Card clubTen = new Card("10 club", 10);
		Card diamondTen = new Card("10 diamond", 10);
		Card heartTen = new Card("10 heart", 10);
		deck.add(spadeTen);
		deck.add(clubTen);
		deck.add(diamondTen);
		deck.add(heartTen);

		Card spadeJack = new Card("Jack of spades", 10);
		Card clubJack = new Card("Jack of clubs", 10);
		Card diamondJack = new Card("Jack of diamonds", 10);
		Card heartJack = new Card("Jack of hearts", 10);
		deck.add(spadeJack);
		deck.add(clubJack);
		deck.add(diamondJack);
		deck.add(heartJack);

		Card spadeQueen = new Card("Queen of spades", 10);
		Card clubQueen = new Card("Queen of clubs", 10);
		Card diamondQueen = new Card("Queen of diamonds", 10);
		Card heartQueen = new Card("Queen of hearts", 10);
		deck.add(spadeQueen);
		deck.add(clubQueen);
		deck.add(diamondQueen);
		deck.add(heartQueen);

		Card spadeKing = new Card("King of spades", 10);
		Card clubKing = new Card("King of clubs", 10);
		Card diamondKing = new Card("King of diamonds", 10);
		Card heartKing = new Card("King of hearts", 10);
		deck.add(spadeKing);
		deck.add(clubKing);
		deck.add(diamondKing);
		deck.add(heartKing);

	}

	public ArrayList<Card> getDeckContents() 
	{
		return this.deck;
	}

	public void removeCard() 
	{
		this.deck.remove(0);
	}

	public Card getCard() 
	{
		Card receivedCard = this.deck.get(0);
		removeCard();
		
		return receivedCard;
	}

	// Shuffle function, exploiting the Math class's random number generator.
	public void shuffle() 
	{

		for (int i = 0; i < 1000; i++) 
		{
			int position1 = (int) (Math.random() * 52);
			int position2 = (int) (Math.random() * 52);
			Card temp = this.deck.get(position1);
			this.deck.set(position1, this.deck.get(position2));
			this.deck.set(position2, temp);
		}
	}
}
