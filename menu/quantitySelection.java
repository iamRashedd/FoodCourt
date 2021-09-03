package menu;
import interfaces.FoodItemOperations;
import interfaces.RestaurantOperations;
import interfaces.IQuantity;
import main.*;
import java.util.Scanner;

class quantitySelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	FoodItemOperations f = new Restaurant();
	RestaurantOperations r = new FoodCourt();
	FoodItem food ;
	IQuantity q ;
	int amount;
	int iq;
	int rId;
	
	public quantitySelection(){
		
		do{
			menu.quantityOptions();
			option = scan.nextByte();
			scan.skip("\\R");
			System.out.println ();
			
			switch( option ){
				
				case 1:
					if ( input() ){
						q = food;
						iq = food.getAvailableQuantity();
						System.out.print ( "\n>>Enter amount to add: " );
						amount = scan.nextInt();
						q.addQuantity ( amount );
						if ( iq < food.getAvailableQuantity() )
							writeFile( amount, "Added: " );
					}
					else
						System.out.println ( "Please add specific Restaurant or FoodItem first" );
					break;
				
				case 2:
					if ( input() ){
						q = food;
						iq = food.getAvailableQuantity();
						System.out.print ( "\n>>Enter amount to sell: " );
						amount = scan.nextInt();
						q.sellQuantity ( amount );
						if ( iq > food.getAvailableQuantity() )
							writeFile( amount, "Sold: " );
					}
					else
						System.out.println ( "Please add specific Restaurant or FoodItem first" );
					break;
					
				case 3:
					System.out.println ( "Showing Add-Sell History..." );
					System.out.println ();
					showHistory();
					break;
				
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private boolean input(){
		boolean found = false;
		r.showAllRestaurants();
		System.out.print ( "Enter Restaurant ID: ");
		rId = scan.nextInt();
		f = r.getRestaurant( rId );
		if ( f != null ){
			scan.skip("\\R");
			f.showAllFoodItems();
			System.out.print ( "Enter FoodItem ID: ");
			String fId = scan.nextLine();
			fId = fId.trim();
			food = f.getFoodItem( fId );
			if ( food != null )
					found = true;
			else
				System.out.println ( "FoodItem not found" );
		}
		else
			System.out.println ( "Restaurant not Found" );
		return found;
	}
	
	private void writeFile ( int amount, String work ){
		file.editFile ( rId , food.getName() , food.getFid() , work , amount ); 
	}
	
	private void showHistory(){
		r.showAllRestaurants();
		System.out.print ( "Enter Restaurant ID: ");
		int rId = scan.nextInt();
		f = r.getRestaurant( rId );
		if ( f != null ){
			file.showDetails ( rId );
		}	
		else
			System.out.println ( "Restaurant not Found" );
	}
}


																																//	©	Rashedul_ISLAM