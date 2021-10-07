import java.util.Scanner;
import java.util.ArrayList;

public class PlayGame
	{
		
	    static	 ArrayList<Card> playerHand = new ArrayList<Card>();
			static int playerTotal=0;
			static int dealerTotal=0;
		static	ArrayList<Card> dealerHand = new ArrayList<Card>() ;
		
		public static void main(String[] args)
			{
				
				Deck.fillDeck();
				Deck.shuffle();
				//greetPlayer();
				deal();
				displayPlayerHand();
				hitOrStay();
				
			}
		
		public static void greetPlayer()
		{
				Scanner userStringInput = new Scanner (System.in); 
				System.out.println( " Hello! What is your name?");
				String name = userStringInput.nextLine();
				System.out.println( " Hello " + name + " Lets play Blackjack!");
		}
		
		public static void deal()
	
		{
	
		
      for (int i = 0; i<2; i++)
    	  {
    		  playerHand.add(Deck.deck.get(0));
				
				Deck.deck.remove(0);
				
	         
				
			   dealerHand.add(Deck.deck.get(0));
				
				Deck.deck.remove(0); 
    	  }
				
			
		}
			public static void displayPlayerHand()
			
			{
				
				
				
				System.out.println( "The players cards are ");

				for( int i = 0; i < playerHand.size(); i++ )
				{
					
					System.out.println( playerHand.get(i).getRank() + " of " + playerHand.get(i).getSuit());
					
					playerTotal+=(playerHand.get(i).getValue());
					
				}
	
				System.out.println( "The value of the player hand is worth " + playerTotal);
				
		
				System.out.println(" ");
				System.out.println( "The dealers cards are");
				
				for( int i = 0; i < dealerHand.size(); i++ )
					{
						System.out.println( dealerHand.get(i).getRank() + " of " + dealerHand.get(i).getSuit());
					
						dealerTotal += (dealerHand.get(i).getValue());
					}
					
				
				System.out.println( "The value of the dealer hand is worth " + dealerTotal);
				
			}
		
			public static void  hitOrStay()
			{
				System.out.println(" ");
				System.out.println( "Do you player want to hit or stay?");
				Scanner userStringInput = new Scanner (System.in); 
				String hitOrStay = userStringInput.nextLine();
				boolean playerHit = true;
				
				
				if ()
				{
					System.out.println( );
					System.out.println( playerHand.get(i).getRank() + " of " + playerHand.get(i).getSuit());
					
					playerHit = true;
					
				}
				
				
				
				
				
				
				
				
			}
			
		
				

			}





















