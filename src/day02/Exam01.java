package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수룰 입력받아 합계, 평균, pass(평균 60점이상) 출력
		// 입력받은 점수는 0~100 범위안에 있어야 함.
		// return; => 해당 메서드를 빠져나오는 키워드

		Scanner scan = new Scanner(System.in);
		
		// 국어 점수 입력
		System.out.print("국어 점수를 입력해주세요 > ");
		int kor = scan.nextInt();
		scan.nextLine();

		// 국어 점수 범위 판별
		if (kor < 0 || kor > 100) {
			System.out.println("점수가 잘못 입력되어 종료합니다.");
			return;
		}
		
		// 영어 점수 입력
		System.out.print("영어 점수를 입력해주세요 > ");
		int eng = scan.nextInt();
		scan.nextLine();

		// 영어 점수 범위 판별
		if (eng < 0 || eng > 100) {
			System.out.println("점수가 잘못 입력되어 종료합니다.");
			return;
		}
		
		// 수학 점수 입력
		System.out.print("수학 점수를 입력해주세요 > ");
		int math = scan.nextInt();
		scan.nextLine();

		// 수학 점수 범위 판별
		if (math < 0 || math > 100) {
			System.out.println("점수가 잘못 입력되어 종료합니다.");
			return;
		}
		
		// 합계와 평균울 구하고
		int    sum = kor + eng + math;
		double avr = (double)sum / 3;

		// 합계, 평균, 합격여부 표시
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avr);
		System.out.println(avr >= 60 ? "합격" : "불합격");

		
		
		
		scan.close();

	}

}
