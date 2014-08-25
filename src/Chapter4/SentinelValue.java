/*
 * 程序清单4-4
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：读取和计算个数不确定的整数之和
 */
package Chapter4;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print(
				"Enter an int value (the program exits if the input is 0): ");
		int data=input.nextInt();
		
		int sum=0;
		while (data!=0){
			sum+=data;
			
		System.out.print(
				"Enter an int value (the program exits if the input is 0): ");
		data=input.nextInt();
		}
		
		System.out.println("The sum is "+sum);

	}

}
