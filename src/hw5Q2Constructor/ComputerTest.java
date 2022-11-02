package hw5Q2Constructor;


public class ComputerTest {

	public static void main(String[] args) {
		Computer user1 = new Computer();// Deafult contructor initialized in this line.
		Computer user2 = new Computer("Apple,", "MacBook Air,", "MacOS Mojave,", 800, 'A', false);
		Computer user3 = new Computer("Lenovo,", "Yoga 7i,", "Windows 11 Home 64,", 1200, 'A', false);
		Computer configuration = new Computer(
				"macOS Big Sur" + "\nMacBook Pro 15 inch Processor 2.2GHz 6-Core Intel i7 16 GB");

	}

}
