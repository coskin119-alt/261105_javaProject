package day02;

import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성 (0~100)
		// 각 점수룰 출력 합계, 평균, pass
		// pass 80점 이상이면 상 / 60점 이상이면 중 / 나머지는 하
		// 학생 5명

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		// Ramdom 변수 사용 2가지
		// int a = (int)(Math.random()*count)+start
		// int a = random.nextInt(count)+start
		
		for (int i = 1; i <= 5; i++) {
			// 과목별 점수 입력 : Random 정수 3개 입력
			int kor = random.nextInt(100)+0;
			int eng = random.nextInt(100)+0;
			int math = random.nextInt(100)+0;
			
			// 성적 계산
			String level = "";
			int    sum = kor + eng + math;
			double avr = (double)sum / 3;

			// 성취도 판정
			if (avr >= 80) level = "상";
			else if (avr >= 60) level = "중";
			else level = "하";
			
			// 성적표 출력
			System.out.println("성명 : 학생[" + i + "]");
			System.out.print("국어 : " + kor + "  \t");
			System.out.print("영어 : " + eng + "  \t");
			System.out.println("수학 : " + math);
			System.out.print("총점 : " + sum + "  \t");
			System.out.print("평균 : " + avr + "  \t");
			System.out.println("성취도 : " + level);

			System.out.println();

		}
		
		scan.close();
	}

}
