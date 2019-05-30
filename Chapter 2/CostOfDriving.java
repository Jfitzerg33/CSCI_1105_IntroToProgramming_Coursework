/*James Fitzgerald
5/30/19
This program will allow you to input the necissary data to figure out how much a trip will cost for you to drive
*/

import java.util.Scanner;

class CostOfDriving {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();
		double result = distance / mpg * price;
		
		System.out.print("The cost of driving is " + result);
		
	}
}