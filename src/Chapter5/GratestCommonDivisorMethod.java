/*
 * 程序清单5-6
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：用方法找出两个数的最大公约数
 */
package Chapter5;
import java.util.Scanner;

public class GratestCommonDivisorMethod {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1=input.nextInt();
		System.out.print("Enter second integer: ");
		int n2=input.nextInt();

		System.out.println("The gratest common divisor for "+n1+" and "+n2+" is "+gcd(n1,n2));
	}
	
	public static int gcd(int n1, int n2){
		int gcd=1;
		int k=2;
		
		while (k<=n1&&k<=n2){
			if (n1%k==0&&n2%k==0){
				gcd=k;
			}
			k++;
		}
		return gcd;
	}

}
