/*
 * 作者：黄爽
 * 日期：2014.9.18
 * 功能：
 */
package Chapter6;
public class AnalyzeNumbers {

	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS=100;
		double[] number=new double[NUMBER_OF_ELEMENTS];
		double sum=0;
		
		java.util.Scanner input=new java.util.Scanner(System.in);
		for (int i=0;i<NUMBER_OF_ELEMENTS;i++) {
			System.out.print("Enter a new number: ");
			number[i]=input.nextDouble();
			sum+=number[i];
		}
		
		double average=sum/NUMBER_OF_ELEMENTS;
		int count=0;
		for (int i=0;i<NUMBER_OF_ELEMENTS;i++)
			if (number[i]>average){
				count++;
			}

		System.out.println("Average is "+average);
		System.out.println("Number of elements above the average "+count);
	}

}
