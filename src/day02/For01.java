package day02;

public class For01 {

	public static void main(String[] args) {
		// 반복문 : for, while, do while
		// for : 반복 횟수가 정해져 있을때
		// while : 반복 횟수가 정해져 있지 않을때
		// for(초기화; 조건식; 증감씩) { }
		
		// 1 ~ 5 까지 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Google 검색 python tutor > Visualize code 선택

		// 1~10 까지 중 짝수만 출력
		for (int i = 1; i <= 10; i++) {
			if ((i % 2) == 0) System.out.print(i + " ");
		}
		System.out.println();

		// 1~10 까지 합계 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
