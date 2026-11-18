package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String Method
		/*
		 * 
		 * "ABC".toLowerCase(); 	=> String
		 * "abc".toUpperCase(); 	=> String
		 * isEmpty(), isBlank(); 	=> true / false
		 * "abc".trim(); 			=> String
		 * "abc".replace("x","y");	=> String
		 * "abc".split("");			=> String Array
		 * Integer.parseInt("num")	=> String
		 * String.valueOf(val)		=> integer
		 * 
		 * */
		
		
		
		
		// toLowerCase() / toUpperCase()
		System.out.println("JPG".toLowerCase());
		System.out.println("jpg".toUpperCase());
		
		// isEmpty() 값이 비었는지 확인 (공백도 있는것으로 간주)
		System.out.println(" ".isEmpty());
		System.out.println("".isEmpty());

		// isBlank() 값이 비었는지 확인 (공백은 비어있는것으로 간주)
		System.out.println(" ".isBlank());
		System.out.println("".isBlank());
		
		// trim() : 불필요한 공백 제거
		System.out.println("      abc              def   ".trim());
		
		// replace() : 글자를 변환
		System.out.println("2026-11-09".replace("-", "/"));
		
		// split : 특정값으로 나누기 => 배열 리턴
		String str = "apple, banana, kiwi, orange";
		String arr[] = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("1234".split("")));
		
		// 문자를 숫자로 : Integer.parseInt(num)
		String num = "123";
		int val = Integer.parseInt(num);
		System.out.println(val);
		
		// 숫자를 문자로 : String.valueOf(val)
		num = String.valueOf(val);
		System.out.println(num);
		
		
		
		
	}

}
