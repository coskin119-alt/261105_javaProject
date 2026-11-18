package day07;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/*
		 * 전체 인원 > 5 입력 => 인원수 만큼 배열 생성
		 * 이름 국어 영어 수학 합계 평균 등수
		 * aa  89  55  77  00  00  0
		 * bb  89  55  77  00  00  0
		 * cc  89  55  77  00  00  0
		 *
		 *  printf("%.2f", 56.1234) => 소숫점 이하 2자리 표현
		 */
		
		Scanner scan = new Scanner(System.in);

    	System.out.print("전체 인원수를 입력하시오. > ");
    	int member = scan.nextInt();
		System.out.println("---------------------------------------------------");
		
		String[] name = new String[member];
		double[] avr  = new double[member];
		
		int[][] score = new int[member][5];	// 국어 영어 수학 합계 등수

		// 이름 및 성적 입력
		for(int i=0; i<name.length; i++) {
			
	    	System.out.print("이름 국어 영어 수학 입력하시오. > ");
	    	name[i] = scan.next();
	    	score[i][0] = scan.nextInt();
	    	score[i][1] = scan.nextInt();
	    	score[i][2] = scan.nextInt();
	    	score[i][3] = 0;				// 합계
	    	score[i][4] = 1;				// 등수
	    	
	    	for(int j=0; j<3; j++) score[i][3] += score[i][j];
	    	
	    	avr[i] = score[i][3] / (double)name.length; 
		}

		// 성적표 출력
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------");

		for(int i=0; i<name.length; i++) {
			// 등수 계산
			for(int j=0; j<name.length; j++) {
				if(avr[i] < avr[j]) {
					score[i][4]++;
				}
			}

			System.out.print(name[i] + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + score[i][3] + "\t");
	    	System.out.printf("%.2f", avr[i]);
	    	System.out.println("\t" + score[i][4]);
		}
		System.out.println("---------------------------------------------------");
		
		scan.close();
	}

}
