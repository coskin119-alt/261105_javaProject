package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// Array : 배열
		// 같은 타입의 같은 의미를 가지는 변수의 집합
		// 기본 8개 자료형(기본형 변수) 빼고는 전부 클래스 자료형(참조형 변수)
		// 배열은 new 키워드로 생성
		//
		// 타입 배열형[]; => 
		// 타입[] 배열명;
		//
		// 타입[] 배열명 = new 타입[길이];
		// 생성된 배열안의 변수값은 자동으로 초기화가 이루어짐. (숫자 타입은 0, 문자타입은 null)
		//
		// int[] arr = new int[5];
		// int[] arr = new int[]{1,2,3,4,5};
		// int[] arr = {1,2,3,4,5}
		//
		// 배열의 길이는 0 이상이어야 한다. (-는 허용안됨)
		// 배열의 index는 0부터 시작한다
		// 배열[5] ndex는 0 1 2 3 4 => 마지막 index는 길이-1
		// 배열의 총길이 => length => 마지막 index는 length-1
		
		int[] arr2 = new int[]{1,2,3,4,5};	// 초기값 설정 (선언부에서만 가능)
		int[] arr3 = {10,20,30,40,50};		// 초기값 설정 (선언부에서만 가능)

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr3[0] = 100;
		
		int[] arr4 = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr4[i]= i+1;
			System.out.println(arr4[i]);
		}
		
		// Array.toString(배열)
		System.out.println(Arrays.toString(arr4));
		
		
		
	}

}
