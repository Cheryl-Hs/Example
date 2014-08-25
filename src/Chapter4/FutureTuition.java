/*
 * 程序清单4-9
 * 作者：黄爽
 * 日期：2014.8.7
 * 功能：预测未来学费
 */
package Chapter4;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition=10000;
		int year=1;
		while (tuition<20000){
			tuition=tuition*1.07;
			year++;
		}
		
		System.out.println("Tuition will be doubled in "+year+" years");

	}

}
