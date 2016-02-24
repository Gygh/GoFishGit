
public class Deck {
	
	private Card[] deck;

	//Constructor to create a standard 52 card deck
	public Deck() 
	{
		deck = new Card[52];
		int count = 0;
		
		//Fills the deck with cards
		for(int suit = 0; suit<=3; suit++) 
		{
			for(int value = 1; value <= 13; value++) 
			{
				deck[count] = new Card(value, suit);
				count++;
			}
		}	
	}
	
}
