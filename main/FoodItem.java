package main;
import interfaces.IQuantity;

public abstract class FoodItem implements IQuantity{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public FoodItem(){
		
	}
	public FoodItem ( String name, String fid, int quantity, double price ){
		this.name = name;
		this.fid = fid;
		this.availableQuantity = quantity;
		this.price = price;
	}
	
	public void setFid ( String fid ){
		this.fid = fid;
	}
	public void setName ( String name ){
		this.name = name;
	}
	public void setAvailableQuantity ( int quantity ){
		this.availableQuantity = quantity;
	}
	public void setPrice ( double price ){
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public String getFid(){
		return fid;
	}
	public double getPrice(){
		return this.price;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public abstract void showInfo();
	
	public void addQuantity ( int amount ){
		
		availableQuantity += amount;
		System.out.println ( "Food Item added successfully" );
		
	}
	public void sellQuantity ( int amount ){
		
		if ( availableQuantity >= amount ){
			availableQuantity -= amount;
			System.out.println ( "Food Item sold successfully" );
		}
		else{
			System.out.println ( "\t##Insufficient Amount" );
		}
	}
}


																																//	©	Rashedul_ISLAM