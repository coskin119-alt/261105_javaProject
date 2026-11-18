package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100 범위의 랜덤수를 배열에 저장 => 출력
		// 합계, 평균, 최대, 최소 출력
		
		int arr[] = new int[10];
		
		// 랜덤 값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101); 
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------");
		
		// 합계, 평균, 최소, 최대 구하기
		int sum = 0;
		int min = arr[0];
		int max = arr[0];
		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			if (arr[i] < min) min = arr[i];
//			if (arr[i] > max) max = arr[i];
//		}

		for (int tmp : arr) {
			sum += tmp;
			if (tmp < min) min = tmp;
			if (tmp > max) max = tmp;
//			min = Math.min(tmp, min);		
//			max = Math.max(tmp, max);		
			System.out.println(tmp);
		}
		double avr = sum / (double)arr.length;
		System.out.println("------------------------------------");

		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avr);
		System.out.println("최소 = " + min);
		System.out.println("최대 = " + max);

	}

}
