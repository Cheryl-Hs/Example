/*
 * 程序清单5-1
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：显示175个随机的小写字母
 */
package Chapter5;

public class TestRandomCharacter {

	public static void main(String[] args) {
		final int NUMBER_OF_CHARS=175;
		final int CHARS_PER_LINE=25;
		
		for (int i=0;i<NUMBER_OF_CHARS;i++){
			char ch=RandomCharacter.getRandomLowerCaseLetter();
			if ((i+1)%CHARS_PER_LINE==0){
				System.out.println(ch);
			}
			else{
				System.out.print(ch);
			}
		}

	}

}
