/*
 * 程序清单3-2
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：输入一个整数，如果是5的倍数，打印HiFive，如果是2的倍数，打印HiE
 */
package Chapter3;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
		if(number%5==0)
			System.out.println("HiFive");
		
		if(number%2==0)
			System.out.println("HiEven");


	}

}
