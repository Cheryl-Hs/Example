/*
 * �����嵥5-1
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�����Max��������������
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
