package main;

public class MainDish extends FoodItem{
	private String category;
	
	public MainDish(){
		
	}
	public MainDish( String name, String fid, int quantity, double price, String cat ){
		super ( name, fid, quantity, price );
		this.category = cat;
	}
	
	public void setCategory( String category ){
		this.category = category;
	}
	public String getCategory(){
		return category;
	}
	
	public void showInfo(){
		
		System.out.println ( );
		System.out.println ( "###" );
		System.out.println ( "Food Id: " + fid );
		System.out.println ( "Food Name: " + name );
		System.out.println ( "Food Category: " + category );
		System.out.println ( "Available Quantity: " + availableQuantity );
		System.out.println ( "Food Price : " + price );
		System.out.println ( );
	}
	
}

																																//	©	Rashedul_ISLAM