
public class Dealer extends Hand 
{
	private boolean stop;
	private boolean bust;

	public Dealer() 
	{
		this.stop = false;
		this.bust = false;
	}

	// Determines if the dealer will hit or stay.
	public void hitOrStay() 
	{
		if (getHandValue() < 17) 
		{
			stop = true;
		} 
		else if (getHandValue() >= 17 && getHandValue() < 22) 
		{
			stop = false;
		} 
		else 
		{
			stop = false;
			bust = true;
		}
	}

	// Determines if the dealer will continue playing.
	public boolean playStatus() 
	{
		return this.stop;
	}

	public boolean getBust() 
	{
		return this.bust;
	}

}
