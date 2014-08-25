/*
 * 程序清单2-5
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：利用公式celsius=(5/9)*(fahrenheit-32)将华氏温度转换成摄氏温度
 */
package Chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit=input.nextDouble();
		
		double celsius=(5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+
				" in Celsius");

	}

}
