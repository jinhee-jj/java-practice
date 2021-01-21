package javapractice.forWhilePractice;

import java.util.Scanner;

public class ForWhilePractice2 {
	Scanner sc = new Scanner(System.in);
	
	

//[문제 1]
//  : 정수를 하나 입력받아, 그 수가 양수일 때만
//   입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 함
// - if문과 이중 for문 사용
// - 메소드명 : public void printStar1(){}
//	ex>
//	정수 하나 입력 : 5
//	1
//	*2
//	**3
//	***4
//	****5
//	================
//	정수 하나 입력 : -5
//	양수가 아닙니다.
//
	public void printStart1() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			
			
			for(int j = 1; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println(i);
			
		}
	}
	
//
//[문제 2]
//  : 정수를 하나 입력받아, 양수일 때와 0일때 음수일 때 각각 
//    아래와 같이 출력되게 함.
// - if문과 for문 사용
// - 메소드명 : public void printStar2(){}
//	ex>
//	정수 입력 : 5
//	*
//	**
//	***
//	****
//	*****
//	================
//	정수 입력 : -5
//	*****
//	****
//	***
//	**
//	*
//	================
//	정수 입력 : 0
//	출력 기능이 없습니다.
//
	
	public void printStar2() {
		
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
				
			}
			
		} else if(num < 0) {
			int abs = Math.abs(num);
			
			for(int i = abs; i >= 1; i--) {
				
				for(int j = i; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
		
		
	}
	
	
	
	
	
	
//
//[문제 3]
//  : 원하는 메뉴의 번호를 입력하여, 선택된 메뉴의 가격들과 수량을
//   곱하여 총 가격을 출력함.
// - 메소드명 : public void selectMenu(){}
//	ex>
//	*** 메뉴를 선택하세요 ***
//
//	햄버거 ***************
//	1. 불고기버거	3500원
//	2. 치킨버거	3200원
//	추가 ****************
//	3. 감자튀김	1000원
//	4. 치즈스틱	400원
//	5. 샐러드		2000원
//	음료수 ***************
//	6. 콜라		700원
//	7. 에이드		1200원
//	8. 커피		1000원
//	********************
//	메뉴 선택 : 1
//	불고기버거를 선택하셨습니다.
//	수량은 ? 3
//	3개 주문하셨습니다.	//계산 처리됨
//
//	추가 주문하시겠습니까?(y/n) : y 입력시 메뉴화면 반복실행됨
//	** 계산된 가격은 계속 저장되어 있음 **
//			      n 입력시 메뉴화면 종료됨
//				화면에 주문한 정보와 가격
//				출력됨
//
//	* 주문하신 정보는 다음과 같습니다. *
//	-----------------------------------------------
//	불고기버거 : 3개 - 10500원
//	감자튀김 : 2개 - 2000원
//	콜라 : 1개 - 700원
//	커피 : 1개 - 1000원
//	------------------------------------------------
//	총 가격 : 14200원
//
//
//
//
//[문제 4]
//  : 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
//   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//   단, 영문자만 입력받도록 함.
// - 메소드명 : public void countInputCharacter(){}
//	ex>
//	문자열 입력 : application
//	문자 입력 : p
//	포함된 갯수 : 2 개
//	====================
//	문자열 입력 : apple_test123
//	영문자가 아닙니다.
	
	public void countInputCharacter() {
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char oneWord = str.charAt(i);
			
			if(ch == oneWord) {
				cnt ++;
			}
			
		}
		
		System.out.print("포함된 갯수 : " + cnt);
	}

}


