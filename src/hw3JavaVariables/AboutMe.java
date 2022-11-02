package hw3JavaVariables;

public class AboutMe {

	public float healthBattery;// variable declared.

	// from line below Variables Initialized
	public String name = "Nuzaira";
	public byte myAge = 40;
	public short annualTax = 10650;
	public int annualIncome = 120000;
	public long bankBalance = 4006780l;
	public float height = 5.8f;
	public double cgpa = 3.50;
	public char sex = 'f';
	public boolean billingual = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.name + "\nMy current age marks " + aboutMe.myAge
				+ "\nMy tax total in USD: " + aboutMe.annualTax + "\nMy current account balance in USD is: "
				+ aboutMe.bankBalance + "\nMy height is: " + aboutMe.height + "\nMy Cgpa is: " + aboutMe.cgpa
				+ "\nMy sex: " + aboutMe.sex + "\nAm I billingual: " + aboutMe.billingual);

	}
}