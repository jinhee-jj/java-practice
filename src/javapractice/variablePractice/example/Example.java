package javapractice.variablePractice.example;

import java.util.Scanner;

//[연습 3]
//		 => 메소드명 : public void example3(){}
//		 => 실행내용 : 영어 문자열 값을 키보드로 입력받아
//			각 자리의 문자를 출력
//		 => 입력예
//			문자열을 입력하시오 : apple
//		 => 출력예 (3개만 출력해 봄)
//			첫번째 문자 : a
//			두번째 문자 : p
//			세번째 문자 : p


public class Example {
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String word = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + word.charAt(0));
		System.out.println("두번째 문자 : " + word.charAt(1));
		System.out.println("세번째 문자 : " + word.charAt(2));
	}
}
