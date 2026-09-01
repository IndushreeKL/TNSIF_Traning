package org.tnsif.acce.c2tc.interfacedemo;

interface Vehicle{
	void start();
	void stop();
	final static int Max_Speed=120;
	
	default void repair() {
		System.out.println("We provide repair service");
	}
	static void checkMaintainance() {
		System.out.println("Vehicle Maintainance taken care here");
	}
}
class Car implements Vehicle{

	private String model;
	
	Car(String model){
		this.model=model;
	}
@Override
public void start() {
	System.out.println("car"+ model+"starting");	
}

@Override
public void stop() {
	System.out.println("car"+ model+"stopping");
}
@Override
public void repair() {
    System.out.println("Car " + model + " repair service ");
}

}
class Bike implements Vehicle{

	private String model;
	
	Bike(String model){
		this.model=model;
	}
@Override
public void start() {
	System.out.println("Bike"+model+"starting");	
}

@Override
public void stop() {
	System.out.println("Bike"+ model +" stopping ");
	
}
@Override
public void repair() {
    System.out.println("Bike " + model + " repair service");
}

}
public class Default_Static_Demo {

	public static void main(String[] args) {
		Vehicle car=new Car("BMW");
		Vehicle bike=new Bike("Royal Enfield");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		car.repair(); //calling default methods //can override
		bike.repair();
		
		Vehicle.checkMaintainance();//calling static methods
		
		System.out.println("MaxSpeed" + Vehicle.Max_Speed);
	}
}