package polymorphisam;

public class Animal {
	public void makesound() {
		System.out.println("animal make sound");
	}
	public void makesound (String sound ) {
		System.out.println("the animal make sound " + sound);
	}
	
	class Dog extends Animal{
		public void makesound() {
			System.out.println("baoww baoww");
		}
		public void makesound (String angry) {
			System.out.println("angry dog be like " + angry );
		}
		}
	class Cat extends Animal{
		public void makesound() {
			System.out.println("the cat soud mew mew");
		}
	}

	public static void main(String[] args) {
		Animal animal= new Animal();
		animal.makesound();
		
		Dog dog = animal.new Dog();
		dog.makesound("yaaoooo ");
		dog.makesound();
		
		
		Cat cat = animal.new Cat();
		cat.makesound();
		cat.makesound("cat sound");

	}

}
