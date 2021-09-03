package main;
import interfaces.*;

public class FoodCourt implements EmployeeOperations,RestaurantOperations{
	
	private static Restaurant restaurants[] = new Restaurant[10];
	private static Employee employees[] = new Employee[10];
	
	public void insertRestaurant( Restaurant r){
		
		for ( int i=0; i<restaurants.length; i++ ){
			
			if ( restaurants[i] == null ){
				restaurants[i] = r;
				System.out.println ( "Restaurant inserted successfully" );
				break;
			}
		}
		
	}
	public void removeRestaurant( Restaurant r){
		
		for ( int i=0; i<restaurants.length; i++ ){
			
			if ( restaurants[i] == r ){
				restaurants[i] = null;
				System.out.println ( "Restaurant removed successfully" );
				break;
			}
		}
	}
	public Restaurant getRestaurant ( int rid ){
		
		for ( int i=0; i<restaurants.length; i++ ){
			if ( restaurants[i] == null)
				continue;
			else if ( restaurants[i].getRid() == rid ){
				System.out.println ( "Restaurant Found" );
				return restaurants[i];
			}
		}
		
		return null;
	}
	public void showAllRestaurants(){
		
		System.out.println( "Showing all restaurants:..... " );
		boolean isEmpty = true;
		for ( int i=0; i<restaurants.length; i++ ){
			
			if ( restaurants[i] != null ){
				System.out.println( "\t\t#####");
				System.out.println ( " Restaurant ID: " + restaurants[i].getRid() );
				System.out.println ( " Restaurant Name: " + restaurants[i].getName() );
				System.out.println();
				isEmpty = false;
			}
		}
		if( isEmpty ){
			System.out.println( "No Restaurants to Show" );
		}
	}
	
	public void insertEmployee( Employee e){
		
		for ( int i=0; i<employees.length; i++ ){
			
			if ( employees[i] == null ){
				employees[i] = e;
				System.out.println ( "Employee inserted successfully" );
				break;
			}
		}
	}
	public void removeEmployee( Employee e){
		
		for ( int i=0; i<employees.length; i++ ){
			
			if ( employees[i] == e ){
				employees[i] = null;
				System.out.println ( "Employee removed successfully" );
				break;
			}
		}
	}
	public Employee getEmployee ( int empId ){
		
		for ( int i=0; i<employees.length; i++ ){
			if ( employees[i] == null)
				continue;
			else if ( employees[i].getNid() == empId ){
				System.out.println ( "Employee found" );
				return employees[i];
			}
		}
		
		return null;
	}
	public void showAllEmployees(){
		
		System.out.println( "Showing all employees:..... " );
		boolean isEmpty = true;
		for ( int i=0; i<employees.length; i++ ){
			
			if ( employees[i] != null ){
				System.out.println( "\t\t#####");
				System.out.println ( " Employee ID: " + employees[i].getNid() );
				System.out.println ( " Employee Name: " + employees[i].getName() );
				System.out.println( " Employee Salary: "+ employees[i].getSalary() );
				System.out.println();
				isEmpty = false;
			}
		}
		if( isEmpty ){
			System.out.println( "No Employees to Show" );
		}
	}
	
	
}


																																//	©	Rashedul_ISLAM