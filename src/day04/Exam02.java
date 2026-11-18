package day04;

import java.util.Scanner;

public class Exam02 {

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

		System.out.println("--- 메뉴 ---");
		System.out.println("1 과자(2000원) | 2 라면(3000원) | 3 사탕(500원) | 4 젤리(500원) | 5 종료");
		System.out.println("-----------");

		int menu = 0;
		int[] select = new int[4];
		int[] price  = new int[] {2000, 3000, 500, 500};
		String[] item = {"과자","라면","사탕","젤리"};
		
		x:while (true) {
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
				select[menu-1]++;
				System.out.println(item[menu-1] + " 1개를 선택했습니다. " + price[menu-1] + "원");
				break;
			case 5 : 
				break x;
			default: 
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
		}
		System.out.println("----------------------------------");

		// 영수증 출력
		int sum = 0;
		for (int i = 0; i < select.length; i++) {
			if (select[i] != 0) {
				sum += price[i] * select[i];
				System.out.println(item[i] + " " + select[i] + "개 : " + (price[i] * select[i]) + "원");
			}
		}
		System.out.println("----------------------------------");
		System.out.println("총금액 : " + sum + "원    감사합니다.");
		
		
		scan.close();
	}

}
