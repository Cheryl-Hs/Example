/*
 * �����嵥2-2
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ�����Բ����������û�����뾶
 */
package Chapter2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();//�Ӽ��̶�ȡһ��double���͵���
		
		double area=radius*radius*3.14159;
		
		System.out.println("The area for the circle of radius "+
		  radius+" is "+area);

	}

}