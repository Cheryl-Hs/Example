/*
 * �����嵥2-4
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ�����һ������Ϊ��λ��ʱ�����������ķ�������ʣ������
 */
package Chapter2;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		int seconds=input.nextInt();
		
		int minutes=seconds/60;//���seconds�а����ķ�����
		int remainingSeconds=seconds%60;//���seconds��ʣ������
		
		System.out.println(seconds+" seconds is "+minutes+
				" minutes and "+remainingSeconds+" seconds");
		
		
	}

}
