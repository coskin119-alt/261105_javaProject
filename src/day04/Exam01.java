package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// Menu : 1~6 => +, -, *, /, %, 종료
		// menu > 1
		// 두 수 입력 >
		// 결과 => 2 + 3 = 5

		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("MENU : [1] +  [2] -  [3] *  [4] /  [5] %  [6] 종료");
		System.out.println();

		int menu = 0;
		while (true) {
			// 연산자 입력
			System.out.print("MENU를 선택하시오. > ");
			menu = scan.nextInt();
			
			// 잘못된 메뉴 처리
			if (menu < 1 || menu > 6) {
				System.out.println("다시 입력하세요.");
				continue;
			}
				
			// 종료 메뉴 선택
			if (menu == 6) break;
			
			// 정수 2개 입력 : 띄워쓰기로 분리
			System.out.print("정수 2개 입력하시오 > ");
			int a = scan.nextInt();
			int b = scan.nextInt();

			String result = "";
			char operator = ' ';
			
			switch (menu) {
			case 1 : // +
				operator = '+';
				result = String.valueOf(a + b);
				break;

			case 2 : // -
				operator = '-';
				result = String.valueOf(a - b);
				break;
			
			case 3 : // *
				operator = '*';
				result = String.valueOf(a * b);
				break;
			
			case 4 : // /
				operator = '/';
				if (b != 0) {
					result = String.valueOf(a / b);
				}else {
					result = "Zero 로 나눌수 없습니다.";
				}
				break;
			
			case 5 : // '%'
				operator = '%';
				if (b != 0) {
					result = String.valueOf(a % b);
				}else {
					result = "Zero 로 나눌수 없습니다.";
				}
				break;
			
			default: 
				break;
			}
			
			System.out.println("결과 : " + a + " " + operator + " " + b + " = " + result);
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("---------------------------------------");

		scan.close();
	}

}
