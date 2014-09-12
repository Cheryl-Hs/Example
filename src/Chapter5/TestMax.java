/*
 * 程序清单5-1
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：测试Max方法的完整程序
 */
package Chapter5;

public class TestMax {

	public static void main(String[] args) {
		int i=5;
		int j=2;
		int k=max(i,j);
		System.out.println("The maxiunm between "+i+" and "+j+" is "+k);

	}
	
	public static int max(int num1, int num2){
		int result;
		
		if (num1>num2){
			result=num1;
		}
		else{
			result=num2;
		}
		return result;
	}

}
