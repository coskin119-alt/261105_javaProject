package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		// 자동 자료형 변환 : Auto Costing
		//  (1) byte < short < int < long
		//  (2) float < double
		// 명시적 자료형 변환  : 변수 앞에 (타입)변수
		
		// 문자를 숫자로 변환 : String -> int (예 "123" => 123)
		// 
		// 기본 8개 기본 자료형에서 클래스 타입이 존재함 => Wrapper Class
		// (1) int -> Integer
		// (2) char -> Character
		// (3) Byte, Short, Long, Float, Double, Boolean
		//
		
		String str = "123";
		
		System.out.println();	

		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber +10);
	}

}
