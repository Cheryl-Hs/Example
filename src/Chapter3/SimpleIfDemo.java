/*
 * �����嵥3-2
 * ���ߣ���ˬ
 * ���ڣ�2014.8.3
 * ���ܣ�����һ�������������5�ı�������ӡHiFive�������2�ı�������ӡHiE
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
