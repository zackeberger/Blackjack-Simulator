
public class Ace extends Card 
{
	
	private boolean soft;
	
	public Ace(String name, int value) 
	{
		super(name, value);
		this.soft = true;
	}
	
	// Has the same properties of card with the exception of the "soft" field.
	// If soft == true, the Ace has value 1. if soft == false, the Ace has value 11
	// Aces are originally worth 1 but can be upgraded or downgraded in value by the player
	
	public void changeSoft() 
	{
		this.soft = !this.soft;
	}
	
	public int getValue() 
	{
		if(soft == true) 
			return 1;
		else 
			return 11;
	}
	
}
