import java.util.*;

public class Blackjack 
{
	
	private Deck deck = new Deck();
	private Dealer dealer = new Dealer();
	private Hand user = new Hand();
	
	
	public Blackjack()
	{
		// Default constructors
	}
	
	public void play()
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n------------------------------------------");
		System.out.println("\nWelcome to Blackjack! The Rules:");
		
		System.out.println(
				"\t- Type \"hand\" to see your cards. \n\t- Type \"val\" for a numeric value of your hand.");
		System.out.println(
				"\t- Aces are initially valued at 1. You can toggle the value of an ace between 1 and 11 with the command \"ace\".");
		System.out.println("\t- You can either \"hit\" to get another card, or \"stay\" to end your turn.");
		System.out.println("\nType \"new\" or \"quit\".");

		String command = s.nextLine();

		while (!command.equalsIgnoreCase("quit")) 
		{

			if (command.equalsIgnoreCase("new")) 
			{
				blackjack();
				System.out.println("\nPlay again? Type \"new\" or \"quit\"");
			} 
			else 
				System.out.println("Please enter a valid input");

			command = s.nextLine();
		}

		
		System.out.println("\nThank you for playing Blackjack!\n");
		System.out.println("------------------------------------------\n");

	}

	
	// The Blackjack game.
	private void blackjack() 
	{
		deck.shuffle();

		Scanner s = new Scanner(System.in);

		// Dealer receives two cards.
		dealer.addCard(deck.getCard());
		dealer.addCard(deck.getCard());

		
		// Sees if dealer has blackjack.
		boolean dealerBlackjack = dealer.blackjack();

		
		// If dealer does not have blackjack, dealer hits if hand value is below 17.
		// Otherwise, stays.
		// If dealer has blackjack, hand value is set to 21 by upgrading the ace's value
		// to 11 from 1.
		if (dealerBlackjack == false) 
		{
			dealer.hitOrStay();

			while (dealer.playStatus()) 
			{
				dealer.addCard(deck.getCard());
				dealer.hitOrStay();
			}
		} 
		else 
		{
			if (dealer.getHand().get(0) instanceof Ace) 
			{
				dealer.getHand().get(0).changeSoft();
			} 
			else if (dealer.getHand().get(1) instanceof Ace) 
			{
				dealer.getHand().get(1).changeSoft();
			}
		}
		

		// Player receives two cards.
		user.addCard(deck.getCard());
		user.addCard(deck.getCard());

		System.out.println("\nThe dealer has dealt you two cards: " + user.seeHand());

		
		String play = s.nextLine();

		
		// Player options for what to do.
		while (!play.equalsIgnoreCase("stay")) 
		{

			if (play.equalsIgnoreCase("hand")) 
			{
				System.out.println(user.seeHand());
			} 
			else if (play.equalsIgnoreCase("val")) 
			{
				System.out.println(user.getHandValue());
			} 
			else if (play.equalsIgnoreCase("hit")) 
			{

				Card subject = deck.getCard();

				System.out.println(subject.getName() + " added to hand");
				user.addCard(subject);

			} 
			else if (play.equalsIgnoreCase("ace")) 
			{
				if (user.hasAces()) 
				{

					Scanner scan = new Scanner(System.in);

					for (int i = 0; i < user.getHand().size(); i++) 
					{
						if (user.getHand().get(i) instanceof Ace) 
						{
							System.out.println(user.getHand().get(i).getName() + " currently valued at: "
									+ user.getHand().get(i).getValue());
							
							System.out.println("Change value? \"yes\" or type \"no\"");
							
							String answer = scan.nextLine();

							if (answer.equalsIgnoreCase("yes")) 
							{
								user.getHand().get(i).changeSoft();
							}

							System.out.println(user.getHand().get(i).getName() + " now valued at: "
									+ user.getHand().get(i).getValue());
						}
					}
				} 
				else 
				{
					System.out.println("You have no aces");
				}
			} 
			else 
			{
				System.out.println("Please enter a valid input");
			}

			if (user.getHandValue() > 21) 
			{
				System.out.println("Hand value: " + user.getHandValue() + ". You busted -- you lose!");
				
				break;
			}

			play = s.nextLine();
		}

		
		// End of game determination: victory, loss, tie.
		if (user.getHandValue() > 21) 
		{
			user.changeBustStatus();
		} 
		else 
		{

			System.out.println("Dealer's Hand: " + dealer.seeHand() + ", valued at " + dealer.getHandValue());
			System.out.println("Your hand: " + user.seeHand() + ", valued at " + user.getHandValue() + "\n");

			if (dealer.getHandValue() == user.getHandValue()) 
			{
				System.out.println("It's a tie!");
			} 
			else if (dealer.getBust() && user.getBust()) 
			{
				System.out.println("You and the dealer busted -- It's a tie!");
			} 
			else if (dealer.getBust() && !user.getBust()) 
			{
				System.out.println("Dealer busted -- you win!");
			} 
			else if (!dealer.getBust() && user.getBust()) 
			{
				System.out.println("You busted -- you lose!");
			} 
			else if (dealer.getHandValue() > user.getHandValue()) 
			{
				System.out.println("Dealer wins!");
			} 
			else if (dealer.getHandValue() < user.getHandValue()) 
			{
				System.out.println("You beat the house! Congratulations!");
			}
		}
	}
}
