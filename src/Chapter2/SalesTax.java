/*
 * 程序清单2-7
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：保留营业税小数点后两位
 */
package Chapter2;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amount： ");
		double purchaseAmount=input.nextDouble();
		
		double tax=purchaseAmount*0.06;
		System.out.println("Sales tax is "+(int)(tax*100)/100.0);

	}

}
