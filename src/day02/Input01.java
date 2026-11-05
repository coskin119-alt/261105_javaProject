package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input Class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner class : 입력받는 값의 형식 변환을 편리하게 해주는 클래스
		// 클래스 객체를 생성해야 사용할 수 있다. => new 키워드를 사용

		// 기본자료형 => 타입 변수명 = 값; 
		// 클래스 자료형 => 클래스 자료형 = new 클래스명(값);

		Scanner scan = new Scanner(System.in);
		
		// 입력을 받을때 scan.메서드
		// scan.next() : 한 문자만 입력(한단어) 공백미포함 => String
		// scan.nextLine : 여러 단어를 입력 공백포함 => String
		// scan.nextInt : 정수입력 => int
		// scan.next자료형 : 해당 자료형으로 입력 => 자료형
		
		System.out.print("이름을 입력해주세요 > ");
		String name = scan.next();
		System.out.println("이름 : " + name);
		
		// 나머지 데이터를 버리는 방법
		scan.nextLine();
		
		System.out.print("점수를 입력해주세요 > ");
		int score = scan.nextInt();
		System.out.println("점수 : " + score);
		
		// 나머지 데이터를 버리는 방법
		scan.nextLine();
		
		// 입력받은 숫자가 짝수인지 홀수인 출력
		System.out.println("타입 : " + ((score % 2) == 0 ? "짝수" : "홀수"));
		
		// char : ASCII 코드의 한글자 입력
		// scan.next().charAt(위치); => 입력받은 단어의 첫글자만 ASCII 코드로 변환 => char
		// 시작위치는 0 
		System.out.print("한글자만 입력하세요 > ");
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 글자 : " + ch);
		
		
		
		
		scan.close();
		
	}

}
