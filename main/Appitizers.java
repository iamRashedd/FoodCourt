package main;

public class Appitizers extends FoodItem{
	protected String size;
	
	public Appitizers(){
		
	}
	public Appitizers ( String name, String fid, int quantity, double price, String size ){
		super ( name, fid, quantity, price );
		this.size = size;
	}
	
	public void setSize ( String size ){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	
	public void showInfo(){
		
		System.out.println ( );
		System.out.println ( "###" );
		System.out.println ( "Food Id: " + fid );
		System.out.println ( "Food Name: " + name );
		System.out.println ( "Food Size: " + size );
		System.out.println ( "Available Quantity: " + availableQuantity );
		System.out.println ( "Food Price : " + price );
		System.out.println ( );
	}
}


																																//	©	Rashedul_ISLAM