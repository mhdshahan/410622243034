package javaLabBook;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter An Integer Number:");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num % 2 == 0)
		   System.out.println("Entered Number Is Even");
		else
			System.out.println("Entered Number Is Odd");
		
			
	
	}
}
