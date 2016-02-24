public class Card {

	private static final int SPADE = 0;
	private static final int DIAMOND = 1;
	private static final int HEART = 2;
	private static final int CLUB = 3;

	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;

	private int value;
	private int suit;

	//Creates a card
	public Card(int theValue, int theSuit) 
	{
		this.value = theValue;
		this.suit = theSuit;
	}



} 