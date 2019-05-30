/* James Fitzgerald
5/30/19
This program will show the amount you will have saved after six months of puting the same amount in your bank every month with a 5% interest
*/

import java.util.Scanner;

class CompoundValue {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a monthly saving amount ");
		
		double savings = input.nextDouble();
		double interest = 0.00417;
		double newsaving = (savings * (1 + interest));
		newsaving = ((newsaving + savings) * (1 + interest));
		newsaving = ((newsaving + savings) * (1 + interest));
		newsaving = ((newsaving + savings) * (1 + interest));
		newsaving = ((newsaving + savings) * (1 + interest));
		newsaving = ((newsaving + savings) * (1 + interest));
		
		System.out.print("The amount in your savings after six months is " + newsaving);
		
		
	}
}

