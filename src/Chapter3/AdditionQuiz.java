/*
 * 程序清单3-1
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：判断是否正确
 */
package Chapter3;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1=(int)(System.currentTimeMillis()%10);
		int number2=(int)(System.currentTimeMillis()*7%10);
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is "+number1+"+"+number2+" ? ");
		
		int answer=input.nextInt();
		
		System.out.println(number1+"+"+number2+"="+answer+" is "+
				(number1+number2==answer));

	}

}
