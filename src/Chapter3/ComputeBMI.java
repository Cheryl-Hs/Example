/*
 * 程序清单3-5
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：计算身体质量指数
 */
package Chapter3;

import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight=input.nextDouble();
		System.out.print("Enter height in inches:");
		double height=input.nextDouble();
		
		final double KILOGRAMS_PER_POUND=0.45359237;
		final double METERS_PER_INCH=0.0254;
		
		double weightInKilograms=weight*KILOGRAMS_PER_POUND;
		double heightInMeters=height*METERS_PER_INCH;
		double bmi=weightInKilograms/(heightInMeters*heightInMeters);
		
		System.out.println("Your BMI is "+bmi);
		if (bmi<16)
			System.out.println("You are seriously underweight");
		else if (bmi<18)
			System.out.println("You are underweight");
		else if (bmi<24)
			System.out.println("You are normal weight");
		else if (bmi<29)
			System.out.println("You are overweight");
		else if (bmi<35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely overweight");

	}

}
