/*
 * 程序清单4-12
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能测试continue
 */
package Chapter4;

public class TestContinue {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		
		while (number<20){
			number++;
			if (number==10||number==11){
				continue;
			}
				sum+=number;
		}
		
		System.out.println("The sum is "+sum);

	}

}
