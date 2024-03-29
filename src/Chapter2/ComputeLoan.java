/*
 * 程序清单2-8
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：计算贷款支付额
 */
package Chapter2;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter yearly interest rate,for example 8.25: ");
		double annualInterestRate=input.nextDouble();
		
		double monthlyInterestRate=annualInterestRate/1200;
		
		System.out.print(
				"Enter number of years as an integer,for example 5: ");
		int numberOfYears=input.nextInt();
		
		System.out.print("Enter loan amount,for example 120000.95");
		double loanAmount=input.nextDouble();
		
		double monthlyPayment=loanAmount*monthlyInterestRate/(1
				-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double totalPayment=monthlyPayment*numberOfYears*12;
		
		System.out.println("The monthly payment is "+
		  (int)(monthlyPayment*100)/100.0);
		
		System.out.println("The monthly payment is "+
		  (int)(totalPayment*100)/100.0);
		
	}

}
