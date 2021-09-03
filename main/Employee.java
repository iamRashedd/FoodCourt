package main;

public class Employee{
	private String name;
	private int empId;
	private double salary;
	
	public Employee(){
		
	}
	public Employee ( String name, int nid, double salary){
		this.name = name;
		this.empId = nid;
		this.salary = salary;
	}
	
	public void setName ( String name ){
		this.name = name;
	}
	
	public void setNid ( int nid ){
		this.empId = nid;
	}
	
	public void setSalary ( double salary ){
		this.salary = salary;
	}
	
	public String getName(){
		return this.name;
	}
	public int getNid(){
		return empId;
	}
	public double getSalary(){
		return this.salary;
	}
}


																																//	©	Rashedul_ISLAM