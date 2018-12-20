import java.util.Scanner;

public class Casino 
{

	public static void main(String[] args) 
	{
		Scanner s = null;
		s = new Scanner(System.in);

		homescreen();

		// Get user input for game selection.
		String entryCommand = s.nextLine();

		while (!entryCommand.equalsIgnoreCase("quit")) 
		{

			// Entry into the Blackjack game.
			if (entryCommand.equalsIgnoreCase("Blackjack")) 
			{
				Blackjack game = new Blackjack();
				game.play();
				
				homescreen();
			} 
			else 
			{
				System.out.println("Please enter a valid input");
			}

			entryCommand = s.nextLine();

		}

		System.out.println("\nThank you for visiting B Street Casino! Come back soon!");

	}
	
	public static void homescreen()
	{
		System.out.println("Welcome to B Street Casino, now with these games: \n - Blackjack");
		System.out.println("\nType a game name to play OR \"quit\" to exit.");
	}
}
