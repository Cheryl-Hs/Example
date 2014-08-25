/*
 * 程序清单4-6
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：使用嵌套for循环打印一个乘法表
 */
package Chapter4;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("           Multipllication Table");
		
		System.out.print("    ");
		for (int j=1;j<=9;j++){
			System.out.print("   "+j);
		}
		
		System.out.println("\n----------------------------------------");
		
		for (int i=1;i<=9;i++){
			System.out.printf(i+" | ");
			for (int j=1;j<=9;j++){
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}

	}

}
