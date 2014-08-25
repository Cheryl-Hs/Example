/*
 * 程序清单2-1
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：计算半径为20的圆面积
 */
package Chapter2;

public class ComputeArea {

	public static void main(String[] args) {
		double radius;
		double area;
		
		radius=20;
		area=radius*radius*3.14159;
		
		System.out.println("The area for the circle of radius "+
		  radius+" is "+area);

	}

}
