/*
Author: James Fitzgerald
Date: 4/10/2019

This program allows you to compute temperature from celsius to fehrenheit
*/

import java.util.Scanner;

public class ComputeFahrenheit{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("enter a number for celsius: ");
		double celsius = input.nextDouble();
		
		
		double fehrenheit = (9.0 / 5) * celsius + 32;
		
		
		System.out.println("The temperature of celsius degree " + 
			celsius + " in Fehrenheit is " + fehrenheit);
	}
}