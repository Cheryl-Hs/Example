/*
 * 程序清单5-10
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：随机获取某种特定类型的呃字符
 */
package Chapter5;

public class RandomCharacter {

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a', 'z');
	}
	
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A', 'Z');
	}
	
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0', '9');
	}
	
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

}
