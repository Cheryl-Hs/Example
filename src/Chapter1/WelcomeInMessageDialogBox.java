/*
 * 程序清单1-4
 * 作者：黄爽
 * 日期：2014.7.30
 * 功能：用消息对话框显示Welcome to Java！
 */
package Chapter1;

import javax.swing.JOptionPane;//导入Java类JOptionPane

public class WelcomeInMessageDialogBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Welcome to Java！",
				"Display Message",JOptionPane.INFORMATION_MESSAGE);

	}

}
