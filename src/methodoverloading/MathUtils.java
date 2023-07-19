package methodoverloading;

public class MathUtils {
	public int multiply (int a , int b) 
	{
		return a * b;
	}
	public double multiply (double a, double b)
	{
		return a *b;
	}
	public int multiply (int a , int b, int c)
	{
		return a * b * c;
	}

	public static void main(String[] args)
	{
		MathUtils mathuntils = new MathUtils();
		
		int two = mathuntils.multiply(5, 10);
	 double Two=  mathuntils.multiply(6, 2);
	int three =	 mathuntils.multiply(10, 12, 20);
		//System.out.println("product of two integer num is = " + multi + '\n' + "product of two double is = " + two + '\n'+ "product of three integer num is =" +  three);
		 System.out.println(three);
	}
	
	
	

}
