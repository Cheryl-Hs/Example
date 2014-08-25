/*
 * 程序清单4-11
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：测试循环中的break
 */
package Chapter4;

public class TestBreak {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		while (number<20){
			number++;
			sum+=number;
			if (sum>=100)
				break;
		}
		
		System.out.println("The number is "+number);
		System.out.println("The sum is "+sum);
	}

}
