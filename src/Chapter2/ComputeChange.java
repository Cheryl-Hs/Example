/*
 * �����嵥2-10
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ���Ǯ����
 */
package Chapter2;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount=input.nextDouble();
		
		int remainingAmount=(int)(amount*100);
		
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		int numberOfPennis=remainingAmount;
		
		System.out.println("Your amount "+amount+" consist of \n"+
		"\t"+numberOfOneDollars+" dollars\n"+
		"\t"+numberOfQuarters+" quarters\n"+
		"\t"+numberOfDimes+" dimes\n"+
		"\t"+numberOfNickels+" nickels\n"+
		"\t"+numberOfPennis+" pennis\n");

	}

}
