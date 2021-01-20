package javapractice.forWhilePractice;

import java.util.Scanner;

public class ForWhilePractice {
	
	//정수를 1개 입력 받아, 1부터 입력받은 정수까지의 짝수의 합을 출력하세요
	//for문 활용
	
	private Scanner sc = new Scanner(System.in);
	
	public void practice01() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i < num; i++) {
			
			if(i % 2 == 0) {
			
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

	//1번 문제 while문으로 바꿔 출력 
	public void practice02() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		while(i < num) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
	}
	
	// 정수를 입력 받아 1부터 입력 받은 정수까지 수를 홀수와 짝수를 구분하여 홀수면 “수” 짝수면 “박”, 를 반복하여 출력 하세요.
	public void practice03() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String str = "";
		
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				str += "수";
				
			} else {
				str += "박";
			}
		}
		System.out.println(str);
	}
	
	
	//맥도날드 주문 받는 프로그램을 만들어 보세요.
	public void practice04() {
		
		char answer;
		String outPut = "================================";
		int sum = 0;
		
		do {
		System.out.println("============== Menu ==============");
		System.out.println("-------------- 버거류 --------------");
		System.out.println("1. 상하이 스파이스 치킨버거 ------ 5,500원");
		System.out.println("2. 빅맥 --------------------- 5,000원");
		System.out.println("3. 베이컨 토마토 디럭스 -------- 6,000원");
		System.out.println("--------------- 음료 -------------");
		System.out.println("4. 콜라 --------------------- 1,500원");
		System.out.println("5. 사이다 -------------------- 1,500원");
		System.out.println("6. 오렌지쥬스 ------------------ 2,000원");
		System.out.println("7. 커피 ---------------------- 1,000원");
		System.out.println("--------------- 사이드 -------------");
		System.out.println("8. 감자튀김 -------------------- 700원");
		System.out.println("9. 아이스크림 ------------------- 1,000원");
		System.out.println("==================================");

		System.out.print("주문하실 메뉴를 번호로 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("주문하실 수량을 입력하세요 : ");
		int many = sc.nextInt();
		System.out.print("추가 주문 하시겠습니까?(y/n)");
		answer = sc.next().charAt(0);
		
		String menu="";
		int price=0;
		String str = "";
		
			switch(num) {
				case 1 : menu = "상하이 스파이스 치킨 버거"; price = 5500; break;
				case 2 : menu = "빅맥"; price = 5000; break;
				case 3 : menu = "베이컨 토마토 디럭스"; price = 6000; break;
				case 4 : menu = "콜라"; price = 1500; break;
				case 5 : menu = "사이다"; price = 1500; break;
				case 6 : menu = "오렌지쥬스"; price = 2000; break;
				case 7 : menu = "커피"; price = 1000; break;
				case 8 : menu = "감자튀김"; price = 700; break;
				case 9 : menu = "아이스크림"; price = 1000; break;
				default : break;
			}
		int oneMenuSum = many * price;
		sum += oneMenuSum;
		str = menu + " - " + many + "개 : " + oneMenuSum + "원";
		
		outPut += "\n" + str;
		
		
		} while(answer == 'y');
		
		System.out.println(outPut + "\n" + "================================");
		System.out.println("total price : " + sum);
		

	}
	
	
}
