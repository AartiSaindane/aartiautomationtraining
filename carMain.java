package prgmtest;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("No. Of car: "+Car.noOfCar);
		Car c1=new Car("A","A1");
		System.out.println("Car Details for C1:"+c1.getname()+" "+c1.getengine()+" "+c1.noOfCar);
	    Car c2=new Car("B","B2");
	    System.out.println("Car Details for C2:"+c2.getname()+" "+c2.getengine()+" "+c2.noOfCar);
	    Car c3=new Car("C","C3");
	    System.out.println("Car Details for C3:"+c3.getname()+" "+c3.getengine()+" "+c3.noOfCar);
	    System.out.println("No. Of car: "+Car.noOfCar);
	    Car.setcarno(5);
	    System.out.println("No. Of Car Static Method: "+Car.getcarno());
		System.out.println("Car Names"+Car.names);

	}

}
