/*
 * 程序清单2-2
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：计算圆面积，提醒用户输入半径
 */
package Chapter2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();//从键盘读取一个double类型的数
		
		double area=radius*radius*3.14159;
		
		System.out.println("The area for the circle of radius "+
		  radius+" is "+area);

	}

}