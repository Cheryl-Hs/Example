/*
 * �����嵥2-5
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ����ù�ʽcelsius=(5/9)*(fahrenheit-32)�������¶�ת���������¶�
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
