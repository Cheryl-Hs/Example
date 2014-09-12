/*
 * 程序清单5-4
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：测试方法调用后实参的值改变没有
 */
package Chapter5;

public class Increment {

	public static void main(String[] args) {
		int x=1;
		System.out.println("Before the call, x is "+x);
		increment(x);
		System.out.println("after the call, x is "+x);

	}
	
	public static void increment(int n){
		n++;
		System.out.println("n inside the method is "+n);
	}

}
