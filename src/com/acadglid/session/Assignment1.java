/*
 * Problem Statement
	Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print
	all even numbers from an array.
 */

package com.acadglid.session;

import java.util.*;

public class Assignment1 {

	public static void main(String[] agrs) {

		//Declare the array of size 10 

		int[] array = new int[10];

		// Initialize the Scanner class variable 

		Scanner sc =new Scanner(System.in);

		//Start the loop and take input from user 
		System.out.println("Enter the 10 numbers one by one");

		for(int i=0;i<array.length;i++) {

			array[i] = sc.nextInt();

		}

		//print all the items in the array using for each loop 
		System.out.print("The array which was entered-->{");
		for(int item: array) {

			System.out.print(item+"," );
		}


		System.out.print("}\n");
		System.out.print("Even numbers in the array-->{");

		//print all the even numbers from the array 

		for(int item: array) {

			if(item%2==0) {

				System.out.print(item+",");
			}
		}

		System.out.print("}\n");


	}

}
