package abstruction;

abstract  class Shape
{
	abstract double calculateArea();
	
	static  class Circle extends Shape 
	{
		private double radius;
		
		public Circle (double radius)
		{
			this.radius=radius;
		}
		
		@Override
		double calculateArea() {
			// TODO Auto-generated method stub
			return radius*radius;
		}
	}
	 static class Ractangle extends Shape 
	{
		double length;
		double width;
		
		public Ractangle (double length, double width)
		{
			this.length = length;
			this.width = width;
		}
		
		double calculateArea()
		{
			return length * width;
		}
	}
	
	public static void main(String[] args)
	{
	  Circle circle = new Circle(5.2);
		double circlearea = circle.calculateArea();
		System.out.println("circle area is " + circlearea);
		
		
		Ractangle ractangle = new Ractangle (5.2, 6.2);
		double ractanglearea = ractangle.calculateArea();
		System.out.println("ractangle area is: " + ractanglearea);

	}

}
