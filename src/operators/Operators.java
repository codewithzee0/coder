package operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		int num1 = 5;
		int num2 = 2;
		int plus= num1+num2;
		int minus = num1-num2;
		int multi = num1*num2;
		num1*=3;
		float devide =(float) num1/num2;
	//	System.out.println(num1);
		//System.out.println("Addition = " +  + plus+ "\nSubtruction  ="+ minus + "\nmultiplication = " + multi + "\nDevide = "+ devide  );
		
		int b = 27;
		int i = 198;
		float f= 10.5f;
		double d = 456.65d;
		b= (byte)(i);
		d = i;
		f = (float)(i*d);
		b = (byte)(i+ f);
		//System.out.println(b);
		
		//Find the Area of triangle 
		int side1 = 2 , side2 =5, side3=3;
		//System.out.println("Area of triangle is  "+ side1+side2+side3);
		
		//Write a program to add 8 to the number 2345 and then divide it by 3. 
		//Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
		int num6 = 8, num8= 2345;
		int sum = num6 + num8;
		//double devidee = (sum/3);
		sum /= 3;
		//double modulus = devidee%5;
		// double multiply = modulus*5;
		sum%=5;
		sum*=5;
		//System.out.println(sum);
		

//Write a program to check if the two numbers 23 and 45 are equal.
		int number1= 23;
		int number2=45;
		boolean equal;
		equal = number1==number2 ;
		//System.out.println(equal);
		

//Write a program to print the power of 7 raised to 5.
		//System.out.println(Math.pow(5, 7));
		

//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
		int a1=55,b1=70;
		//System.out.println((a1<50)||(a1<b1));
		

//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
//write a program to calculate his  and percentage marks.
		int subject1 =78,subject2 =45, subject3= 62;
		int total = subject1+subject2+subject3;
		float persantage= (total*100)/300;
		//System.out.println(persantage);
		

//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values o f the two variables.
//1 - first program by using a third variable
//2 - second program without using any third variable
//( Swapping means interchanging the values of the two variables E.g.- 
		//If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
		
		int a =6, b3= 8, c;
//		c=b3;
//		b3 =a;
//		a=c;
//		System.out.println("value of a : "+ a + "\n value of b "+ b3 + "\n vlue of c "+ c);
//		
//		a = b3;
		
		b3 = b3-a;
	    a = b3+a;
	    b3 = -(b3-a);
	  //  System.out.println("value of a : "+ a + "\n value of b "+ b3  );
	    
//	    int num= 32156;
//	    int firstnum,secondnum, thirdnum,forthnum, lastnum ;
//    firstnum= num/10000;
//    num = num%10000;
//    secondnum =num/1000;
//    num=num%1000;
//    thirdnum = num/100;
//    num =num%100;
//    forthnum = num/10;
//    num = num%10;
//    System.out.println("First number is : "+ firstnum + "\n second num  is : "+ secondnum +
//"\n Third num is : "+ thirdnum + "\n forthnum is : "+ forthnum + "\n Last number is :" + num);
//    int sumoftwo =firstnum + num  ;
//    System.out.println("sum of first and last num is " +  sumoftwo);
	    
	    
	    int num = 321;
	    int  firstnum,secondnum,lastnum;
	    firstnum = num/100;
	    num=num%100;
	    secondnum = num/10;
	    num= num%10;
	    System.out.println("\n first num :"+ firstnum + "\n second num : "+ secondnum + "\n lastnum : "+ num);
	    int sumofthree = firstnum + secondnum + num;
	    System.out.println("sum of three num is " + sumofthree);
	    
	    
	    
	    
	}

}
