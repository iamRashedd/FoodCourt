package menu;
import interfaces.EmployeeOperations;
import main.Employee;
import main.FoodCourt;
import java.util.Scanner;

public class employeeSelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	EmployeeOperations e = new FoodCourt();
	
	public employeeSelection(){
		
		do{
			menu.employeeOptions();
			option = scan.nextByte();
			scan.skip( "\\R" );
			System.out.println ();
			
			switch( option ){
				
				case 1:
					e.insertEmployee( newEmployee() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter employee to get: " );
					int empId = scan.nextInt();
					Employee temp = e.getEmployee( empId );
					if ( temp != null )
						e.removeEmployee( temp );
					else
						System.out.println ( "Employee not Found" );
					break;
				
				case 3:
					e.showAllEmployees();
					break;
				
				case 4:
					System.out.print ( "\n>>Enter employee to get: " );
					int empId2 = scan.nextInt();
					Employee temp2 = e.getEmployee( empId2 );
					if ( temp2 != null )
						showDetails ( temp2 );
					else
						System.out.println ( "Employee not Found" );
					break;
				
				case 5:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=5 );
	}
	
	private Employee newEmployee (){
		
		System.out.print ( "Enter Employee Name: " );
		String name = scan.nextLine();
		System.out.print ( "Enter Employee NID: " );
		int nId = scan.nextInt();
		System.out.print ( "Enter Employee salary: " );
		double salary = scan.nextDouble();
		
		Employee emp = new Employee( name, nId, salary );
		return emp;
	}
	
	private void showDetails ( Employee emp ){
		System.out.println( "\t\t#####");
		System.out.println ( " Employee ID: " + emp.getNid() );
		System.out.println ( " Employee Name: " + emp.getName() );
		System.out.println( " Employee Salary: "+ emp.getSalary() );
		System.out.println();
	}
}


																																//	©	Rashedul_ISLAM