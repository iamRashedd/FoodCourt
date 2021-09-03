package menu;
import java.util.Scanner;

public class mainSelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	
	public mainSelection(){
		
		do{
			menu.mainOptions();
			option = scan.nextByte();
			scan.skip("\\R");
			System.out.println ();
			
			switch( option ){
				
				case 1:
					new employeeSelection();
					break;
				
				case 2:
					new restaurantSelection();
					break;
				
				case 3:
					new foodItemSelection();
					break;
				
				case 4:
					new quantitySelection();
					break;
				
				case 5:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=5 );
	}
}


																																//	©	Rashedul_ISLAM