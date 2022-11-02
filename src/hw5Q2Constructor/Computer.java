package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	public String configuration;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + " Model: " + model + " Operating system: " + operatingSystem
				+ " Price: " + price + " Grade: " + grade + " and " + " Made in USA? " + " Ans: " + madeInUSA);
	}

	public Computer(String configuration) {
		this.configuration = configuration;
		System.out.println("Computer Configuration: " + configuration);
	}

}
