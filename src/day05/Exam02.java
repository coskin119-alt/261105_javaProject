package day05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일, 성별, 나이 출력
		//String regNum1 = "990101-1234567"; // 1900년대 : 1(남) / 2(여)
		//String regNum2 = "010101-3234567"; // 2000년대 : 3(남) / 4(여)
		
		/*
		 * 생년월일 
		 * 성별
		 * 나이
		 * 		 
		 * 
		 * */

		Scanner scan = new Scanner(System.in);

		// Input
		System.out.println("yymmdd-m123456 : 1900년대 m=1(남자) / m=2(여자)");
		System.out.println("yymmdd-m123456 : 2000년대 m=3(남자) / m=4(여자)");
		System.out.println("--------------------------------------------");
		System.out.print("주민등록번호를 입력하세요 > ");
		String regString = scan.nextLine();
		System.out.println("--------------------------------------------");
		
		// 생년월일 분리, 성별코드 분리
		int year, month, day;
		int dashPos = regString.indexOf("-");
		String postString = regString.substring(0, dashPos);
		char maleChar = regString.charAt(dashPos + 1);

		// 생년월일 계산
		year = Integer.parseInt(postString.substring(0,2)) + 1900;
		month = Integer.parseInt(postString.substring(2,4));
		day = Integer.parseInt(postString.substring(4,6));
		if (maleChar == '3' || maleChar == '4' ) {
			year += 100;
		}

		// 출력
		System.out.println("생년월일 : " + year + "년" + month + "월" + day + "일생");
		System.out.println("성별 : " + ((maleChar == '1' || maleChar == '3' ) ? "남자" : "여자"));
		System.out.println("나이 : " + (2026 - year));
	
		
	    scan.close();	
		
	}

}
