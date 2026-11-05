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
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연령별 요금 일람표 2026년 기준");
		System.out.println("어린이 (13세이하) : 5,000원");
		System.out.println("청소년 (19세이하) : 5,000원");
		System.out.println("성인  (20세이상) : 10,000원");
		System.out.println();
		
		int base = 2026, min = 1900, max = 2026;
		
		while (true) {

			System.out.print("출생 년도를 입력하세요. (1900 ~ 2026, 0 => 종료) > ");
			int year = scanner.nextInt();

			// 종료 확인
			if (year == 0) {
				System.out.println("종료되었습니다.");
				System.out.println();
				
				break;
			}
			
			// 년도 범위 확인
			if (year < min || year > max) {
				System.out.println("입력하신 년도가 범위를 벗어 났습니다.   다시 입력하세요.");
				System.out.println();

				continue;
			}
			
			// 나이 및 요금 계산
			int age = base - year;
			if (age <= 13) {
				System.out.println("어린이 입니다.  요금은 5,000원 입니다.");
			}else if (age <= 19) {
				System.out.println("청소년 입니다.  요금은 7,000원 입니다.");
			}else {
				System.out.println("성인 입니다.  요금은 10,000원 입니다.");
			}
			System.out.println();
		}
		
		
		scanner.close();

	}

}
