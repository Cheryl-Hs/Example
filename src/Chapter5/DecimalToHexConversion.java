/*
 * 程序清单5-8
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：将十进制转换成十六进制
 */
package Chapter5;
import java.util.Scanner;

public class DecimalToHexConversion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal=input.nextInt();
		
		System.out.println("The hex number for decimal "+decimal+" is "+decimalToHex(decimal));

	}
	
	public static String decimalToHex(int decimal){
		String hex="";
		
		while (decimal!=0){
			int hexValue=decimal%16;
			hex=toHexChar(hexValue)+hex;
			decimal=decimal/16;
		}
		return hex;
	}
	
	public static char toHexChar(int hexValue){
		if (hexValue<=9&&hexValue>=0){
			return (char)(hexValue+'0');
		}
		else{
			return (char)(hexValue-10+'A');
		}
	}

}
