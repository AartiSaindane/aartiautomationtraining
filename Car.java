package prgmtest;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private String name;
	private String engine;
	static int noOfCar;
	static List<String> names= new ArrayList();
	
	public Car(String name,String engine)
	
	{
        
		this.name=name;
		this.engine=engine;
		noOfCar++;
	}
	
	public static void setcarno(int n)
	{
		noOfCar=n;
	}
	public static int getcarno()
	{
		return noOfCar;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setengine(String engine)
	{
		this.engine=engine;
	}
	public String getname()
	{
		return name;
	}
	public String getengine()
	{
		return engine;
	}
	
	static {
		names.add("Nexon");
		names.add("TATA Punch");
		names.add("Thar");
		names.add("Creta");
	}
	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

