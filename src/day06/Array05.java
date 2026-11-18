package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100 범위 숫자를 입력
		// 합계를 출력

		int arr[] = new int[5];
		
		// 랜덤 값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101); 
		}
		
		// 합계, 평균 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("[" + i + "] = " + arr[i]);
		}
		double avr = sum / (double)arr.length;

		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avr);
	
		System.out.println(Arrays.toString(arr));

		// 향상된 for 문 : for (출력할 리스트의 자료형 임의의 변수값 : 리스트) {}
		// 원본의 리스트(arr)를 하나씩 순차적으로 임의 변수값 (tmp)에 저장후 연산
		// 리스트의 전부를 적용 (일부 적용 불가)
		// 원본 참조만 가능 (원본 변경 불가)
		sum = 0;
		for (int tmp : arr) {
			System.out.println(tmp);
			sum += tmp;
		}
		System.out.println("합계 = " + sum);
		
		
		
		
	}

}
