package menu;
import interfaces.RestaurantOperations;
import main.Restaurant;
import main.FoodCourt;
import java.util.Scanner;

class restaurantSelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	RestaurantOperations r = new FoodCourt();
	
	public restaurantSelection(){
		
		do{
			menu.restaurantOptions();
			option = scan.nextByte();
			scan.skip("\\R");
			System.out.println ();
			
			switch( option ){
				
				case 1:
					r.insertRestaurant( newRestaurant() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter Restaurant to get: " );
					int rId = scan.nextInt();
					Restaurant temp = r.getRestaurant( rId );
					if ( temp != null )
						r.removeRestaurant( temp );
					else
						System.out.println ( "Restaurant not Found" );
					break;
				
				case 3:
					r.showAllRestaurants();
					break;
				
				case 4:
					System.out.print ( "\n>>Enter Restaurant to get: " );
					int rId2 = scan.nextInt();
					Restaurant temp2 = r.getRestaurant( rId2 );
					if ( temp2 != null )
						showDetails ( temp2 );
					else
						System.out.println ( "Restaurant not Found" );
					break;
				
				case 5:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=5 );
	}
	
	private Restaurant newRestaurant (){
		
		System.out.print ( "Enter Restaurant Name: " );
		String name = scan.nextLine();
		System.out.print ( "Enter Restaurant ID: " );
		int rId = scan.nextInt();
		
		Restaurant res = new Restaurant( name, rId );
		return res;
	}
	private void showDetails ( Restaurant res ){
		System.out.println( "\t\t#####");
				System.out.println ( " Restaurant ID: "+res.getRid() );
				System.out.println ( " Restaurant Name: "+res.getName() );
				System.out.println();
	}
}


																																//	©	Rashedul_ISLAM