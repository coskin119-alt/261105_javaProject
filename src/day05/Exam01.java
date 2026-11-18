package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * -- 메뉴 --
		 * 1 과자(2000원) | 2 라면(3000원) | 3 사탕(500원) | 4 젤리(500원) | 5 종료
		 * menu > 1
		 * 과자 1개를 선택했습니다.
		 * menu > 2
		 * 라면 1개를 선택했습니다.
		 * menu > 5
		 * 과자 1개 2000원
		 * 라면 1개 3000원
		 * --------------
		 * 총금액 7000원
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

		// 데이터 구조
		String menu[]  = {"과자","라면","사탕","젤리"};
		int    price[] = {2000, 3000, 500, 500};
		int    count[] = new int[menu.length];
		
		// 메뉴판 출력
		System.out.println("--- 메뉴 ---");
		for (int i= 0; i < menu.length; i++) {
			System.out.println(i + " : "+ menu[i] + " " + price[i] + "원");
		}
		System.out.println("5 : 종료");
		System.out.println("-----------");

		loop : while (true) {
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 > ");
			int inv = scan.nextInt();

			if (inv > 0 && inv < 5) {
				count[inv-1]++;
				System.out.println(menu[inv-1] + " 1개를 선택했습니다. " + price[inv-1] + "원");
			}else if (inv == 5) {
				break loop;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
//			switch(inv) {
//			case 1 : 
//			case 2 : 
//			case 3 : 
//			case 4 : 
//				count[inv-1]++;
//				System.out.println(menu[inv-1] + " 1개를 선택했습니다. " + price[inv-1] + "원");
//				break;
//			case 5 : 
//				break loop;
//			default: 
//				System.out.println("잘못된 메뉴를 선택하셨습니다.");
//				break;
//			}
		}
		System.out.println("----------------------------------");

		// 영수증 출력
		int sum = 0;
		for (int i = 0; i < menu.length; i++) {
			if (count[i] != 0) {
				int value= price[i] * count[i];
				sum += value;
				System.out.println(menu[i] + " " + count[i] + "개 : " + value + "원");
			}
		}
		System.out.println("----------------------------------");
		System.out.println("총금액 : " + sum + "원    감사합니다.");
		
		
		scan.close();
	}

}
