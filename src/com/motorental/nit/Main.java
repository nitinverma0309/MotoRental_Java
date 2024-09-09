package com.motorental.nit;

public class Main {

	public static void main(String[] args) {
		
		CarRentalSystem crs = new CarRentalSystem();
		
		Car car1 = new Car("C001","Toyota", "Innova", 70);
		Car car2 = new Car("C002","Hyundai", "Alto", 90);
		Car car3 = new Car("C003","Mahindra", "Thar", 150);
		crs.addCar(car1);
		crs.addCar(car2);
		crs.addCar(car3);
		
		crs.menu();

	}

}
