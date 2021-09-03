package main;
import interfaces.FoodItemOperations;

public class Restaurant implements FoodItemOperations{
	private String name;
	private int rId;
	private FoodItem fooditems[] = new FoodItem[10];
	
	public Restaurant(){
		
	}
	public Restaurant( String name, int rid){
		this.name = name;
		this.rId = rid;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	public void setRid( int rid ){
		this.rId = rid;
	} 
	
	public String getName(){
		return this.name;
	}
	public int getRid(){
		return rId;
	}
	
	public void insertFoodItem( FoodItem f){
		
		for ( int i=0; i<fooditems.length; i++ ){
			
			if ( fooditems[i] == null ){
				fooditems[i] = f;
				System.out.println ( "FoodItem inserted successfully" );
				break;
			}
		}
	}
	public void removeFoodItem( FoodItem f){
		
		for ( int i=0; i<fooditems.length; i++ ){
			
			if ( fooditems[i] == f ){
				fooditems[i] = null;
				System.out.println ( "FoodItem removed successfully" );
				break;
			}
		}
	}
	public FoodItem getFoodItem ( String fid ){
		
		boolean notFound = true;
		for ( int i=0; i<fooditems.length; i++ ){
			
			String temp = fooditems[i].getFid();
			if ( temp.equals( fid ) ){
				System.out.println ( "FoodItem found" );
				notFound = false;
				return fooditems[i];
			}
		}
		
		if ( notFound )
			System.out.println ( "FoodItem not found" );
		
		return null;
	}
	public void showAllFoodItems(){
		
		System.out.println( "Showing all FoodItems:..... " );
		boolean isEmpty = true;
		for ( int i=0; i<fooditems.length; i++ ){
			
			if ( fooditems[i] != null ){
				
				fooditems[i].showInfo();
				isEmpty = false;
			}
		}
		if( isEmpty ){
			System.out.println( "No FoodItems to Show" );
		}
	}
}


																																//	©	Rashedul_ISLAM