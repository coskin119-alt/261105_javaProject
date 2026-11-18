package day08;

import java.util.Scanner;

public class Method03 {
	/* 변수의 종류
	 * 
	 * 지역변수 : 메서드 안에서 사용 (일반변수)
	 * 매개변수 : 메서드에서 전달받는 변수
	 * 멤버변수 : 클래스의 속성
	 * 
	 * 
	 * 변수가 어떤것을 저장하느냐에 따라 분류
	 * 일반변수 : 값을 저장 (기본 8 자료형)
	 * 참조변수 : 주소를 저장 (그외)
	 * 
	 */

	int dan;	// 멤버변수
	
	/*
	 * 정수 하나를 입력받아 해당 정수의 구구단을 출력
	 */
	public void gooGooDan() {
		
		System.out.println("구구단 : " + dan + "단");
		System.out.println("------------------");

		for(int i=1; i<10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		System.out.println("------------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Method03 tester = new Method03();
		
		for(int i=2; i<10; i++) {
			tester.dan = i;
			tester.gooGooDan();
		}
		
//		while(true) {
//	    	System.out.print("출력할 단수를 입력하시오. (0 : 종료) > ");
//	    	int num = scan.nextInt();
//			System.out.println("------------------");
//
//			if(num == 0) break;
//			
//			tester.dan = num;
//			tester.gooGooDan();
//		}
		
		scan.close();
	}

}
