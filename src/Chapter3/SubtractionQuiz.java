/*
 * 程序清单3-4
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：随机产生两个数，相减，并判断用户输入答案对错
 */
package Chapter3;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		//调用Math类中的random方法，返回一个双精度值在0.0到1.0之间
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		
		if (number1<number2){
			int temp=number1;
			number1=number2;
			number2=temp;
		}
		
		System.out.print
			("What is "+number1+" - "+number2+" ? ");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		
		if (number1-number2==answer)
			System.out.println("You are correct!");
		else
			System.out.println("Your answer is wrong\n"+number1+" - "
					+number2+" should be "+(number1-number2));

	}

}
