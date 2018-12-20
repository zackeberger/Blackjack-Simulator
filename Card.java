//Card object, representing an individual playing card.

public class Card 
{

	private String name;
	private int value;

	public Card(String name, int value) 
	{
		this.name = name;
		this.value = value;
	}

	public String getName() 
	{
		return this.name;
	}

	public int getValue() 
	{
		return this.value;
	}

	
	public void changeSoft() 
	{
		// Method used for the Ace class. Card is a parent to Ace, so this method is
		// necessary for polymorphic purposes.
	}
}
