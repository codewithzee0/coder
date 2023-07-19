package statements;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) 
	{
		System.out.println("************************* GUESS THE NUMBER*************************");
		int i;
		for(i =0 ; i<6; i++) {
			
		Scanner Scan = new Scanner(System.in);
		int Thenum = 30;
	
		System.out.println("Guess the number");
		int usernum = Scan.nextInt();
		
		if (usernum >Thenum)
		{
			System.out.println("LESS ");
		}
		
		
		if (usernum<Thenum)
		{
			System.out.println("GREATER");
		}
		if(usernum == Thenum) 
		{
			System.out.println("CORRECT YOU WON");
			break;
		}
		
		
		else
		{
			System.out.println("try again");
		}
		System.out.println("remaning count" + (i-5));
		if(i == 5) {
			System.out.println("*************************GAME OVER*************************");
		}
		
		}
		
		
	}

}
