package abstruction;

public abstract  class Animal
	{
		public abstract void makesound();
			
		public void sleep()
			{
				System.out.println("Zzzz");
			}
			
	}

class Dog extends  Animal
	{
		public void makesound()
			{
				System.out.println("boww bwoow");
				
			}
			public void eat()
			{
				System.out.println(" dog is eating ");
				
			}
	}

class Cat extends Animal
	{
		public void makesound()
			{
				System.out.println("mewww");
			}
			
		public void eat()
			{
				System.out.println("cat is eating ");
	}

	}
