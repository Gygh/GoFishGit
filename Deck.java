
public class Deck {

	private Card[] deck;
	
	public Deck() {
		
		deck = new Card[52];
		int count = 0;
		
		for(int suit = 0; suit<3; suit++) 
		{
			for(int value = 1; value <= 13; value++) 
			{
				deck[count] = new Card(value, suit);
				count++;
			}
		}	
	}
	
	
	
	
}
