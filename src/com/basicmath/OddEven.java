package com.basicmath;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number : ");

		try {
			int number = scan.nextInt();

			if (number % 2 == 0) {

				System.out.println(number + " is a even number");
			} 
			else {
				
				System.out.println(number + " is a odd number");
			}
		} 
		catch (Exception e) {

			System.out.println("Invalid Input, Enter a valid integer value");
		} 
		finally {
			
			scan.close();
		}
	}
}
