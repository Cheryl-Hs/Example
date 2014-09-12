/*
 * 程序清单5-5
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：实现两个变量转换的方法
 */
package Chapter5;

public class TestPassByValue {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		System.out.println("Before invoking the swap method, num1 is "+num1+" and num2 is "+num2);
		
		swap(num1,num2);
		System.out.println("After invoking the swap method, num1 is "+num1+" and num2 is "+num2);
	}
	
	public static void swap(int n1,int n2){
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping n1 is "+n1+" n2 is "+n2);
		
		int temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("\t\tAfter swapping n1 is "+n1+" n2 is "+n2);
	}

}
