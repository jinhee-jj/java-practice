package javapractice.ifSwitchPractice;

import java.util.Scanner;


public class Example {

//	[문제 1]
//	 - 메소드명 : public void test1(){}
//		//국, 영, 수 세 과목(int)의 점수를 키보드로 입력받고,
//		//합계와 평균을 계산하고,
//		//세 과목의 점수와 평균을 가지고 합격 여부 처리함
//		//합격의 조건 : 세 과목의 점수가 각각 40점이상이고,
//		//			평균이 60점 이상이면 합격, 
//		//			아니면 불합격 처리함
//		//합격인 경우에는 과목별 점수와 합계, 평균을 출력하고,
//		//불합격인 경우는 "불합격" 출력함
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int avg = (korean + english + math)/3;
		
		if(korean >= 40 && english >= 40 && math >= 40) {
			if(avg >= 60) {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}	
	}

	
//	[문제 2]
//	 - switch문 사용함
//	 - 메소드명 : public void test2(){}	 
//			<ex> 화면에 출력함
//			*** 초기 메뉴 ***
//			1. 입력
//			2. 수정
//			3. 조회
//			4. 삭제
//			7. 종료
//			메뉴번호 입력 : 번호입력받음
//			=> 처리내용 : 
//				1 입력 --> "입력메뉴가 선택되었습니다."
//				2 입력 --> "수정메뉴가 선택되었습니다."
//				3 입력 --> "조회메뉴가 선택되었습니다."
//				4 입력 --> "삭제메뉴가 선택되었습니다."
//				7 입력 --> "프로그램이 종료됩니다."
//				다른값 입력시 "번호가 잘못 입력되었습니다."
//					  "다시 입력하십시오." 출력되게 함
	public void test2()	 {
		System.out.println("***초기 메뉴***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호 입력 : ");
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		switch(num) {
			case 1 : System.out.println("입력메뉴가 선택되었습니다."); break;
			case 2 : System.out.println("수정메뉴가 선택되었습니다."); break;
			case 3 : System.out.println("조회메뉴가 선택되었습니다."); break;
			case 4 : System.out.println("삭제메뉴가 선택되었습니다."); break;
			case 7 : System.out.println("프로그램이 종료됩니다."); break;
			default : System.out.println("번호가 잘못 입력되었습니다."); 
						System.out.println("다시 입력하십시오."); return;
		}
		
	}

//	[문제 3]
//	 - 메소드명 : public void test3(){}
//	 - 메소드 안 구현 내용 : 
//	  1. 정수 변수 선언
//	  2. 키보드로 부터 정수 하나 입력받음
//	  3. 입력받은 정수가 양수이면 "양수다." 출력
//	     양수가 아니면 "양수가 아니다." 출력
//	  4. main 에서 실행 테스트함.	
	
	public void test3() {
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}
	
//	[문제 4]
//	 - 메소드명 : public void test4(){}
//	 - 메소드 안 구현 내용 :
//	   1. 정수 변수 선언
//	   2. 문자열 변수 선언
//	   3. 키보드로 부터 정수를 하나 입력 받음
//		단, 양수일 때만
//	   4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열에 기록하고 출력,
//	     짝수가 아니면 "홀수다"를 문자열에 기록하고 출력함
//	   <짝수의 조건>
//		어떤 수를 2로 나눈 나머지가 0과 같으면 짝수임.
	public void test4() {
		int a;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		a = sc.nextInt();
		
		if(a > 0) {
			
			if(a % 2 == 0) {
				str = "짝수다";
			} else {
				str = "홀수다";
			}
			System.out.println(str);
		} else {
			System.out.println("양수를 입력하세요");
		}
	}

//	[문제 5]
//	 - 메소드명 : public void test5(){}
//	 - 구현할 내용 : 
//	   1. 이름(String), 나이(int), 키(double) 변수 선언
//	   2. 각 값을 키보드로 입력받아, 각 변수에 저장함
//	   3. 이름이 null이 아니면서 글자갯수가 0보다 크고, 
//		나이와 키가 양수일 때만 화면에 출력함.
//		ex>
//		이름 : 홍 길동
//		나이 : 25
//		키 : 187.5
//		확인 : 홍 길동의 나이는 25세이고, 키는 187.5 cm 이다.
	
	public void test5() {
		Scanner sc = new Scanner(System.in); 
		String name;
		int age;
		double height;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		
		if(name != null && name.length() > 0 && age > 0 && height > 0) {
			System.out.println(name + "의 나이는 " + age + "세이고, 키는 " + height + "cm 이다.");
			
		}
		
	}

//		[문제 6]
//		 - 메소드명 : public void test6(){}
//		 - 구현 내용 : 
//		   1. 두 개의 정수 변수 선언
//		   2. 키보드로 두 개의 정수를 입력받아, 단, 두 수 모두 양수일 때만
//		   3. 두 수의 합, 차, 곱, 몫을 출력함
//			ex>
//			첫번째 정수 : 25
//			두번째 정수 : 7
//			25 + 7 = 32
//			25 - 7 = 18
//			25 * 7 = 175
//			25 / 7 = 3
//			25 % 7 = 4
	public void test6() {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println(a + " + " + b + "=" + (a+b));
			System.out.println(a + " - " + b + "=" + (a-b));
			System.out.println(a + " * " + b + "=" + (a*b));
			System.out.println(a + " / " + b + "=" + (a/b));
			System.out.println(a + " % " + b + "=" + (a%b));
		}
	
	}

	
//		[문제 7]
//		 - 메소드명 : public void test7(){}
//		 - 구현 내용 : 
//		  1. 정수변수와 문자변수 선언
//		  2. 키보드로 점수를 입력받아, 정수변수에 저장
//			단, 점수는 반드시 0 이상의 값이여야 함.
//		  3. 다중 if문으로 점수가 90 이상이면 문자변수에 'A' 대입
//				80 이상 90 미만	'B'
//				70 이상 80 미만	'C'
//				60 이상 70 미만	'D'
//				60 미만		'F' 대입함
//		  4. 점수와 학점 출력 확인

	public void test7() {
		int num;
		char grade = ' ';
		 
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num > 0) {
			
			if(num > 90) {
				grade = 'A';
			} else if(num > 80) {
				grade = 'B';
			} else if(num > 70) {
				grade = 'C';
			} else if(num > 60) {
				grade = 'D';
			} else {
				grade = 'F';
				
			}
		}
		
		System.out.println("점수 : " + num);
		System.out.println("학점 : " + grade);
		
	}

	
}
