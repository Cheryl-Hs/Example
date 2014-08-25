/*
 * 程序清单4-15
 * 作者：黄爽
 * 日期：2014.8.6
 * 功能：用一个确认对话框，改写程序清单4-4
 */
package Chapter4;

import javax.swing.JOptionPane;

public class SentinelValueConfirmationDialog {

	public static void main(String[] args) {
		int sum=0;
		
		int option=JOptionPane.YES_OPTION;
		while (option==JOptionPane.YES_OPTION){
			String dataString=JOptionPane.showInputDialog("Enter an int value: ");
			int data=Integer.parseInt(dataString);
			
			sum+=data;
			option=JOptionPane.showConfirmDialog(null, "Continue?");
		}
		
		JOptionPane.showMessageDialog(null, "The sum is "+sum);

	}

}
