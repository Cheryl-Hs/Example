/*
 * �����嵥5-1
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ���ʾ175�������Сд��ĸ
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
