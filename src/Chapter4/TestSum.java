/*
 * �����嵥4-7
 * ���ߣ���ˬ
 * ���ڣ�2014.8.6
 * ���ܣ�����0.01��1.0������֮��
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
