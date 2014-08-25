/*
 * 程序清单3-7
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：检验一个数是否能被2和3整除
 */
package Chapter3;

import java.util.Scanner;

public class TestBlooleanOperators {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
		System.out.println("Is "+number+"\n\tdivisible by 2 and 3 ? "+
				(number%2==0&&number%3==0)+"\n\tdivisible by 2 or 3 ? "+
				(number%2==0||number%3==0)+
				"\n\tdivisible by 2 or 3,but not both ? "+
				(number%2==0^number%3==0));
		

	}

}
