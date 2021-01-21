package javapractice.datePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePractice {
	
	public void testDate() {
		
		//현재 시간에 대한 정보 가지고 객체 생성
		Date today = new Date();
		
		System.out.println(today);
		
		
		//long date 사용법
		System.out.println(today.getTime());
		
		Date time = new Date(today.getTime());
		
		System.out.println(time);
		
	}
	
	
	public void testCalendar() {
		//Calendar 클래스는 추상클래스
		//직접 객체 생성하지 못함
		
		//1. getInstance()메소드를 호출해서 객체 생성하는 방법
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		
		//2. 후손 클래스인 GregorianCalendar 클래스 이용하여 객체 생성
		
		Calendar gc = new GregorianCalendar();
		
		System.out.println(gc);
						//1
		System.out.println(Calendar.YEAR);
						//2
		System.out.println(Calendar.MONTH);
						//숫자 넣어주면 해당 년도 가져옴
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH)+ 1;
		System.out.println(month);
		
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
	
		String sAmPm = (amPm == Calendar.AM)? "오전": "오후";
		
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + sAmPm + " " 
				+ hour + "시 " + min + "분 " + sec + "초");

	
	
	}
	
	public void testDateFormat() {
		
		int year = 2020;
		int month = 11;
		int day = 16;
		int hour = 15;
		int min = 20;
		int sec = 0;
		
//		Calendar c = new GregorianCalendar(year, month, day, hour, min, sec);
//		
//		System.out.println(c.getTimeInMillis());
//		
//		Date endDay = new Date(c.getTimeInMillis());
//		
//		System.out.println(endDay);
	
		
		Date endDay = new Date(new GregorianCalendar(year, month, day, hour, min, sec).getTimeInMillis());
	
		System.out.println(endDay);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분 ss초");
		
		String fmtToday = sdf.format(endDay);
		
		System.out.println(fmtToday);
	}
	
	
	public void practice() {
		//2020년 5월 15일 금요일 9시 0분 0초 <- 이런 포맷으로 출력
		String start = "2020-05-15 09:00:00";
		
		
		String[] strArr = start.split("[- :]");
		
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		int year = Integer.parseInt(strArr[0]);
		int month = Integer.parseInt(strArr[1]);
				int day = Integer.parseInt(strArr[2]);
		int hour = Integer.parseInt(strArr[3]);
		int min = Integer.parseInt(strArr[4]);
		int sec = Integer.parseInt(strArr[5]);
		
		Calendar c = new GregorianCalendar(year, month, day, hour, min, sec);
		
		System.out.println(c);
	
		Date endDay = new Date(c.getTimeInMillis());
		System.out.println(endDay);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일 h시 m분 s초");
		
		System.out.println(sdf.format(endDay));
	}
}
