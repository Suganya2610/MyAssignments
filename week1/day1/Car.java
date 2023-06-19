package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("Print driveCar");
	}
	
	public void applyBrake() {
		System.out.println("Print applyBrake");
	}
	
	public void soundHorn() {
		System.out.println("Print soundHorn");
	}
	
	public void isPuncture() {
		System.out.println("Print isPuncture");
	}
	
	public static void main(String[] args) {
		Car car= new Car();
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		car.isPuncture();
	}
}
