/*
 * 程序清单4-7
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：计算0.01到1.0的数列之和
 */
package Chapter4;

public class TestSum {

	public static void main(String[] args) {
		double currentValue=1.0;
		double sum=0;
		
		for (int count=0;count<100;count++){
			sum+=currentValue;
			currentValue-=0.01;
		}
		System.out.println("The sum is "+sum);

	}

}
