package javapractice.mathPractice;

import java.util.Random;

public class MathPractice {
	public void testMath() {
		System.out.println("-7의 절대값 : " + Math.abs(-7));
		System.out.println("상수 PI : " + Math.PI);
		
		//범위 : 0.0 ~ 0.999...까지
		System.out.println("임의의 난수 : " + Math.random());
		
	}
	
	public void testRandom() {
		//1부터 100 사이의 난수 발생
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);
		
		int random2 = new Random().nextInt(100) + 1;
		System.out.println(random2);
	}
	
	public void practiceRandom() {
		//다음 범위의 랜덤 수 추출
		//0~9
		
		int random1 = (int) (Math.random()*10);
		int random2 = new Random().nextInt(10);
		System.out.println(random1);
		System.out.println(random2);
		
		//1~10							//갯수!! //시작값!!
		int random3 = (int)(Math.random() * 10) + 1;
		int random4 = new Random().nextInt(10) + 1;
		System.out.println(random3);
		System.out.println(random4);
		
		//20~35
		int random5 = (int)(Math.random() * 16) + 20;
		int random6 = new Random().nextInt(16) + 20;
		System.out.println(random5);
		System.out.println(random6);
		
		//0 또는 1
		int random7 = (int)(Math.random() * 2);
		int random8 = new Random().nextInt(2);
		System.out.println(random7);
		System.out.println(random8);
		
		//-128~127
		int random9 = (int)(Math.random() * 256) - 128;
		int random10 = new Random().nextInt(256) - 128;
		System.out.println(random9);
		System.out.println(random10);
	
	}
	
	public static void main(String[] args) {
		MathPractice practice = new MathPractice();
		practice.practiceRandom();
		
	}
}
