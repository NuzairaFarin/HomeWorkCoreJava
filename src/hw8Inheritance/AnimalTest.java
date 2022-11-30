package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("-----Animal Class-----");
		animal.animalInfo();
		Bird bird = new Bird();
		System.out.println("-----Bird Class-----");
		bird.birdInfo();
		bird.animalInfo();
		BullDog bullDog = new BullDog();
		System.out.println("-----BullDog Class-----");
		bullDog.bullDogInfo();
		bullDog.animalInfo();
		bullDog.dogInfo();
		Cobra cobra = new Cobra();
		System.out.println("-----Cobra  Class-----");
		cobra.cobraInfo();
		cobra.animalInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		Dog dog = new Dog();
		System.out.println("-----Dog Class-----");
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();
		Mammal mammal = new Mammal();
		System.out.println("-----Mammal Class-----");
		mammal.animalInfo();
		mammal.mammalInfo();
		Reptile reptile = new Reptile();
		System.out.println("-----Reptile Class-----");
		reptile.animalInfo();
		Robin robin = new Robin();
		System.out.println("-----Robin Class-----");
		robin.robinInfo();
		robin.animalInfo();
		robin.birdInfo();
		Snake snake = new Snake();
		System.out.println("-----Snake Class-----");
		snake.snakeInfo();
		snake.animalInfo();
		snake.reptileInfo();
		
	}

}
