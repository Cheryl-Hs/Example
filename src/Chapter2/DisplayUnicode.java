/*
 * 程序清单2-9
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：显示两个中文字符和三个希腊字母：欢迎αβγ
 */
package Chapter2;

import javax.swing.JOptionPane;

public class DisplayUnicode {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"\u6B22\u8FCE\u03b1\u03b2\u03b3",
				"\u6B22\u8FCE Welcom",JOptionPane.INFORMATION_MESSAGE);

	}

}
