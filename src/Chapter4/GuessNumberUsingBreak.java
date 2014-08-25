/*
 * 程序清单4-13
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：用break改写程序清单4-2
 */
package Chapter4;

import java.util.Scanner;

public class GuessNumberUsingBreak {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		
		while (true){
			System.out.print("\nEnter your guess: ");
			int guess=input.nextInt();
			
			if (guess==number){
				System.out.println("Yes, the number is "+number);
				break;
			}
			else if (guess>number)
				System.out.println("Your guess is too high");
			else 
				System.out.println("Your guess is too low");
		}

	}

}
