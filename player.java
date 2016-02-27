public class Player {
	// ----------------------------------------------------------------------------
	// A virtual representation of a player in a card game.
	// ----------------------------------------------------------------------------
	private String name;

	public Player()
	// Default constructor for player class
	{
		Hand playerHand = new Hand();
	}

	private String getName()
	// Accessor method for the player's name
	{
		return name;
	}

	private void setName(String theName)
	// Mutator method for the player's name
	{
		name = theName;
	}

	void requestCard(Card theCard)
	// Requests a selected card from the opponent.
	{
		// not sure how to do this yet. Things are still kind of abstract
	}

}
