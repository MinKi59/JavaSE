package section10.access2;

import section10.access1.Car;

public class SportsCar extends Car{
	private boolean isOpen;
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("isOpen: " + isOpen);
	}
	
	
}
