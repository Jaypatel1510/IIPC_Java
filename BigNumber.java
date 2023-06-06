package pack;

import java.util.Scanner;

class Big_Number{
	public static void main(String args[])
	{
		int max;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter fist number: ");
			int a = sc.nextInt();
		
			System.out.println("Enter second number: ");
			int b = sc.nextInt();
		
			max = (a > b) ? a : b;
			System.out.println("Largest number between " + a +" and " + b + " is " + max + ". " );
		}
	}
}
