package menu;
import interfaces.FoodItemOperations;
import interfaces.RestaurantOperations;
import main.*;
import java.util.Scanner;
class foodItemSelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	FoodItemOperations f = new Restaurant();
	RestaurantOperations r = new FoodCourt();
	
	public foodItemSelection(){
		
		do{
			menu.foodItemOptions();
			option = scan.nextByte();
			scan.skip("\\R");
			System.out.println ();
			
			if ( option > 0 && option <5){
				r.showAllRestaurants();
				System.out.print ( "Enter Restaurant ID: ");
				int rId = scan.nextInt();
				f = r.getRestaurant( rId );
				if ( f == null ){
					System.out.println ( "Restaurant not Found" );
					option = 10;
				}
			}
			switch( option ){
				
				case 1:
					System.out.println ( "\t1.Main Dish" );
					System.out.println ( "\t2.Appitizers" );
					System.out.print ( ">>Option: " );
					byte op2 = scan.nextByte();
					scan.skip("\\R");
					System.out.println ();
					if ( op2 == 1 || op2 == 2 )
						f.insertFoodItem ( newFoodItem( op2 ) );
					else
						System.out.println ( "\n###INVALID OPTION\n" );
					break;
				
				case 2:
					scan.skip("\\R");
					System.out.print ( "\n>>Enter FoodItem id to remove: " );
					String fid = scan.nextLine();
					fid = fid.trim();
					FoodItem temp = f.getFoodItem ( fid );
					if ( temp != null )
						f.removeFoodItem( temp );
					else
						System.out.println ( "FoodItem not Found" );
					break;
				
				case 3:
					f.showAllFoodItems();
					break;
				
				case 4:
					scan.skip("\\R");
					System.out.print ( "\n>>Enter FoodItem id to search: " );
					String fid2 = scan.nextLine();
					fid2 = fid2.trim();
					FoodItem temp2 = f.getFoodItem ( fid2 );
					if ( temp2 != null )
						temp2.showInfo();
					else
						System.out.println ( "FoodItem not Found" );
					break;
				
				case 5:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=5 );
	}
	
	private FoodItem newFoodItem ( byte op ){
		
		FoodItem food;
		System.out.print ( "Enter FoodItem Name: " );
		String name = scan.nextLine();
		System.out.print ( "Enter FoodItem ID: " );
		String fId = scan.nextLine();
		fId = fId.trim();
		System.out.print ( "Enter FoodItem Quantity: " );
		int quantity = scan.nextInt();
		System.out.print ( "Enter FoodItem Price: " );
		double price = scan.nextDouble();
		scan.skip("\\R");
		if ( op ==1 ){
			System.out.print ( "Enter MainDish category: " );
			String cat = scan.nextLine();
			food = new MainDish ( name, fId, quantity, price, cat );
		}
		else{
			System.out.print ( "Enter Apitizer size: " );
			String size = scan.nextLine();
			food = new Appitizers ( name, fId, quantity, price, size );
		}
		return food;
	}
}


																																//	©	Rashedul_ISLAM