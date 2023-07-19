package practicepillers;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args)
	{
//		// TODO Auto-generated method stub
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("Enter length");
//		double length = Scan.nextDouble();
//		
//		System.out.println("Enter width");
//		double width = Scan.nextDouble();
//		
//		if (length == width )
//		{
//			System.out.println("It is squre");
//		}
//		else
//		{
//			System.out.println("It is not squre");
////		}
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("Enter first number");
//		int x = Scan.nextInt();
//		
//		System.out.println("Enter second number");
//		int y = Scan.nextInt();
//		
//		if (x>y)
//		{
//			System.out.println("the greater value is "+ x);
//		}
//		else 
//		{
//			System.out.println("the greater value is "+ y);
//		}
//		
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("Enter the cost of total purchase");
//		float purchase = Scan.nextFloat();
//		
//		if(purchase>=1000)
//		{
//			float total_amount = (purchase*10)/100;
//			System.out.println("The discounted price is "+ total_amount);
//			float newprice = purchase- total_amount;
//			System.out.println("The total ammount is "+ newprice );
//		}
//		else 
//		{
//			System.out.println("sorry no discount ");
//		}
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("Enter the user service year");
//		int serice_year = Scan.nextInt();
//		
//		System.out.println("Enter the salary");
//		float salary = Scan.nextFloat();
//		
//		if(serice_year >= 5)
//		{
//			float net_salary = (salary*10)/100;
//			float total_salary = salary+net_salary;
//			System.out.println("The salary of employ with 10% bonus is "+ total_salary);
//		}
//		else
//		{
//			System.out.println("the total salary of employ is :"+ salary );
//		}
//		
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("Enter toral grade");
//		double grade = Scan.nextDouble();
//		
//		if(grade>=80)
//		{
//			System.out.println("A");
//		}
//		
//		else if(grade>=60 && grade<=80)
//			{
//				System.out.println("b");
//			}
//			else if(grade>=50 && grade<=60)
//			{
//				System.out.println("c");
//			}
//			else if (grade>=45 && grade<=50)
//			{
//				System.out.println("d");
//			}
//			else if (grade>=20 && grade<=45)
//			{
//				System.out.println("e");
//			}
//			else
//			{
//				System.out.println("fail");
//			}
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter first person age");
		int person1 = Scan.nextInt();
		
		System.out.println("Enter sewcond person age");
		int person2 = Scan.nextInt();
		
		System.out.println("Enter third person age");
		int person3 = Scan.nextInt();
		
		if(person1>person2 && person1>person3)
		{
			System.out.println("person 1 is oldest then person 2 and person 3");
		}
		else if (person2>person1 && person2>person3)
		{
			System.out.println("person 2 is oldest then person 1 and person 2");
		}
		else if(person3>person1 && person3>person2)
		{
			System.out.println("person 3 is oldest then person 1 and person 2");
		}
		
	}
	
}
