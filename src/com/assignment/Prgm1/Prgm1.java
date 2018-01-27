package com.assignment.Prgm1;

import java.util.Scanner;

public class Prgm1 {
	
	public static void main(String args[]){
		
		System.out.println("Enter the size of Array you want to create: ");
		Scanner in= new Scanner(System.in);
		int sizeOfArray = in.nextInt();
		
		System.out.println("Enter element in array");
		
		int sumOfElement = 0;
		for(int i = 0; i< sizeOfArray; i++){
			Scanner input = new Scanner(System.in);
			int element = input.nextInt();
			
			System.out.println("Element entered at position: " + (i+1) + " = " + element);
			
			sumOfElement = sumOfElement + element;
			
		}
		
		System.out.println("Sum of Array:" + sumOfElement);
	}

}
