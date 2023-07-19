package abstruction;

abstract  class Pet
{
	String name;
	public Pet(String name)
	{
		this.name = name;
	}
	public abstract  void makesound();
	
	public void sleep()
	{
		System.out.println(name + " is sleeping ");
	}
	
		static
		
		class Dog extends Pet 
		{
				public Dog(String name)
				{
					super(name);	
				}
		
				public void makesound()
				{
					System.out.println(name + "woof woof");
				}
		}
		static class Cat extends Pet 
		{
			public Cat (String name)
			{
				super(name);
			}
			public void makesound()
			{
				System.out.println(name + "mew mew ");
			}
		}
		
	
	public static void main(String[] args)
	{
		Dog dog = new Dog("german");
		Cat cat = new Cat("pak");
		dog.makesound();
		cat.makesound();
		                                                  
		dog.sleep();
		cat.sleep();
		
	}

}
