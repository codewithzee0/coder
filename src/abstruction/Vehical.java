package abstruction;

abstract   class Vehical {
	private String name;
	private String model;
	private int year;
	
	public Vehical (String name, String model, int year)
	{
		this.name =name;
		this.model=model;
		this.year=year;
		
	}
	
	abstract double fueleffecency();
	
	public void getname()
	{
		System.out.println("Vehical name " +  name);
		System.out.println("Vehical model "+  model);
		System.out.println("Vehical year " +  year);
		System.out.println("fueleffecency " +  fueleffecency());
	}

	public static class Car extends Vehical
	{
		private double fueltankcapacity;
		private double milage;
		
		public Car(String name, String model, int year,double fueltankcapacity, double milage )
		{
			super(name,model,year);
			this.fueltankcapacity= fueltankcapacity;
			this.milage= milage;
		}
		double fueleffecency() 
		{
			return milage/fueltankcapacity;
		}
	
	}

	public static void main(String[] args) {
		
		Car car1 = new Car("jeep", "toyota", 2012, 50.0, 15.0);
			car1.getname();
			car1.fueleffecency();
	}

}
