/*
 * 程序清单6-1
 * 作者：黄爽
 * 日期：2014.9.18
 * 功能：从文件读取筹码上的数字，并且检查是否涵盖所有的数
 */
package Chapter6;
import java.util.Scanner;

public class LottoNUmbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean[] isCovered=new boolean[99];
		
		int number=input.nextInt();
		while (number!=0) {
			isCovered[number-1]=true;
			number=input.nextInt();
		}
		
		boolean allCovered=true;
		for (int i=0;i<99;i++) {
			if (!isCovered[i]){
				allCovered=false;
				break;
			}
		}
			
			if (allCovered){
				System.out.println("The tickets cover all numbers");
			}
			else{
				System.out.println("The tickets don't cover all numbers");
			}
		
	}

}
