package com.assignment.Prgm1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program to accept N number of int in Array from user And Display its SUM
 * @author Nitish Kumar
 * */

public class SumOfNumberOfArray {

	public static void main(String args[]){
		
		System.out.println("Enter the number to be entered in array: ");
		Scanner inputSize= new Scanner(System.in);
		int sizeOfArray = inputSize.nextInt();
		
		// generate array
		int getArray[]=acceptArrayElements(sizeOfArray);	//??
		
		//display array
		displayArrayElements(getArray);
		
		//sum of all element of array
		System.out.println("\n Sum Of Array is: " + sumOfArray(getArray));
		inputSize.close();
	}
	
	public static int[] acceptArrayElements(int num){		//why we are defining (int num) ??
		
		int arrayOfNumber[] = new int[num];
		
		try{
			System.out.println("Enter Element: ");
			Scanner inputNumber= new Scanner(System.in);
			for(int limit=0; limit<num; limit++){
				System.out.println("Enter the number at "+ (limit+1) + " place :- ");
				arrayOfNumber[limit] = inputNumber.nextInt();	//??
			}
			inputNumber.close();
		}catch(InputMismatchException e){
			System.out.println("Enter only numbers");
		}
		return arrayOfNumber;
	}
	
	public static void displayArrayElements(int localArray[]){
		System.out.println("Element in Array are: ");
		for(int limit: localArray)
			System.out.println(limit+ " ");
	}
	
	public static int sumOfArray(int localArray[]){
		int sum= 0;
		for(int limit: localArray)
			sum = sum+limit;
		return sum;
	}
}
