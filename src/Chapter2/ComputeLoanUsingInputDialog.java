/*
 * 程序清单2-11
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：使用输入对话框计算贷款支付额
 */
package Chapter2;

import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {

	public static void main(String[] args) {
		
		String annualInterestRateString=JOptionPane.showInputDialog(
				"Enter yearly interest rate,for example 8.25: ");
		double annualInterestRate=Double.parseDouble(annualInterestRateString);
		
		double monthlyInterestRate=annualInterestRate/1200;
		
		String numberOfYearString=JOptionPane.showInputDialog(
				"Enter number of years as an integer,for example 5: ");
		int numberOfYears=Integer.parseInt(numberOfYearString);
		
		String loanString=JOptionPane.showInputDialog(
				"Enter loan amount,for example 120000.95");
		double loanAmount=Double.parseDouble(loanString);
		
		double monthlyPayment=loanAmount*monthlyInterestRate/(1
				-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double totalPayment=monthlyPayment*numberOfYears*12;
		
		monthlyPayment=(int)(monthlyPayment*100)/100.0;
		totalPayment=(int)(totalPayment*100)/100.0;
		
		String output="The monthly payment is "+monthlyPayment+
				"\nThe total payment is "+totalPayment;
		JOptionPane.showMessageDialog(null, output);
	}

}
