/*
 * 程序清单2-6
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：显示当前GMT(格林威治标准时间)，GMT格式:小时：分钟：秒
 */
package Chapter2;

public class ShowCurrentTime {

	public static void main(String[] args) {
		//System类中方法currenTimeMillis返回从GMT 1970年1月1日00:00:00开始到当前时刻的毫秒数
		long totalMilliseconds=System.currentTimeMillis();
		
		//获得总秒数
		long totalSeconds=totalMilliseconds/1000;
		
		//获得当前秒数
		long currentSecond=totalSeconds%60;
		
		//获得总分钟数
		long totalMinutes=totalSeconds/60;
		
		//获得当前分钟数
		long currentMinute=totalMinutes%60;
		
		//获得总小时数
		long totalHours=totalMinutes/60;
		
		//获得当前小时数
		long currentHour=totalHours%24;
		
		System.out.println("Current Time is "+currentHour+":"+currentMinute
				+":"+currentSecond+" GMT");
		
		

	}

}
