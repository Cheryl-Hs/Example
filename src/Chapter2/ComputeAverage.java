/*
 * 程序清单2-3
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：从键盘读取三个数值，显示它们的平均数
 */
package Chapter2;

import java.util.Scanner;
public class ComputeAverage {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		double average=(number1+number2+number3)/3;
		
		System.out.println("The average of "+number1+" "+number2+
				" "+number3+" is "+average);

	}

}
