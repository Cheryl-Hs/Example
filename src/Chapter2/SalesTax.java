/*
 * �����嵥2-7
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ�����Ӫҵ˰С�������λ
 */
package Chapter2;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amount�� ");
		double purchaseAmount=input.nextDouble();
		
		double tax=purchaseAmount*0.06;
		System.out.println("Sales tax is "+(int)(tax*100)/100.0);

	}

}
