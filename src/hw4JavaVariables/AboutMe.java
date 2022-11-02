package hw4JavaVariables;

public class AboutMe {
	public String name;
	public byte myAge;
	public short annualTax;
	public int annualIncome;
	public long bankBalance;
	public float height;
	public double cgpa;
	public char sex;
	public boolean billingual;

	//constructor is declared here.
	public AboutMe() {
		System.out.println("This is all about us: ");
	}

	public void aboutMe() {
		System.out.println("My name: " + name + "\nAge: " + myAge + "\nAnnual Tax: " + annualTax + "\nAnnual Income: "
				+ annualIncome + "\nBank Balance: " + bankBalance + "\nHeight:" + height + "\nCGPA: " + cgpa + "\nSex: "
				+ sex + "\nBillingual: " + billingual);

	}

}
