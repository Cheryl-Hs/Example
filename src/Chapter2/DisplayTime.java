/*
 * 程序清单2-4
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：计算一个以秒为单位的时间量所包含的分钟数和剩余秒数
 */
package Chapter2;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		int seconds=input.nextInt();
		
		int minutes=seconds/60;//求出seconds中包含的分钟数
		int remainingSeconds=seconds%60;//求出seconds中剩余秒数
		
		System.out.println(seconds+" seconds is "+minutes+
				" minutes and "+remainingSeconds+" seconds");
		
		
	}

}
