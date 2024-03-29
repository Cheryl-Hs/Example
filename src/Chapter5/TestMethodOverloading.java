/*
 * 程序清单5-9
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：重载方法
 */
package Chapter5;

public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("The maximum between 3 and 4 is "+max(3,4));
		System.out.println("The maximum between 3.0 and 5.4 is "+max(3.0, 5.4));
		System.out.println("The maximum between 3.0, 5.4 and 10.14 is "+max(3.0, 5.4, 10.14));

	}
	
	public static int max(int num1, int num2){
		if (num1>num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	
	public static double max(double num1, double num2){
		if (num1>num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	
	public static double max(double num1, double num2, double num3){
		return max(max(num1, num2),num3);
	}

}
