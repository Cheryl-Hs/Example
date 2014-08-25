/*
 * 程序清单3-8
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：判断是否为闰年
 */
package Chapter3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year=input.nextInt();
		
		boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
		
		System.out.println(year+" is a leap year ？ "+isLeapYear);

	}

}
