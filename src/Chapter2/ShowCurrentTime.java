/*
 * �����嵥2-6
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ���ܣ���ʾ��ǰGMT(�������α�׼ʱ��)��GMT��ʽ:Сʱ�����ӣ���
 */
package Chapter2;

public class ShowCurrentTime {

	public static void main(String[] args) {
		//System���з���currenTimeMillis���ش�GMT 1970��1��1��00:00:00��ʼ����ǰʱ�̵ĺ�����
		long totalMilliseconds=System.currentTimeMillis();
		
		//���������
		long totalSeconds=totalMilliseconds/1000;
		
		//��õ�ǰ����
		long currentSecond=totalSeconds%60;
		
		//����ܷ�����
		long totalMinutes=totalSeconds/60;
		
		//��õ�ǰ������
		long currentMinute=totalMinutes%60;
		
		//�����Сʱ��
		long totalHours=totalMinutes/60;
		
		//��õ�ǰСʱ��
		long currentHour=totalHours%24;
		
		System.out.println("Current Time is "+currentHour+":"+currentMinute
				+":"+currentSecond+" GMT");
		
		

	}

}
