/*
 * �����嵥5-4
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ����Է������ú�ʵ�ε�ֵ�ı�û��
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
