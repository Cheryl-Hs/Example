/*
 * 程序清单3-6
 * 作者：黄爽
 * 日期：2014.8.3
 * 功能：计算税款
 */
package Chapter3;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print
			("(0-single filer,1-married jointly,\n"+
			"2-married separately,3-head of household)\n"+
			"Enter the filing status: ");
		int status=input.nextInt();
		
		System.out.print("Enter the taxable incom: ");
		double incom=input.nextDouble();
		
		double tax=0;
		
		if (status==0){
			if (incom<=8350)
				tax=incom*0.10;
			else if (incom<=33950)
				tax=8350*0.10+(incom-8350)*0.15;
			else if (incom<=82250)
				tax=8350*0.10+(33950-8350)*0.15+(incom-33950)*0.25;
			else if (incom<=171550)
				tax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+
				  (incom-82250)*0.28;
			else if (incom<=372950)
				tax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+
				(171550-82250)*0.28+(incom-171550)*0.33;
			else
				tax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+
				(171550-82250)*0.28+(372950-171550)*0.33+(incom-372950)*0.35;
		}
		
		System.out.println("Tax is "+(int)(tax*100)/100.0);

	}

}
