package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 년도를 숫자로 입력받아 어린(13), 청소년(19), 성인으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// 예 : 2017 => 9살 어린이 입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026 - 2017 => 나이  
		// 생년의 유효한 값을 1900 ~ 2026
		// 기준을 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시입력해주세요. (1900 ~ 2026)

		// 한 가족 (5명)의 입장료
		// 반복적인 생년을 입력받고 싶음, 0 => 종료
		// 반복이 종료되면 최종결제금액 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연령별 요금 일람표 2026년 기준");
		System.out.println("어린이 (13세이하) : 5,000원");
		System.out.println("청소년 (19세이하) : 5,000원");
		System.out.println("성인  (20세이상) : 10,000원");
		System.out.println();
		
		System.out.println("가족 구성원의 출생 연도를 입력하시면 입장료를 계산해드립니다.");
		System.out.println("0 : 입력 완료  /  9999 : 종료");
		System.out.println();
		
		int base = 2026, min = 1900, max = 2026;
		
		while (true) {

			int baby = 0, teen = 0, adult = 0, breakValue = 0;
			
			while (true) {

				System.out.print("출생 년도를 입력하세요. > ");
				int year = scanner.nextInt();

				// 년도 범위 확인
				if (year < min || year > max) {

					// 입력 완료, 작업 종료 조건 확인
					if (year == 0 || year == 9999) {
						breakValue = year;

						break;
					}
					
					// 입력 범위 이탈 
					System.out.println("입력하신 년도가 범위를 벗어 났습니다.   다시 입력하세요.");

					continue;
				}
				
				// 나이 및 요금 계산
				int age = base - year;
				if (age <= 13) baby++; else if (age <= 19) teen++; else adult++;
			}
			
			if (breakValue == 9999) {
				System.out.println();
				System.out.println("프로그램이 종료되었습니다.");
				System.out.println();
				break;
			}

			// 가족 요금 출력
			int payment = baby * 5000 + teen * 7000 + adult * 10000;
			System.out.println("어린이 : " + baby + "명  /  " + "청소년 : " + teen + "명  /  " + "성인 : " + adult + "명");
			System.out.println("총입장료는 " + payment + "원 입니다.");
			System.out.println();
		}
		
		
		
		
		
		
		
		scanner.close();

	}

}
