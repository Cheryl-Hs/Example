/*
 * �����ϰ��4.33
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ȫ��
 */
package Chapter3;

public class Exc33 {

	public static void main(String[] args) {
		int a=0;
		for (int i=2;i<10000;i++){
			for (int k=1;k<i;k++){
				if (i%k==0){
					a=a+k;
				}
				System.out.print(a);
			}
//			if (a==i){
//				System.out.print(i+" ");
//			}
		}

	}

}
