package com.assignment.Prgm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prgm1 {

	public static void main(String args[]){
		
		System.out.println("Enter size Of Array: ");
		Scanner inputValue = new Scanner(System.in);
		int sizeOfArray = inputValue.nextInt();
		
		//create array
		int getArray[] = acceptArrayElements(sizeOfArray);	//giving the method name on RHS to initialize the method & create array
		System.out.println("Array created with size: " + sizeOfArray);
		
		//display input value
		displayArrayElements(getArray);
		
		//Display sorted array
		System.out.println("\n Sorted Array:- ");
		displayArrayElements(sortArray(getArray));
		
		//Biggest of all elements of array
		System.out.println("\nBiggest Number in Array Is "+biggestOfArray(getArray));
		//Small of all elements of array
		System.out.println("\nSmallest Number in Array Is "+smallestOfArray(getArray));
		inputValue.close();
	}
	
	public static int[] acceptArrayElements(int num){
		
		int inputElement[] = new int[num];
		
		try{
			System.out.println("Enter element");
			Scanner inputNumber = new Scanner(System.in);
			
			for(int limit = 0; limit < num; limit++){
				System.out.println("Enter element at "+ (limit+1) + " position:- ");
				inputElement[limit] = inputNumber.nextInt();
			}
			inputNumber.close();
		}catch(InputMismatchException e){
			System.out.println("Enter only number");
		}
		return inputElement;
	}
	
	public static void displayArrayElements(int localArray[]){
		for(int limit: localArray)
			System.out.println(limit + " ");
	}
	
	public static int[] sortArray(int localArray[]){
		for(int limit= 0; limit < localArray.length; limit++){
			for(int limit2=limit+1; limit2 <localArray.length; limit2++){
				if(localArray[limit] < localArray[limit2]){
					int temp = localArray[limit];
					localArray[limit] = localArray[limit2];
					localArray[limit2] = temp;
				}
			}
		}
		return localArray;
	}
	
	public static int biggestOfArray(int localArray[]){
		int temp[] = sortArray(localArray);
		return temp[0];
	}
	
	public static int smallestOfArray(int localArray[]){
		int temp[] = sortArray(localArray);
		return temp[localArray.length-1];
	}
}
