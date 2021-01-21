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
	
	// 1~100 사이의 임의의 난수를 발생시키고, 정수 한 개를 입력 받아, 
	//난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
	//난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
	//단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
	//정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
	//몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
	public void practice05() {
		int random = (int) (Math.random() * 100) + 1;
		
		int sum = 0;
		int num;
		do {
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();
			if(random > num) {
				System.out.println("입력하신 정수보다 큽니다.");
			} else if (random < num){
				System.out.println("입력하신 정수보다 작습니다.");
			} 
			sum++;
			
			
		} while(random != num);
		System.out.println("정답입니다 " + sum + "회 만에 정답을 맞추셨습니다." );
		
		
	}
	
//	2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 
//	“소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
//	단, 입력 받은 정수가 2보다 작은 경우 “잘못
//	입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
//  ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.
	public void practice06() {
		
		System.out.print("2보다 큰 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				sum += i;
			}
		}
		
		if(sum == num + 1) {
			System.out.println("소수다");
		} else {
			System.out.println("소수가 아니다");
		}
	}
	
//	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 
//	바꾸는 암호화 방식을 시저 암호라고 합니다. A를 3만큼 밀면 D가 되고, 
//	z를 1만큼 밀면 a가 됩니다. 공백문자는 변경되지 않습니다.
//	문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 
//	큰 정수 1개를 입력 받아 암호문을 작성하는 코드를 작성해보세요.
//  예) “a B z”와 4를 입력 받았다면 “e F d” 출력
//	“a B z”와 27을 입력 받았다면 “b C a” 출력
	public void practice07() {
		
		
		
		int a = 'a';
		int z = 'z';
		
		int bigA = 'A';
		int bigz = 'Z';
		
		System.out.println(a);
		System.out.println(z);
		System.out.println(bigA);
		System.out.println(bigz);
		
		
		System.out.print("알파벳 세 개 각각 띄워서 입력 :  ");
		String str = sc.nextLine();
		
		int one = str.charAt(0);
		int two = str.charAt(2);
		int three = str.charAt(4);
		
		
		System.out.print("밀 갯수 입력 : ");
		int num = sc.nextInt();
		
		char first = (char) (one + num);
		char second = (char) (two + num);
		char third = (char) (three + num);
		
		
		while(first > 122 || second > 90 || third > 122) {
			
			if(first > 122) {
				first = (char) (first - 122 + 96);
			} else if(second > 90) {
				second = (char) (second - 90 + 64);
			} else if(third > 122) {
				third = (char) (third - 122 + 96);
			}
		}
		
		System.out.println(first + " " + second + " " + third);
		
	}
	
//	받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 
//	계산하는 프로그램을 작성하세요.
//	단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력 되도록 
//	작성하고, 지폐와 동전을 구분하여 단위를 표기하세요.
	 public void practice08() {
		 
		 System.out.print("받으신 금액을 입력하세요 : ");
		 int price = sc.nextInt();
		 System.out.print("상품 가격을 입력하세요 : ");
		 int menuPrice = sc.nextInt();
		 
		 int originalChange = price - menuPrice;
		 int change = price - menuPrice;
		 int a = 50000;
		 int b = 10000;
		 int c = 5000;
		 int d = 1000;
		 int e = 500;
		 int f = 100;
		 int g = 50;
		 int h = 10;
		 
		 
		 
		 System.out.println("============================");
		 do {
			 if(change >= a) {
				 
				 int num = change / a;
				 change = change - num * a;
				 
				 System.out.println(a + "원권 지폐 " + num + "장");
			 } else if(change >= b) {
				 
				 int num2 = change / b;
				 change = change - num2 * b;
				 System.out.println(b + "원권 지폐 " + num2 + "장");
			 } else if(change >= c) {
				 
				 int num3 = change / c;
				 change = change - num3 * c;
				 System.out.println(c + "원권 지폐 " + num3 + "장");
			 
			 } else if(change >= d) {
				 
				 int num4 = change / d;
				 change = change - num4 * d;
				 System.out.println(d + "원권 지폐 " + num4 + "장");
				 
			 } else if(change >= e) {
				 
				 int num5 = change / e;
				 change = change - num5 * e;
				 System.out.println(e + "원권 동전 " + num5 + "개");
			 
			 } else if(change >= f) {
				 
				 int num6 = change / f;
				 change = change - num6 * f;
				 System.out.println(f + "원권 동전 " + num6 + "개");
			 
			 } else if(change >= g) {
				 int num7 = change / g;
				 change = change - num7 * g;
				 System.out.println(g + "원권 동전 " + num7 + "개");
			 
			 } else if(change >= h) {
				 
				 int num8 = change / h;
				 change = change - num8 * h;
				 System.out.println(h + "원권 동전" + num8 + "개");
			 }
			 
			 
		 } while(change != 0);
		 	 
		 
		 System.out.println("============================");
		 System.out.println("거스름돈 : " + originalChange + "원");
	 }
	
}
