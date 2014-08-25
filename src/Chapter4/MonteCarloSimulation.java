/*
 * 程序清单4-10
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：蒙特卡罗模拟
 */
package Chapter4;

public class MonteCarloSimulation {

	public static void main(String[] args) {
		final int NUMBER_OF_TRIALS=10000000;
		int numberOfHits=0;
		
		for (int i=0;i<NUMBER_OF_TRIALS;i++){
			double x=Math.random()*2.0-1;
			double y=Math.random()*2.0-1;
			if (x*x+y*y<=1){
				numberOfHits++;
			}
		}
		
		double pi=4.0*numberOfHits/NUMBER_OF_TRIALS;
		System.out.println("PI is "+pi);

	}

}
