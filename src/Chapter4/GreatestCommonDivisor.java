/*
 * 程序清单4-8
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：求最大公约数
 */
package Chapter4;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1=input.nextInt();
		System.out.print("Enter second integer: ");
		int n2=input.nextInt();
		
		int gcd=1;
		int k=2;
		while (k<=n1&&k<=n2){
			if (n1%k==0&&n2%k==0){
				gcd=k;
			}
			k++;
		}
		
		System.out.println("The greatest common divisor for "+n1+" and "+n2
				+" is "+gcd);

	}

}
