/*
 * �����嵥4-5
 * ���ߣ���ˬ
 * ���ڣ�2014.8.6
 * ���ܣ�do while ��ʹ��
 */
package Chapter4;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int data;
		int sum=0;
		
		do{
			System.out.print(
					"Enter an int value (the program exits if the input is 0): ");
			data=input.nextInt();
			
			sum+=data;	
		}while (data!=0);
		
		System.out.println("The sum is "+sum);

	}

}
