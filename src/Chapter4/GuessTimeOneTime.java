/*
 * 程序清单4-2
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：猜数字
 */
package Chapter4;

import java.util.Scanner;

public class GuessTimeOneTime {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a maggic number between 0 and 100:");
		
		int guess=-1;
		while (guess!=number){
		System.out.print("\nEnter your guess: ");
		guess=input.nextInt();
		
		if (guess==number){
			System.out.println("Yes, the number is "+number);
		}
		else if (guess>number){
			System.out.println("Your guess is too high");
		}
		else if (guess<number){
			System.out.println("Your guess is too low");
		}
		}

	}

}
