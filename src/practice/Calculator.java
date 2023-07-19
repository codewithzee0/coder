package practice;

import java.util.Scanner;

public class Calculator {
	public  int a;
	public int b;
	
	// Method to perform all Arithmetic operations
	public double calculate(int a , int b) { 
		int sum = a+b;
		int multi= a*b;
		int sub=a-b;
		double devide = (double) a/b;
		 
		System.out.println("sum of two num are "+ sum);
		System.out.println("multi of two num are "+ multi);
		System.out.println("sub of two num are "+ sub);
		return devide;
		
	}
	
	//******** INT DATA TYPE ********
	
	static int dacimal = 51966; // Decimal formate
	 static int intoctal =0145376; // int lateral octal numb
	 static int hexa = 0xCAFE; //Hexadacimal foramte
	 static  int binary = 0b1100101011111110;//binary formate
	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first num ");
		int num1 =scan.nextInt();
		System.out.println("enter second num");
		int num2 = scan.nextInt();
		int max = Math.max(num1, num2); //calculate min and max value
		int min = Math.min(num1, num2); 
		Calculator calculator= new Calculator();
		double result = calculator.calculate(num1, num2);
		System.out.println(result);
		//System.out.println("The max value is "+ max);
		//System.out.println("The min value is "+ min);
		 
		//******** INT DATA TYPE ********
		System.out.println(dacimal);
		System.out.println(hexa);
		System.out.println(binary);
		System.out.println(intoctal);
		
		//******** INT AND LONG DATA TYPE ********
		int checkint = 787878878;
		long checklong =7888787878788787877L ;
		// checklong= checkint;
		checkint =(int) checklong;
		System.out.println(checklong);
		System.out.println(checkint);
		
		//******** BYTE DATA TYPE ********
		byte b1 =127;
		int b2 = 15;
		b1 = (byte)b2;
		b2 = b1;
		System.out.println(b2);
		
		char c1 = 'A';
		int integer = 145;
		long lang = 125L;
		c1=(char)integer;
	//	c1 = (char)integer;
		//c1= (char)lang;
		System.out.println(c1);
	}
	
}
