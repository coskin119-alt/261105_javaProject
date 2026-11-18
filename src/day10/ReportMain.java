package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Report Class 객체 생성 => 실행
		// 성적 산출 인원 > 3 (입력)=>
		
		// Report[] report =  new Report[count];
		// report[i] = new Report("이름", 78, 79, 80);

		Scanner scan = new Scanner(System.in);

		// 인원수 입력
    	System.out.print("전체 학생수를 입력하시오. > ");
    	int member = scan.nextInt();
		System.out.println("---------------------------------------------------");
		
		Report[] reports = new Report[member];

		// 인원수 만큼 객체 생성 
		for(int i=0; i<reports.length; i++) {
			// 학생 정보 입력
	    	System.out.print("이름 국어 영어 수학 입력하시오. > ");
	    	String 	name	= scan.next();
	    	int 	kor		= scan.nextInt();
	    	int 	eng		= scan.nextInt();
	    	int 	math	= scan.nextInt();
	
	    	// 학생 정보 입력
			reports[i] = new Report(name, kor, eng, math);
			System.out.println(reports[i]);
		}

		// 전체 학생 성적표 출력
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------");

		for(int i=0; i<reports.length; i++) {
			// 등수 계산
			for(int j=0; j<reports.length; j++) {
				if(reports[i].getAvg() < reports[j].getAvg()) {
					reports[i].setRank(reports[i].getRank()+1);
				}
			}

			// 성적표 출력
			reports[i].printReport();
		}
		System.out.println("---------------------------------------------------");
		
		scan.close();
	}
	
}
